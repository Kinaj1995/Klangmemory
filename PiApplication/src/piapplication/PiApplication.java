package piapplication;

import Rfid.*;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    public static void main(String[] args) {
        String cardNum = "";
        boolean tryAgain = true;
        boolean b = true;
        while (b){

        //change this to your read- and write python files
        Interface.init("/home/pi/pi-rfid/Read.py", "/home/pi/pi-rfid/Audio1.py");

        log.info("Reader test:");
        try {
            RfidListener reader = new RfidListener();
            RfidPlayer player = new RfidPlayer();
            reader.read();


            log.info("Id: " + reader.getId());
            cardNum = reader.getContent();
            if ("1.1".equals(cardNum) || "1.2".equals(cardNum)) {
                System.out.println("volltreffer");
                player.play("Audio1");
                //player.read();
                //while (tryAgain) {
                //    Interface.clear();
                //    tryAgain = false;
                //Process p = Runtime.getRuntime().exec("python /home/pi/pi-rfid/Player.py");
                //    Process p = Runtime.getRuntime().exec("python " + Interface.getPlayPath());
                //     p.destroy();
                //}
                
            } else {
                System.out.println("Fehler");
                
            }
            
            log.info("Content: " + reader.getContent());
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
