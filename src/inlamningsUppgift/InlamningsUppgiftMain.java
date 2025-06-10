package inlamningsUppgift;


import java.util.Scanner;



public class InlamningsUppgiftMain {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Logik logik = new Logik();

        int antalRader = 0;
        int antalTecken = 0;
        String longestword = "";
        int antalOrd = 0;
        String rad;

        System.out.println("Skriv text (skriv 'stop' för att avsluta):");

        while (true) {
            rad = scanner.nextLine();
            antalTecken =logik.teckenCount(rad);



            if (rad.equalsIgnoreCase("stop")) {
                break;
            }

            logik.setRows();
            antalRader =logik.getRows();




            logik.longestWord(rad);
            longestword =logik.getLangstaOrdet();
            antalOrd= logik.getAntalOrd();




            // antalTecken += rad.length();
        }

        System.out.println("\nAntal rader: " + antalRader);
        System.out.println("Antal tecken: " + antalTecken);
        System.out.println("Longest word: " + longestword);
        System.out.println("AntalOrd word: " + antalOrd);

        scanner.close();
    }
    }




