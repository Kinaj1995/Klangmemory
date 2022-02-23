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
public class CardMatcher {

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

            reader1.read();
            cardNum1 = reader1.getContent();

            if ("1.1".equals(cardNum1) || "1.2".equals(cardNum1)) {
                System.out.println("1.Karte erfasst (cardNum= " + cardNum1 + ")");
                //player.play("Audio1.wav");
                player2.playSound("Audio1.wav");
                //Thread.sleep(5000);
                tts.playAudio("1. Karte erfasst", 0, 0.5f);
                //Thread.sleep(5500);
                //test.playAudio("Bravo, du hast die Katze gefunden",0,0.5f);

                reader2.read();
                cardNum2 = reader2.getContent();
                if (("1.1".equals(cardNum2) && !cardNum2.equals(cardNum1)) || ("1.2".equals(cardNum2) && !cardNum2.equals(cardNum1))) {
                    System.out.println("2.Karte erfasst (cardNum= " + cardNum2 + ")");
                    //player.play("Audio1.wav");
                    //player.play("KorrekteKarte.wav");
                    player2.playSound("Audio1.wav");
                    Thread.sleep(5000);
                    tts.playAudio("Bravo, du hast die Katzen gefunden", 0, 0.5f);
                    //tts.dospeak("Super gemacht! Du hast beide Katzen gefunden");
                    cardNum1="";
                    cardNum2="";

                } else {
                    //cardNum1 = "";
                    System.out.println("FalscheKarte");
                    Thread.sleep(5000);
                    tts.playAudio("Sorry, das wahr wohl nichts", 0, 0.5f);
                    //player.play("FalscheKarte.wav");
                    cardNum1="";
                    cardNum2="";
                }
            }

            if ("2.1".equals(cardNum1) || "2.2".equals(cardNum1)) {
                System.out.println("1.Karte erfasst (cardNum= " + cardNum1 + ")");
                //player.play("Audio2.wav");
                 player2.playSound("Audio2.wav");
                 tts.playAudio("1. Karte erfasst", 0, 0.5f);
                 
                reader2.read();
                cardNum2 = reader2.getContent();
                if (("2.1".equals(cardNum2) && !cardNum2.equals(cardNum1)) || ("2.2".equals(cardNum2) && !cardNum2.equals(cardNum1))) {
                    System.out.println("2.Karte erfasst (cardNum= " + cardNum2 + ")");
                    player2.playSound("Audio2.wav");
                    //player.play("KorrekteKarte.wav");
                    Thread.sleep(5000);
                    tts.playAudio("Bravo, du hast die Hunde gefunden", 0, 0.5f);
                    //tts.dospeak("Super gemacht! Du hast beide Katzen gefunden");
                    cardNum1="";
                    cardNum2="";

                } else {
                    //cardNum1 = "";
                    System.out.println("FalscheKarte");
                    //player.play("FalscheKarte.wav");
                    Thread.sleep(5000);
                    tts.playAudio("Sorry, das wahr wohl nichts", 0, 0.5f);
                    cardNum1="";
                    cardNum2="";
                }
            }

            if ("3.1".equals(cardNum1) || "3.2".equals(cardNum1)) {
                System.out.println("1.Karte erfasst (cardNum= " + cardNum1 + ")");
                player.play("Audio3.wav");

                reader2.read();
                cardNum2 = reader2.getContent();
                if (("3.1".equals(cardNum2) && !cardNum2.equals(cardNum1)) || ("3.2".equals(cardNum2) && !cardNum2.equals(cardNum1))) {
                    System.out.println("2.Karte erfasst (cardNum= " + cardNum2 + ")");
                    player.play("Audio3.wav");
                    player.play("KorrekteKarte.wav");
                    //tts.dospeak("Super gemacht! Du hast beide Katzen gefunden");

                } else {
                    cardNum1 = "";
                    System.out.println("FalscheKarte");
                    player.play("FalscheKarte.wav");
                }
            }

            if ("4.1".equals(cardNum1) || "4.2".equals(cardNum1)) {
                System.out.println("1.Karte erfasst (cardNum= " + cardNum1 + ")");
                player.play("Audio4.wav");

                reader2.read();
                cardNum2 = reader2.getContent();
                if (("4.1".equals(cardNum2) && !cardNum2.equals(cardNum1)) || ("4.2".equals(cardNum2) && !cardNum2.equals(cardNum1))) {
                    System.out.println("2.Karte erfasst (cardNum= " + cardNum2 + ")");
                    player.play("Audio4.wav");
                    player.play("KorrekteKarte.wav");
                    //tts.dospeak("Super gemacht! Du hast beide Katzen gefunden");

                } else {
                    cardNum1 = "";
                    System.out.println("FalscheKarte");
                    player.play("FalscheKarte.wav");
                }
            }

            if ("5.1".equals(cardNum1) || "5.2".equals(cardNum1)) {
                System.out.println("1.Karte erfasst (cardNum= " + cardNum1 + ")");
                player.play("Audio5.wav");

                reader2.read();
                cardNum2 = reader2.getContent();
                if (("5.1".equals(cardNum2) && !cardNum2.equals(cardNum1)) || ("5.2".equals(cardNum2) && !cardNum2.equals(cardNum1))) {
                    System.out.println("2.Karte erfasst (cardNum= " + cardNum2 + ")");
                    player.play("Audio5.wav");
                    player.play("KorrekteKarte.wav");
                    //tts.dospeak("Super gemacht! Du hast beide Katzen gefunden");

                } else {
                    cardNum1 = "";
                    System.out.println("FalscheKarte");
                    player.play("FalscheKarte.wav");
                }
            }

            if ("6.1".equals(cardNum1) || "6.2".equals(cardNum1)) {
                System.out.println("1.Karte erfasst (cardNum= " + cardNum1 + ")");
                player.play("Audio6.wav");

                reader2.read();
                cardNum2 = reader2.getContent();
                if (("6.1".equals(cardNum2) && !cardNum2.equals(cardNum1)) || ("6.2".equals(cardNum2) && !cardNum2.equals(cardNum1))) {
                    System.out.println("2.Karte erfasst (cardNum= " + cardNum2 + ")");
                    player.play("Audio6.wav");
                    player.play("KorrekteKarte.wav");
                    //tts.dospeak("Super gemacht! Du hast beide Katzen gefunden");

                } else {
                    cardNum1 = "";
                    System.out.println("FalscheKarte");
                    player.play("FalscheKarte.wav");
                }
            }

            if ("7.1".equals(cardNum1) || "7.2".equals(cardNum1)) {
                System.out.println("1.Karte erfasst (cardNum= " + cardNum1 + ")");
                player.play("Audio7.wav");

                reader2.read();
                cardNum2 = reader2.getContent();
                if (("7.1".equals(cardNum2) && !cardNum2.equals(cardNum1)) || ("7.2".equals(cardNum2) && !cardNum2.equals(cardNum1))) {
                    System.out.println("2.Karte erfasst (cardNum= " + cardNum2 + ")");
                    player.play("Audio7.wav");
                    player.play("KorrekteKarte.wav");
                    //tts.dospeak("Super gemacht! Du hast beide Katzen gefunden");

                } else {
                    cardNum1 = "";
                    System.out.println("FalscheKarte");
                    player.play("FalscheKarte.wav");
                }
            }

            if ("8.1".equals(cardNum1) || "8.2".equals(cardNum1)) {
                System.out.println("1.Karte erfasst (cardNum= " + cardNum1 + ")");
                player.play("Audio8.wav");

                reader2.read();
                cardNum2 = reader2.getContent();
                if (("8.1".equals(cardNum2) && !cardNum2.equals(cardNum1)) || ("8.2".equals(cardNum2) && !cardNum2.equals(cardNum1))) {
                    System.out.println("2.Karte erfasst (cardNum= " + cardNum2 + ")");
                    player.play("Audio8.wav");
                    player.play("KorrekteKarte.wav");
                    //tts.dospeak("Super gemacht! Du hast beide Katzen gefunden");

                } else {
                    cardNum1 = "";
                    System.out.println("FalscheKarte");
                    player.play("FalscheKarte.wav");
                }
            }

            if ("9.1".equals(cardNum1) || "9.2".equals(cardNum1)) {
                System.out.println("1.Karte erfasst (cardNum= " + cardNum1 + ")");
                player.play("Audio9.wav");

                reader2.read();
                cardNum2 = reader2.getContent();
                if (("9.1".equals(cardNum2) && !cardNum2.equals(cardNum1)) || ("9.2".equals(cardNum2) && !cardNum2.equals(cardNum1))) {
                    System.out.println("2.Karte erfasst (cardNum= " + cardNum2 + ")");
                    player.play("Audio9.wav");
                    player.play("KorrekteKarte.wav");
                    //tts.dospeak("Super gemacht! Du hast beide Katzen gefunden");

                } else {
                    cardNum1 = "";
                    System.out.println("FalscheKarte");
                    player.play("FalscheKarte.wav");
                }
            }

            if ("10.1".equals(cardNum1) || "10.2".equals(cardNum1)) {
                System.out.println("1.Karte erfasst (cardNum= " + cardNum1 + ")");
                player.play("Audio10.wav");

                reader2.read();
                cardNum2 = reader2.getContent();
                if (("10.1".equals(cardNum2) && !cardNum2.equals(cardNum1)) || ("10.2".equals(cardNum2) && !cardNum2.equals(cardNum1))) {
                    System.out.println("2.Karte erfasst (cardNum= " + cardNum2 + ")");
                    player.play("Audio10.wav");
                    player.play("KorrekteKarte.wav");
                    //tts.dospeak("Super gemacht! Du hast beide Katzen gefunden");

                } else {
                    cardNum1 = "";
                    System.out.println("FalscheKarte");
                    player.play("FalscheKarte.wav");
                }
            } else {
                System.out.println("Keine Audiokarte");
            }

        } catch (IOException ioe) {
            Logger.getLogger(PiApplication.class.getName()).log(Level.SEVERE, null, ioe);
        }
    }
}
