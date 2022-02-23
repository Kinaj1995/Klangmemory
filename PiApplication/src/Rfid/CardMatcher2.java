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

        //String cardNum1 = "";
        //String cardNum2 = "";
        String cardNum = "";

        RfidListener reader1 = new RfidListener();
        //RfidListener reader2 = new RfidListener();
        //RfidPlayer player = new RfidPlayer();
        PlaySoundWAV player2 = new PlaySoundWAV();
        //PlayAudio tts = new PlayAudio();
        CardNumber num = new CardNumber();
        //TTS tts = new TTS();

        cardNum = reader1.getContent();

        if ("".equals(cardNum)) {
            reader1.read();
            cardNum = reader1.getContent();
            switch (cardNum) {

                case "1.1":
                case "1.2":
                    System.out.println("1.Karte erfasst (cardNum= " + cardNum + ")");
                    player2.playSound("Audio1.wav");
                    Thread.sleep(5000);
                    //tts.playAudio("1. Karte erfasst", 0, 0.5f);
                    num.cardNumber(cardNum);
                    break;

                case "2.1":
                case "2.2":
                    System.out.println("1.Karte erfasst (cardNum= " + cardNum + ")");
                    player2.playSound("Audio2.wav");
                    Thread.sleep(5000);
                    //tts.playAudio("1. Karte erfasst", 0, 0.5f);
                    num.cardNumber(cardNum);
                    break;

                default:
                    System.out.println("keine Audiodatei vorhanden");
            }
        }
    }
}
