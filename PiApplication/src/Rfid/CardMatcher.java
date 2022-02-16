/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rfid;

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
            RfidPlayer player3 = new RfidPlayer();
            //TTS tts = new TTS();

            reader1.read();
            cardNum1 = reader1.getContent();

            if ("1.1".equals(cardNum1) || "1.2".equals(cardNum1)) {
                System.out.println("1.Karte erfasst (cardNum= " + cardNum1 + ")");
                player1.play("Audio1.wav");

                reader2.read();
                cardNum2 = reader2.getContent();
                if (("1.1".equals(cardNum2) && !cardNum2.equals(cardNum1)) || ("1.2".equals(cardNum2) && !cardNum2.equals(cardNum1))) {
                    System.out.println("2.Karte erfasst (cardNum= " + cardNum2 + ")");
                    player2.play("Audio1.wav");
                    player3.play("KorrekteKarte.wav");
                    //tts.dospeak("Super gemacht! Du hast beide Katzen gefunden");

                } else {
                    cardNum1 = "";
                    System.out.println("FalscheKarte");
                    player3.play("FalscheKarte.wav");
                }
            }

            if ("2.1".equals(cardNum1) || "2.2".equals(cardNum1)) {
                System.out.println("1.Karte erfasst (cardNum= " + cardNum1 + ")");
                player1.play("Audio2.wav");

                reader2.read();
                cardNum2 = reader2.getContent();
                if (("2.1".equals(cardNum2) && !cardNum2.equals(cardNum1)) || ("2.2".equals(cardNum2) && !cardNum2.equals(cardNum1))) {
                    System.out.println("2.Karte erfasst (cardNum= " + cardNum2 + ")");
                    player2.play("Audio2.wav");
                    player3.play("KorrekteKarte.wav");
                    //tts.dospeak("Super gemacht! Du hast beide Katzen gefunden");

                } else {
                    cardNum1 = "";
                    System.out.println("FalscheKarte");
                    player3.play("FalscheKarte.wav");
                }
            }

            if ("3.1".equals(cardNum1) || "3.2".equals(cardNum1)) {
                System.out.println("1.Karte erfasst (cardNum= " + cardNum1 + ")");
                player1.play("Audio3.wav");

                reader2.read();
                cardNum2 = reader2.getContent();
                if (("3.1".equals(cardNum2) && !cardNum2.equals(cardNum1)) || ("3.2".equals(cardNum2) && !cardNum2.equals(cardNum1))) {
                    System.out.println("2.Karte erfasst (cardNum= " + cardNum2 + ")");
                    player2.play("Audio3.wav");
                    player3.play("KorrekteKarte.wav");
                    //tts.dospeak("Super gemacht! Du hast beide Katzen gefunden");

                } else {
                    cardNum1 = "";
                    System.out.println("FalscheKarte");
                    player3.play("FalscheKarte.wav");
                }
            }

            if ("4.1".equals(cardNum1) || "4.2".equals(cardNum1)) {
                System.out.println("1.Karte erfasst (cardNum= " + cardNum1 + ")");
                player1.play("Audio4.wav");

                reader2.read();
                cardNum2 = reader2.getContent();
                if (("4.1".equals(cardNum2) && !cardNum2.equals(cardNum1)) || ("4.2".equals(cardNum2) && !cardNum2.equals(cardNum1))) {
                    System.out.println("2.Karte erfasst (cardNum= " + cardNum2 + ")");
                    player2.play("Audio4.wav");
                    player3.play("KorrekteKarte.wav");
                    //tts.dospeak("Super gemacht! Du hast beide Katzen gefunden");

                } else {
                    cardNum1 = "";
                    System.out.println("FalscheKarte");
                    player3.play("FalscheKarte.wav");
                }
            }

            if ("5.1".equals(cardNum1) || "5.2".equals(cardNum1)) {
                System.out.println("1.Karte erfasst (cardNum= " + cardNum1 + ")");
                player1.play("Audio5.wav");

                reader2.read();
                cardNum2 = reader2.getContent();
                if (("5.1".equals(cardNum2) && !cardNum2.equals(cardNum1)) || ("5.2".equals(cardNum2) && !cardNum2.equals(cardNum1))) {
                    System.out.println("2.Karte erfasst (cardNum= " + cardNum2 + ")");
                    player2.play("Audio5.wav");
                    player3.play("KorrekteKarte.wav");
                    //tts.dospeak("Super gemacht! Du hast beide Katzen gefunden");

                } else {
                    cardNum1 = "";
                    System.out.println("FalscheKarte");
                    player3.play("FalscheKarte.wav");
                }
            }

            if ("6.1".equals(cardNum1) || "6.2".equals(cardNum1)) {
                System.out.println("1.Karte erfasst (cardNum= " + cardNum1 + ")");
                player1.play("Audio6.wav");

                reader2.read();
                cardNum2 = reader2.getContent();
                if (("6.1".equals(cardNum2) && !cardNum2.equals(cardNum1)) || ("6.2".equals(cardNum2) && !cardNum2.equals(cardNum1))) {
                    System.out.println("2.Karte erfasst (cardNum= " + cardNum2 + ")");
                    player2.play("Audio6.wav");
                    player3.play("KorrekteKarte.wav");
                    //tts.dospeak("Super gemacht! Du hast beide Katzen gefunden");

                } else {
                    cardNum1 = "";
                    System.out.println("FalscheKarte");
                    player3.play("FalscheKarte.wav");
                }
            }

            if ("7.1".equals(cardNum1) || "7.2".equals(cardNum1)) {
                System.out.println("1.Karte erfasst (cardNum= " + cardNum1 + ")");
                player1.play("Audio7.wav");

                reader2.read();
                cardNum2 = reader2.getContent();
                if (("7.1".equals(cardNum2) && !cardNum2.equals(cardNum1)) || ("7.2".equals(cardNum2) && !cardNum2.equals(cardNum1))) {
                    System.out.println("2.Karte erfasst (cardNum= " + cardNum2 + ")");
                    player2.play("Audio7.wav");
                    player3.play("KorrekteKarte.wav");
                    //tts.dospeak("Super gemacht! Du hast beide Katzen gefunden");

                } else {
                    cardNum1 = "";
                    System.out.println("FalscheKarte");
                    player3.play("FalscheKarte.wav");
                }
            }

            if ("8.1".equals(cardNum1) || "8.2".equals(cardNum1)) {
                System.out.println("1.Karte erfasst (cardNum= " + cardNum1 + ")");
                player1.play("Audio8.wav");

                reader2.read();
                cardNum2 = reader2.getContent();
                if (("8.1".equals(cardNum2) && !cardNum2.equals(cardNum1)) || ("8.2".equals(cardNum2) && !cardNum2.equals(cardNum1))) {
                    System.out.println("2.Karte erfasst (cardNum= " + cardNum2 + ")");
                    player2.play("Audio8.wav");
                    player3.play("KorrekteKarte.wav");
                    //tts.dospeak("Super gemacht! Du hast beide Katzen gefunden");

                } else {
                    cardNum1 = "";
                    System.out.println("FalscheKarte");
                    player3.play("FalscheKarte.wav");
                }
            }

            if ("9.1".equals(cardNum1) || "9.2".equals(cardNum1)) {
                System.out.println("1.Karte erfasst (cardNum= " + cardNum1 + ")");
                player1.play("Audio9.wav");

                reader2.read();
                cardNum2 = reader2.getContent();
                if (("9.1".equals(cardNum2) && !cardNum2.equals(cardNum1)) || ("9.2".equals(cardNum2) && !cardNum2.equals(cardNum1))) {
                    System.out.println("2.Karte erfasst (cardNum= " + cardNum2 + ")");
                    player2.play("Audio9.wav");
                    player3.play("KorrekteKarte.wav");
                    //tts.dospeak("Super gemacht! Du hast beide Katzen gefunden");

                } else {
                    cardNum1 = "";
                    System.out.println("FalscheKarte");
                    player3.play("FalscheKarte.wav");
                }
            }

            if ("10.1".equals(cardNum1) || "10.2".equals(cardNum1)) {
                System.out.println("1.Karte erfasst (cardNum= " + cardNum1 + ")");
                player1.play("Audio10.wav");

                reader2.read();
                cardNum2 = reader2.getContent();
                if (("10.1".equals(cardNum2) && !cardNum2.equals(cardNum1)) || ("10.2".equals(cardNum2) && !cardNum2.equals(cardNum1))) {
                    System.out.println("2.Karte erfasst (cardNum= " + cardNum2 + ")");
                    player2.play("Audio10.wav");
                    player3.play("KorrekteKarte.wav");
                    //tts.dospeak("Super gemacht! Du hast beide Katzen gefunden");

                } else {
                    cardNum1 = "";
                    System.out.println("FalscheKarte");
                    player3.play("FalscheKarte.wav");
                }
            } else {
                System.out.println("Fehler");
            }

        } catch (IOException ioe) {
            Logger.getLogger(PiApplication.class.getName()).log(Level.SEVERE, null, ioe);
        }
    }
}
