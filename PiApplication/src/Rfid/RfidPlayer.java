package Rfid;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.*;
import sun.audio.*;

/**
 * This RfidWriter implements an interface between the python write file and
 * java.
 *
 * @author Sacredgamer
 */
public class RfidPlayer {
    //String pathh;

    Logger log = Logger.getLogger(RfidPlayer.class.getName());

    /**
     * Start RFID writer and wait till tag is in range.
     *
     * @param newText Text to write to the tag.
     * @throws IOException If the Interface write file was not found or is not
     * python.
     */
    /*
    public void write(String newText) throws IOException {
        evalueateText(newText);
        boolean tryAgain = true;
        log.info("Put the tag to the Reader.");
        while (tryAgain) {
            Interface.clear();

            Process p = Runtime.getRuntime().exec("python " + Interface.getPlayPath());
            BufferedWriter processInput = new BufferedWriter(new OutputStreamWriter(p.getOutputStream()));
            new Thread(new writer(processInput, newText)).start();

            BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
            tryAgain = errorEvaluation(new Scanner(in));

            p.destroy();
        }
        log.info("Written!");
    }
     */

 /*   
    public void play(String audioFileName) throws IOException {
        //evalueateText(newText);
       //pathh=this.pathh;
        boolean tryAgain = true;
        
        //log.info("ist hier durchgelaufen");
        while (tryAgain) {
            Interface.clear();

            //Process p = Runtime.getRuntime().exec("python " + Interface.getPlayPath());
            Process p = Runtime.getRuntime().exec("python /home/pi/pi-rfid/"+audioFileName+".py");
            System.out.println(p.getOutputStream().getClass());
            BufferedWriter processInput = new BufferedWriter(new OutputStreamWriter(p.getOutputStream()));
            new Thread(new writer(processInput, "Testttt")).start();
            //Thread a =new Thread(processInput,"wwww").start();
            //a.destroy();
            BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
            tryAgain = errorEvaluation(new Scanner(in));
            p.destroy();
        }
        log.info("Written!");
    }
     

    public void play(String audioFileName) {
        try {
            Clip clip = AudioSystem.getClip();
            AudioInputStream inputStream = AudioSystem.getAudioInputStream(
                    RfidPlayer.class.getResourceAsStream("/home/pi/pi-rfid/Sounds/Animals/" + audioFileName));
            clip.open(inputStream);                     
            clip.start();
        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException e) {
            System.err.println(e.getMessage());
        }
    }
     */
    public void play(String audioFileName) throws Exception {
        // open the sound file as a Java input stream
        InputStream in = new FileInputStream(Interface.getPlayPath() + audioFileName);

        // create an audiostream from the inputstream
        AudioStream audioStream = new AudioStream(in);

        // play the audio clip with the audioplayer class
        AudioPlayer.player.start(audioStream);
        Thread.sleep(5000);
        AudioPlayer.player.stop(audioStream);
    }

    private void evalueateText(String newText) {
        if (newText.length() > 48) {
            log.warning("Only the first 48 Characters will be written to the Tag.");
        }
    }

    private boolean errorEvaluation(Scanner scanner) {
        while (scanner.hasNext()) {
            if (scanner.hasNext(".*Error.*") || scanner.hasNext(".*AUTH.*")) {
                log.warning("Error while writing try again...");
                return true;
            }
            scanner.next();
        }
        return false;
    }

    private class writer implements Runnable {

        private BufferedWriter processInput;
        private String newText;

        public writer(BufferedWriter processInput, String newText) {
            this.processInput = processInput;
            this.newText = newText;
        }

        @Override
        public void run() {
            try {
                processInput.write(newText + "\n");
                processInput.flush();
            } catch (IOException ex) {
                Logger.getLogger(RfidPlayer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
