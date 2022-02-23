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
public class CardMatcher3 {

    public void cardmatching() throws IOException, Exception {

        String cardNum1 = "";
        String cardNum2 = "";
        String cardNum = "";

        try {
            RfidListener reader1 = new RfidListener();
            RfidListener reader2 = new RfidListener();
            //RfidPlayer player = new RfidPlayer();
            PlaySoundWAV player2 = new PlaySoundWAV();
            PlayAudio tts = new PlayAudio();
            CardNumber num = new CardNumber();
            //TTS tts = new TTS();

            reader1.read();
            cardNum1 = reader1.getContent();

            if ("1.1".equals(cardNum1) || "1.2".equals(cardNum1)) {
                playAudioFile(cardNum1);

                reader2.read();
                cardNum2 = reader2.getContent();
                if (("1.1".equals(cardNum2) && !cardNum2.equals(cardNum1)) || ("1.2".equals(cardNum2) && !cardNum2.equals(cardNum1))) {
                    playAudioFile(cardNum2);
                    tts.playAudio("Bravo, du hast die Katzen gefunden", 0, 0.5f);
                } else {
                    playAudioFile(cardNum2);
                    tts.playAudio("Sorry, das wahr wohl nichts", 0, 0.5f);
                }
            }
            
            if ("2.1".equals(cardNum1) || "2.2".equals(cardNum1)) {
                playAudioFile(cardNum1);

                reader2.read();
                cardNum2 = reader2.getContent();
                if (("2.1".equals(cardNum2) && !cardNum2.equals(cardNum1)) || ("2.2".equals(cardNum2) && !cardNum2.equals(cardNum1))) {
                    playAudioFile(cardNum2);
                    tts.playAudio("Bravo, du hast die Katzen gefunden", 0, 0.5f);
                } else {
                    playAudioFile(cardNum2);
                    tts.playAudio("Sorry, das wahr wohl nichts", 0, 0.5f);
                }
            }
            
        } catch (IOException ioe) {
            Logger.getLogger(PiApplication.class
                    .getName()).log(Level.SEVERE, null, ioe);
        }
    }

    public void playAudioFile(String cardNum) throws InterruptedException {
        PlaySoundWAV player2 = new PlaySoundWAV();

        switch (cardNum) {

            case "1.1":
            case "1.2":
                System.out.println("1.Karte erfasst (cardNum= " + cardNum + ")");
                player2.playSound("Audio1.wav");
                Thread.sleep(5000);
                //tts.playAudio("1. Karte erfasst", 0, 0.5f);
                //num.cardNumber(cardNum1);
                break;

            case "2.1":
            case "2.2":
                System.out.println("1.Karte erfasst (cardNum= " + cardNum + ")");
                player2.playSound("Audio2.wav");
                Thread.sleep(5000);
                //tts.playAudio("1. Karte erfasst", 0, 0.5f);
                //num.cardNumber(cardNum1);
                break;

            default:
                System.out.println("keine Audiodatei vorhanden");
        }
    }
}
