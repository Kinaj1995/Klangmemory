/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
        long idNum = 0;
        boolean tryAgain = true;

        //change this to your read- and write python files
        Interface.init("/home/pi/pi-rfid/Read.py", "/home/pi/pi-rfid/Player.py");

        log.info("Reader test:");
        try {
            RfidListener reader = new RfidListener();
            RfidPlayer2 player = new RfidPlayer2();
            reader.read();


            log.info("Id: " + reader.getId());
            idNum = reader.getId();
            if (idNum == 770104560442L) {
                System.out.println("volltreffer");
                player.play("Player");
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
