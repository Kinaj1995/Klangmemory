/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rfid;

import AudioName.AudioFileTranslater;
import java.io.IOException;

/**
 *
 * @author janik
 */
public class Category {

    public void switchCategoryPath() throws IOException, Exception {

        String category = "";

        RfidListener reader_category = new RfidListener();

        reader_category.read();
        category = reader_category.getContent();

        if ("Kat.1".equals(category) || "Kat.2".equals(category) || "Kat.3".equals(category)) {
            System.out.println("Kategorie erfasst (category= " + category + ")");
            
            //tts.dospeak("Du hast die Kategorie geändert.");

            Interface.init(Interface.getReadPath(), "/home/pi/pi-rfid/Sounds/" + category + "/");
            AudioFileTranslater.switchCategoryStrings(category);
            Thread.sleep(3000);

        } else {
        }
    }
}
