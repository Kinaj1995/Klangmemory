/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rfid;

import java.util.logging.Level;
import java.util.logging.Logger;
import marytts.exceptions.MaryConfigurationException;
import marytts.exceptions.SynthesisException;

/**
 *
 * @author a_bir
 */
public class CardNumber {

    private String cardNum1 = "";
    private String cardNum2 = "";

    

    public void cardNumber(String cardNum) throws MaryConfigurationException {
        try {
            if ("".equals(cardNum1)) {
                cardNum1 = cardNum;
            }
            if (!"".equals(cardNum1) && ("".equals(cardNum2))) {
                cardNum2 = cardNum;
                if (cardNum1.equals(cardNum2)) {
                    cardNum2 = "";
                }
                if (("1.1".equals(cardNum2) && !cardNum2.equals(cardNum1)) || ("1.2".equals(cardNum2) && !cardNum2.equals(cardNum1))) {
                    PlayAudio tts = new PlayAudio();
                    Thread.sleep(5000);
                    tts.playAudio("Bravo, du hast das richtige Paar gefunden", 0, 0.5f);
                    cardNum1="";
                    cardNum2="";
                } else {
                    System.out.println("keine Audiodatei");
                }

            } else {
                System.out.println("keine Audiodatei");
            }
        } catch (SynthesisException | InterruptedException ex) {
            Logger.getLogger(CardNumber.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
