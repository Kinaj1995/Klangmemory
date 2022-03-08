/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AudioName;

/**
 *
 * @author a_bir + janik
 */
public class AFT {

    public static String card1;
    public static String card2;
    public static String card3;
    public static String card4;
    public static String card5;
    public static String card6;
    public static String card7;
    public static String card8;
    public static String card9;
    public static String card10;
    public static String card11;
    public static String card12;

    public static void switchCategoryStrings(String category) throws InterruptedException, Exception {

        switch (category) {

            case "Kat.1":
                card1 = "Brawo, du hast die Katze gefunden";
                card2 = "Brawo, du hast den Hund gefunden";
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
                card1 = "Brawo, du hast den Helikopter gefunden";
                card2 = "Brawo, du hast das Tram gefunden";
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
                card1 = "Brawo, du hast das WC gefunden";
                card2 = "Brawo, du hast den Wecker gefunden";
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
