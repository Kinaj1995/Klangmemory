/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rfid;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import marytts.modules.synthesis.Voice;
import piapplication.PiApplication;

/**
 *
 * @author janik
 */
public class CardMatcher2 {

    public void cardmatching() throws IOException, Exception {

        String cardNum1 = "";
        String cardNum2 = "";

        try {
            RfidListener reader1 = new RfidListener();
            RfidListener reader2 = new RfidListener();
            RfidPlayer player = new RfidPlayer();
            PlaySoundWAV player2 = new PlaySoundWAV();
            PlayAudio tts = new PlayAudio();
            //TTS tts = new TTS();

            cardNum1 = reader1.getContent();

            if ("".equals(cardNum1)) {
                reader1.read();
                cardNum1 = reader1.getContent();
                switch (cardNum1) {

                    case "1.1":
                    case "1.2":
                        System.out.println("1.Karte erfasst (cardNum= " + cardNum1 + ")");
                        player2.playSound("Audio1.wav");
                        Thread.sleep(5000);
                        tts.playAudio("1. Karte erfasst", 0, 0.5f);
                        break;

                    case "2.1":
                    case "2.2":
                        System.out.println("1.Karte erfasst (cardNum= " + cardNum1 + ")");
                        player2.playSound("Audio2.wav");
                        Thread.sleep(5000);
                        tts.playAudio("1. Karte erfasst", 0, 0.5f);
                        break;

                    default:
                        System.out.println("keine Audiodatei vorhanden");

                }

                if (!"".equals(cardNum1) && "".equals(cardNum2)) {
                    reader2.read();
                    cardNum2 = reader2.getContent();
                    switch (cardNum2) {

                        case "1.1":
                        case "1.2":
                            System.out.println("1.Karte erfasst (cardNum= " + cardNum1 + ")");
                            player2.playSound("Audio1.wav");
                            Thread.sleep(5000);
                            tts.playAudio("1. Karte erfasst", 0, 0.5f);
                            break;

                        case "2.1":
                        case "2.2":
                            System.out.println("1.Karte erfasst (cardNum= " + cardNum1 + ")");
                            player2.playSound("Audio2.wav");
                            Thread.sleep(5000);
                            tts.playAudio("1. Karte erfasst", 0, 0.5f);
                            break;

                        default:
                            System.out.println("keine Audiodatei vorhanden");

                    }
                    if (cardNum2.equals(cardNum1)) {
                        cardNum2 = "";
                    } else {
                        cardNum1 = "";
                        cardNum2 = "";
                        tts.playAudio("Bravo, du hast die Katzen gefunden", 0, 0.5f);

                    }
                }
            }
        } catch (IOException ioe) {
            Logger.getLogger(PiApplication.class.getName()).log(Level.SEVERE, null, ioe);
        }
    }
}
