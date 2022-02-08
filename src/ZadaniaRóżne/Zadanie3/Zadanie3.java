package ZadaniaRóżne.Zadanie3;

import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {

//        counting();
        printCharPerLine();

    }





    static Scanner sc = new Scanner(System.in);


    static void counting() {
        System.out.println("podaj liczbę dodatnią");
        int getNumber = sc.nextInt();
        if (getNumber < 0) {
            System.out.println("Liczba nie jest dodatnia");
        }
//        for (int i = 0; i <= getNumber; i++) {
//            System.out.println(i);
//        }
        int index = 0;
        while (getNumber >= index) {
            System.out.println(index++);
        }
    }

    static void printCharPerLine(){
        System.out.println("podaj liczbę");
        int n = sc.nextInt();
        for (int i = n; n > 0; n--) {
            System.out.println(n + ",");
        }
    }
}



