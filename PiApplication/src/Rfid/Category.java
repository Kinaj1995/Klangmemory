/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rfid;

import java.io.IOException;

/**
 *
 * @author janik
 */
public class Category {

    public void switchCategory() throws IOException, Exception {
        
        String category = "";

        RfidListener reader_category = new RfidListener();

        reader_category.read();
        category = reader_category.getContent();

        Interface.init(category, "/home/pi/pi-rfid/Sounds/" + category + "/");
    }
}
