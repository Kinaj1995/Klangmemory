/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AudioName;

/**
 *
 * @author a_bir
 */
public class AudioFileTranslater {
    
    
    public static void switchCategoryStrings(String category) throws InterruptedException, Exception {
        
    final String card1;
    final String card2;
    final String card3;
    final String card4;
    final String card5;
    final String card6;
    final String card7;
    final String card8;
    final String card9;
    final String card10;
    final String card11;
    final String card12;

        switch (category) {

            case "Kat.1":
                card1 = "die Katzen";
                card2 = "";
                card3 = "";
                card4 = "";
                card5 = "";
                card6 = "";
                card7 = "";
                card8 = "";
                card9 = "";
                card10 = "";
                card11 = "";
                card12 = "";
                break;

            case "Kat.2":
                card1 = "";
                card2 = "";
                card3 = "";
                card4 = "";
                card5 = "";
                card6 = "";
                card7 = "";
                card8 = "";
                card9 = "";
                card10 = "";
                card11 = "";
                card12 = "";
                break; 
                
                case "Kat.3":
                card1 = "";
                card2 = "";
                card3 = "";
                card4 = "";
                card5 = "";
                card6 = "";
                card7 = "";
                card8 = "";
                card9 = "";
                card10 = "";
                card11 = "";
                card12 = "";
                break; 
                
            default:
                System.out.println("keine Audiodatei vorhanden");
        }
        
    }
}
