package ZadaniaRóżne.Zadanie2;

import java.util.Scanner;

public class Counting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Wprowadź liczbę ");
        int counting = sc.nextInt();
        sc.nextLine();
        System.out.println(counting);

        System.out.println("Bomba wybuchnie za: ");
//        for (int i = 0; i <= counting; i++) {
//            System.out.println(counting - i);
//        }
//
//        do {
//            System.out.println("Bomba wybuchnie za " + counting);
//            counting--;
//        }
//        while (0<= counting);

        while (0 <= counting) {
            System.out.println(counting--);
        }


        sc.close();
        System.out.println("BOOM");




    }

}
