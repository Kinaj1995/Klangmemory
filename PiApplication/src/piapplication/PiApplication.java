package piapplication;

import Rfid.*;
import TTS.TTS;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 * Test class
 *
 * @author Sacredgamer
 */
public class PiApplication {

    static final Logger log = Logger.getLogger(PiApplication.class.getName());

    /**
     * This is an example class to show the functionality of the RfidListener
     * and RfidWriter
     *
     */
    @SuppressWarnings({"LoggerStringConcat", "CallToPrintStackTrace"})
    public static void main(String[] args) throws UnsupportedAudioFileException, LineUnavailableException, Exception {
        String cardNum1 = "";
        String cardNum2 = "";
        boolean tryAgain = true;
        boolean b = true;
        while (b){

        //change this to your read- and write python files
        Interface.init("/home/pi/pi-rfid/Read.py", "/home/pi/pi-rfid/Audio1.py");

        //log.info("Reader test:");
        try {
            RfidListener reader1 = new RfidListener();
            RfidListener reader2 = new RfidListener();
            RfidPlayer player1 = new RfidPlayer();
            RfidPlayer player2 = new RfidPlayer();
            TTS tts = new TTS();

            reader1.read();
            //log.info("Id: " + reader1.getId());
            cardNum1 = reader1.getContent();
            if ("1.1".equals(cardNum1) || "1.2".equals(cardNum1)) {
                System.out.println("1.Karte erfasst (cardNum= " + cardNum1 + ")");
                player1.play("Audio1.wav");

                
                    reader2.read();
                    //log.info("Id: " + reader2.getId());
                    cardNum2 = reader2.getContent();
                    if (("1.1".equals(cardNum2) && !cardNum2.equals(cardNum1)) || ("1.2".equals(cardNum2) && !cardNum2.equals(cardNum1))) {
                    System.out.println("2.Karte erfasst (cardNum= " + cardNum2 + ")");
                    player2.play("Audio1.wav");                
                    System.out.printf("**********************************************%nSuper gemacht! Du hast beide Katzen gefunden!%n**********************************************");
                    //tts.dospeak("Super gemacht! Du hast beide Katzen gefunden");
                    
                    } else {
                        System.out.println("Fehler");
                    }

                //player.read();
                //while (tryAgain) {
                //    Interface.clear();
                //    tryAgain = false;
                //Process p = Runtime.getRuntime().exec("python /home/pi/pi-rfid/Player.py");
                //    Process p = Runtime.getRuntime().exec("python " + Interface.getPlayPath());
                //     p.destroy();
                //}                System.out.println("1.Karte erfasst");
                
            } else {
                System.out.println("Fehler");  
            }
            
        } catch (IOException ioe) {
            Logger.getLogger(PiApplication.class.getName()).log(Level.SEVERE, null, ioe);
        }

        //log.info("Writer test:");
        //try {
        //    new RfidWriter().write("this_is_a_test");
        //} catch (IOException ex) {
        //    Logger.getLogger(PiApplication.class.getName()).log(Level.SEVERE, null, ex);
        //}
    }
    }
}
