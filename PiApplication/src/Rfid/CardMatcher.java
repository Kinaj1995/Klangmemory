/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rfid;

import AudioPlayerSound.PlaySoundWAV;
import AudioPlayerText.PlayText;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import marytts.modules.synthesis.Voice;
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
            PlaySoundWAV player = new PlaySoundWAV();
            PlayText tts = new PlayText();

            reader1.read();
            cardNum1 = reader1.getContent();

            if ("1.1".equals(cardNum1) || "1.2".equals(cardNum1)) {
                System.out.println("1.Karte erfasst (cardNum= " + cardNum1 + ")");
                player.playSound("Audio1.wav");
                Thread.sleep(5000);  

                reader2.read();
                cardNum2 = reader2.getContent();
                if (("1.1".equals(cardNum2) && !cardNum2.equals(cardNum1)) || ("1.2".equals(cardNum2) && !cardNum2.equals(cardNum1))) {
                    System.out.println("2.Karte erfasst (cardNum= " + cardNum2 + ")");
                    player.playSound("Audio1.wav");
                    Thread.sleep(5000);
                    tts.playText("Bravo, du hast die Katzen gefunden", 0, 0.5f);
                    cardNum1 = "";
                    cardNum2 = "";
                }
                if ((cardNum2.equals(cardNum1))) {
                    //Exit if-Statement
                } else {
                    System.out.println("FalscheKarte");
                    tts.playText("Sorry, das wahr wohl nichts", 0, 0.5f);
                    cardNum1 = "";
                    cardNum2 = "";
                }
            }
/*
            if ("2.1".equals(cardNum1) || "2.2".equals(cardNum1)) {
                System.out.println("1.Karte erfasst (cardNum= " + cardNum1 + ")");
                //player.play("Audio2.wav");
                //player2.playSound("Audio2.wav");
                playAudioFile(cardNum1);
                Thread.sleep(5000);
                //tts.playText("1. Karte erfasst", 0, 0.5f);

                reader2.read();
                cardNum2 = reader2.getContent();
                if (("2.1".equals(cardNum2) && !cardNum2.equals(cardNum1)) || ("2.2".equals(cardNum2) && !cardNum2.equals(cardNum1))) {
                    System.out.println("2.Karte erfasst (cardNum= " + cardNum2 + ")");
                    //player2.playSound("Audio2.wav");
                    //player.play("KorrekteKarte.wav");
                    playAudioFile(cardNum2);
                    Thread.sleep(5000);
                    tts.playText("Bravo, du hast die Hunde gefunden", 0, 0.5f);
                    //tts.dospeak("Super gemacht! Du hast beide Katzen gefunden");
                    cardNum1 = "";
                    cardNum2 = "";

                } else {
                    //cardNum1 = "";
                    System.out.println("FalscheKarte");
                    //player.play("FalscheKarte.wav");
                    playAudioFile(cardNum2);
                    Thread.sleep(5000);
                    tts.playText("Sorry, das wahr wohl nichts", 0, 0.5f);
                    cardNum1 = "";
                    cardNum2 = "";
                }
            }
*/
            /**
             * if ("3.1".equals(cardNum1) || "3.2".equals(cardNum1)) {
             * System.out.println("1.Karte erfasst (cardNum= " + cardNum1 +
             * ")"); player.play("Audio3.wav");
             *
             * reader2.read(); cardNum2 = reader2.getContent(); if
             * (("3.1".equals(cardNum2) && !cardNum2.equals(cardNum1)) ||
             * ("3.2".equals(cardNum2) && !cardNum2.equals(cardNum1))) {
             * System.out.println("2.Karte erfasst (cardNum= " + cardNum2 +
             * ")"); player.play("Audio3.wav");
             * player.play("KorrekteKarte.wav"); //tts.dospeak("Super gemacht!
             * Du hast beide Katzen gefunden");
             *
             * } else { cardNum1 = ""; System.out.println("FalscheKarte");
             * player.play("FalscheKarte.wav"); } }
             *
             * if ("4.1".equals(cardNum1) || "4.2".equals(cardNum1)) {
             * System.out.println("1.Karte erfasst (cardNum= " + cardNum1 +
             * ")"); player.play("Audio4.wav");
             *
             * reader2.read(); cardNum2 = reader2.getContent(); if
             * (("4.1".equals(cardNum2) && !cardNum2.equals(cardNum1)) ||
             * ("4.2".equals(cardNum2) && !cardNum2.equals(cardNum1))) {
             * System.out.println("2.Karte erfasst (cardNum= " + cardNum2 +
             * ")"); player.play("Audio4.wav");
             * player.play("KorrekteKarte.wav"); //tts.dospeak("Super gemacht!
             * Du hast beide Katzen gefunden");
             *
             * } else { cardNum1 = ""; System.out.println("FalscheKarte");
             * player.play("FalscheKarte.wav"); } }
             *
             * if ("5.1".equals(cardNum1) || "5.2".equals(cardNum1)) {
             * System.out.println("1.Karte erfasst (cardNum= " + cardNum1 +
             * ")"); player.play("Audio5.wav");
             *
             * reader2.read(); cardNum2 = reader2.getContent(); if
             * (("5.1".equals(cardNum2) && !cardNum2.equals(cardNum1)) ||
             * ("5.2".equals(cardNum2) && !cardNum2.equals(cardNum1))) {
             * System.out.println("2.Karte erfasst (cardNum= " + cardNum2 +
             * ")"); player.play("Audio5.wav");
             * player.play("KorrekteKarte.wav"); //tts.dospeak("Super gemacht!
             * Du hast beide Katzen gefunden");
             *
             * } else { cardNum1 = ""; System.out.println("FalscheKarte");
             * player.play("FalscheKarte.wav"); } }
             *
             * if ("6.1".equals(cardNum1) || "6.2".equals(cardNum1)) {
             * System.out.println("1.Karte erfasst (cardNum= " + cardNum1 +
             * ")"); player.play("Audio6.wav");
             *
             * reader2.read(); cardNum2 = reader2.getContent(); if
             * (("6.1".equals(cardNum2) && !cardNum2.equals(cardNum1)) ||
             * ("6.2".equals(cardNum2) && !cardNum2.equals(cardNum1))) {
             * System.out.println("2.Karte erfasst (cardNum= " + cardNum2 +
             * ")"); player.play("Audio6.wav");
             * player.play("KorrekteKarte.wav"); //tts.dospeak("Super gemacht!
             * Du hast beide Katzen gefunden");
             *
             * } else { cardNum1 = ""; System.out.println("FalscheKarte");
             * player.play("FalscheKarte.wav"); } }
             *
             * if ("7.1".equals(cardNum1) || "7.2".equals(cardNum1)) {
             * System.out.println("1.Karte erfasst (cardNum= " + cardNum1 +
             * ")"); player.play("Audio7.wav");
             *
             * reader2.read(); cardNum2 = reader2.getContent(); if
             * (("7.1".equals(cardNum2) && !cardNum2.equals(cardNum1)) ||
             * ("7.2".equals(cardNum2) && !cardNum2.equals(cardNum1))) {
             * System.out.println("2.Karte erfasst (cardNum= " + cardNum2 +
             * ")"); player.play("Audio7.wav");
             * player.play("KorrekteKarte.wav"); //tts.dospeak("Super gemacht!
             * Du hast beide Katzen gefunden");
             *
             * } else { cardNum1 = ""; System.out.println("FalscheKarte");
             * player.play("FalscheKarte.wav"); } }
             *
             * if ("8.1".equals(cardNum1) || "8.2".equals(cardNum1)) {
             * System.out.println("1.Karte erfasst (cardNum= " + cardNum1 +
             * ")"); player.play("Audio8.wav");
             *
             * reader2.read(); cardNum2 = reader2.getContent(); if
             * (("8.1".equals(cardNum2) && !cardNum2.equals(cardNum1)) ||
             * ("8.2".equals(cardNum2) && !cardNum2.equals(cardNum1))) {
             * System.out.println("2.Karte erfasst (cardNum= " + cardNum2 +
             * ")"); player.play("Audio8.wav");
             * player.play("KorrekteKarte.wav"); //tts.dospeak("Super gemacht!
             * Du hast beide Katzen gefunden");
             *
             * } else { cardNum1 = ""; System.out.println("FalscheKarte");
             * player.play("FalscheKarte.wav"); } }
             *
             * if ("9.1".equals(cardNum1) || "9.2".equals(cardNum1)) {
             * System.out.println("1.Karte erfasst (cardNum= " + cardNum1 +
             * ")"); player.play("Audio9.wav");
             *
             * reader2.read(); cardNum2 = reader2.getContent(); if
             * (("9.1".equals(cardNum2) && !cardNum2.equals(cardNum1)) ||
             * ("9.2".equals(cardNum2) && !cardNum2.equals(cardNum1))) {
             * System.out.println("2.Karte erfasst (cardNum= " + cardNum2 +
             * ")"); player.play("Audio9.wav");
             * player.play("KorrekteKarte.wav"); //tts.dospeak("Super gemacht!
             * Du hast beide Katzen gefunden");
             *
             * } else { cardNum1 = ""; System.out.println("FalscheKarte");
             * player.play("FalscheKarte.wav"); } }
             *
             * if ("10.1".equals(cardNum1) || "10.2".equals(cardNum1)) {
             * System.out.println("1.Karte erfasst (cardNum= " + cardNum1 +
             * ")"); player.play("Audio10.wav");
             *
             * reader2.read(); cardNum2 = reader2.getContent(); if
             * (("10.1".equals(cardNum2) && !cardNum2.equals(cardNum1)) ||
             * ("10.2".equals(cardNum2) && !cardNum2.equals(cardNum1))) {
             * System.out.println("2.Karte erfasst (cardNum= " + cardNum2 +
             * ")"); player.play("Audio10.wav");
             * player.play("KorrekteKarte.wav"); //tts.dospeak("Super gemacht!
             * Du hast beide Katzen gefunden");
             *
             * } else { cardNum1 = ""; System.out.println("FalscheKarte");
             * player.play("FalscheKarte.wav"); } } else {
             * System.out.println("Keine Audiokarte");
            }
             */
        } catch (IOException ioe) {
            Logger.getLogger(PiApplication.class.getName()).log(Level.SEVERE, null, ioe);
        }
    }

    /*
    public void playAudioFile(String cardNum) throws InterruptedException, Exception {
        PlaySoundWAV player = new PlaySoundWAV();

        switch (cardNum) {

            case "1.1":
            case "1.2":
                System.out.println("1.Karte erfasst (cardNum= " + cardNum + ")");
                player.playSound("Audio1.wav");
                break;

            case "2.1":
            case "2.2":
                System.out.println("1.Karte erfasst (cardNum= " + cardNum + ")");
                player.playSound("Audio2.wav");
                break;

            default:
                System.out.println("keine Audiodatei vorhanden");
        }
    }
     */
}
