package piapplication;

import Rfid.*;
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
     * @param args
     * @throws javax.sound.sampled.UnsupportedAudioFileException
     * @throws javax.sound.sampled.LineUnavailableException
     */
    @SuppressWarnings({"LoggerStringConcat", "CallToPrintStackTrace"})
    public static void main(String[] args) throws UnsupportedAudioFileException, LineUnavailableException, Exception {

        boolean tryAgain = true;
        boolean b = true;
        while (b) {

            //change this to your read- and write python files
            Interface.init("/home/pi/pi-rfid/Read.py", "/home/pi/pi-rfid/Audio1.py");

            //log.info("Cardmatching:");
            CardMatcher cardmatching = new CardMatcher();
            
            cardmatching.cardmatching();

        }
    }
}
