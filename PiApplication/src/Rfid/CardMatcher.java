/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rfid;

import TTS.TTS;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import piapplication.PiApplication;

/**
 *
 * @author janik
 */
public class CardMatcher {

    public void cardmatching() throws IOException, Exception {

        String cardNum1 = "";
        String cardNum2 = "";

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

            } else {
                System.out.println("Fehler");
            }

        } catch (IOException ioe) {
            Logger.getLogger(PiApplication.class.getName()).log(Level.SEVERE, null, ioe);
        }
    }
}
