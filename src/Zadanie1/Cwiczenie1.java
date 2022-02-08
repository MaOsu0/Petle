package Zadanie1;

import java.util.Scanner;

public class Cwiczenie1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Wprowadź ile liczb chcesz dodawać");
        int numberOfDigits = scanner.nextInt();
        int sum = 0;

        do{
            System.out.println("Podaj kolejną liczbę która będzie sumowana");
            sum = scanner.nextInt() + sum;
            numberOfDigits--;
        }
        while(numberOfDigits>0);
        System.out.println("Koniec pętli");
        System.out.println("suma na koniec to " + sum);

        scanner.close();



    }
}
