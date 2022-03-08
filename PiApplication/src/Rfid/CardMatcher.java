/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rfid;

import AudioName.AFT;
import AudioPlayerSound.PlaySoundWAV;
import AudioPlayerText.PlayText;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import marytts.modules.synthesis.Voice;
import piapplication.PiApplication;

/**
 *
 * @author a_bir + janik
 */
public class CardMatcher {

    public void cardmatching() throws IOException, Exception {

        String cardNum1 = "";
        String cardNum2 = "";
        String wrongCard = "Sorry, das wahr wohl nichts";

        try {
            RfidListener reader1 = new RfidListener();
            RfidListener reader2 = new RfidListener();
            PlayText tts = new PlayText();

            reader1.read();
            cardNum1 = reader1.getContent();

            /**
             * Card 1
             */
            if ("1.1".equals(cardNum1) || "1.2".equals(cardNum1)) {
                playAudioFile(cardNum1);
                Thread.sleep(5000);

                reader2.read();
                cardNum2 = reader2.getContent();
                playAudioFile(cardNum2);
                Thread.sleep(5000);

                if (("1.1".equals(cardNum2) && !cardNum2.equals(cardNum1)) || ("1.2".equals(cardNum2) && !cardNum2.equals(cardNum1))) {
                    tts.playText(AFT.card1, 0, 0.5f);
                    cardNum1 = "";
                    cardNum2 = "";
                }
                if ((cardNum2.equals(cardNum1))) {
                    //Exit if-Statement
                } else {
                    System.out.println(wrongCard);
                    tts.playText(wrongCard, 0, 0.5f);
                    cardNum1 = "";
                    cardNum2 = "";
                }
            }

            /**
             * Card 2
             */
            if ("2.1".equals(cardNum1) || "2.2".equals(cardNum1)) {
                playAudioFile(cardNum1);
                Thread.sleep(5000);

                reader2.read();
                cardNum2 = reader2.getContent();
                playAudioFile(cardNum2);
                Thread.sleep(5000);

                if (("2.1".equals(cardNum2) && !cardNum2.equals(cardNum1)) || ("2.2".equals(cardNum2) && !cardNum2.equals(cardNum1))) {
                    tts.playText(AFT.card2, 0, 0.5f);
                    cardNum1 = "";
                    cardNum2 = "";
                }
                if ((cardNum2.equals(cardNum1))) {
                    //Exit if-Statement
                } else {
                    tts.playText(wrongCard, 0, 0.5f);
                    cardNum1 = "";
                    cardNum2 = "";
                }
            }            
            
            
            

        } catch (IOException ioe) {
            Logger.getLogger(PiApplication.class.getName()).log(Level.SEVERE, null, ioe);
        }
    }

    public void playAudioFile(String cardNum) throws InterruptedException, Exception {
        PlaySoundWAV player = new PlaySoundWAV();

        switch (cardNum) {

            case "1.1":
            case "1.2":
                player.playSound("Audio1.wav");
                break;

            case "2.1":
            case "2.2":
                player.playSound("Audio2.wav");
                break;

            case "3.1":
            case "3.2":
                player.playSound("Audio3.wav");
                break;

            case "4.1":
            case "4.2":
                player.playSound("Audio4.wav");
                break;

            case "5.1":
            case "5.2":
                player.playSound("Audio5.wav");
                break;

            case "6.1":
            case "6.2":
                player.playSound("Audio6.wav");
                break;

            case "7.1":
            case "7.2":
                player.playSound("Audio7.wav");
                break;

            case "8.1":
            case "8.2":
                player.playSound("Audio8.wav");
                break;

            case "9.1":
            case "9.2":
                player.playSound("Audio9.wav");
                break;

            case "10.1":
            case "10.2":
                player.playSound("Audio10.wav");
                break;

            case "11.1":
            case "11.2":
                player.playSound("Audio11.wav");
                break;

            case "12.1":
            case "12.2":
                player.playSound("Audio12.wav");
                break;

            default:
                System.out.println("keine Audiodatei vorhanden");
        }
    }
}
