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
                card1 = "Bravo, du hast die Katze gefunden";
                card2 = "Bravo, du hast den Hund gefunden";
                card3 = "Bravo, du hast den Löwe gefunden";
                card4 = "Bravo, du hast das Pferd gefunden";
                card5 = "Bravo, du hast die Ente gefunden";
                card6 = "Bravo, du hast den Esel gefunden";
                card7 = "Bravo, du hast das Schwein gefunden";
                card8 = "Bravo, du hast das Schaf gefunden";
                card9 = "Brawo, du hast die Hühner gefunden";
                card10 = "Bravo, du hast die Schlange gefunden";
                card11 = "Bravo, du hast die Kuh gefunden";
                card12 = "Bravo, du hast den Affe gefunden";
                break;

            case "Kat.2":
                card1 = "Bravo, du hast den Helikopter gefunden";
                card2 = "Bravo, du hast das Tram gefunden";
                card3 = "Bravo, du hast das Flugzeug gefunden";
                card4 = "Bravo, du hast das Motorrad gefunden";
                card5 = "Bravo, du hast das Auto gefunden";
                card6 = "Bravo, du hast den Traktor gefunden";
                card7 = "Bravo, du hast die Polizei gefunden";
                card8 = "Bravo, du hast den Lastwagen gefunden";
                card9 = "Bravo, du hast die Feuerwehr gefunden";
                card10 = "Bravo, du hast das Postauto gefunden";
                card11 = "Bravo, du hast das Dampfschiff gefunden";
                card12 = "Bravo, du hast das Velo gefunden";
                break;

            case "Kat.3":
                card1 = "Bravo, du hast die WC Spühlung gefunden";
                card2 = "Bravo, du hast den Wecker gefunden";
                card3 = "Bravo, du hast das Tropfen gefunden";
                card4 = "Bravo, du hast das alte Telefon gefunden";
                card5 = "Bravo, du hast die Motorsäge gefunden";
                card6 = "Bravo, du hast den Wind gefunden";
                card7 = "Bravo, du hast den Donner gefunden";
                card8 = "Bravo, du hast die Kirchturmglocke gefunden";
                card9 = "Bravo, du hast den tropfenden Wasserhahn gefunden";
                card10 = "Bravo, du hast die Kaffeemaschine gefunden";
                card11 = "Bravo, du hast die Fliege gefunden";
                card12 = "Bravo, du hast die Waschmaschine gefunden";
                break;

            default:
                System.out.println("keine Audiodatei vorhanden");
        }

    }
}
