import java.util.Scanner;

public class FindStørsteTal {
    public int findMindsteTal(int[] tal) {

        int mindsteTal = 0;

        for (int i = 0; 9 >= i; i++) {
            if (i == 1) {
                if (tal[i - 1] > tal[i]) {
                    mindsteTal = tal[i];
                } else if (tal[i] > tal[i - 1]) {
                    mindsteTal = tal[i - 1];
                } else {
                    mindsteTal = tal[i];
                }
            }
            if (i > 1) {
                if (mindsteTal > tal[i]) {
                    mindsteTal = tal[i];
                }
            }
            //Skal bare compare et tal med dem allesammen, hvis en er større end den anden udelukker det resten af de andre,
            // så hvis der er et tal, 0, fra array. Skal den bare gå igennem allesammen og tjekke om den er større end dem, en af gangen.
        }
        return mindsteTal;

    }

    //Finder det største tal.
    public int findStørsteTal(int[] tal) {

        int størsteTal = 0;
        for (int i = 0; 9 >= i; i++) {
            //Venter til at i == 1, da der skal være to tal til at man kan sammenligne.
            if (i == 1) {
                //Findet ud af hvilket tal er størst, og assigner det til størsteTal.
                if (tal[i - 1] > tal[i]) {
                    størsteTal = tal[i - 1];
                } else if (tal[i] > tal[i - 1]) {
                    størsteTal = tal[i];
                } else {
                    størsteTal = tal[i];
                }
            }
            //Efter 2 "runder", vil programmet kun compare med andre tal, hvis de er større, bliver den erstattet, hvis ikke, bliver den blot ignoreret.
            if (i > 1) {
                if (størsteTal < tal[i]) {
                    størsteTal = tal[i];
                }
            }
            //Skal bare compare et tal med dem allesammen, hvis en er større end den anden udelukker det resten af de andre,
            // så hvis der er et tal, 0, fra array. Skal den bare gå igennem allesammen og tjekke om den er større end dem.
        }
        return størsteTal;

    }


    public static void main(String[] args) {

        FindStørsteTal obj = new FindStørsteTal();

        Scanner sc = new Scanner(System.in);

        int[] tal;

        tal = new int[10];

        System.out.println("Giv mig 10 tal, og find gennemsnittet.");
        double total = 0;
        final int FINDGENNEMSNIT = 5;

        for (int i = 0; 9 >= i; i++) {
            tal[i] = sc.nextInt();
            //System.out.println(tal[i]); //Kommenteret ud, da det bruges til debugging.
            total += tal[i];
        }
        System.out.println("Totalen for de 10 tal er : " + total);
        double gennemsnit = total / FINDGENNEMSNIT;
        System.out.println("Gennemsnittet for de 10 tal er : " + gennemsnit);

        System.out.println("Det største tal er: " + obj.findStørsteTal(tal));
        System.out.println("Det mindste tal er: " + obj.findMindsteTal(tal));


    }
}
