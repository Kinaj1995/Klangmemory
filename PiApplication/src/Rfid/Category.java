/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rfid;

import AudioName.AFT;
import AudioPlayerText.PlayText;
import java.io.IOException;

/**
 *
 * @author a_bir + janik
 */
public class Category {

    public void switchCategoryPath() throws IOException, Exception {

        String category = "";

        RfidListener reader_category = new RfidListener();
        PlayText tts = new PlayText();

        reader_category.read();
        category = reader_category.getContent();

        if ("Kat.1".equals(category) || "Kat.2".equals(category) || "Kat.3".equals(category)) {
            System.out.println("Kategorie erfasst (category= " + category + ")");

            tts.playText("Du hast die Kategorie gewechselt", 0, 0.5f);

            Interface.init(Interface.getReadPath(), "/home/pi/pi-rfid/Sounds/" + category + "/");
            AFT.switchCategoryStrings(category);
            Thread.sleep(3000);

        } else {
        }
    }
}
