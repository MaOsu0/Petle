package ZadaniaRóżne.Zadanie4;

import java.util.Scanner;

public class ArrayFactory {

    int x;
Scanner sc = new Scanner(System.in);
    public ArrayFactory(int x) {
        this.x = x;
    }

    public int[] oneDimension() {
        int[] arrayFactories = new int[x];
        for (int i = 0; i < x; i++) {
            System.out.println("Podaj numer ");
            arrayFactories[i] = sc.nextInt();
        }
        return arrayFactories;
    }
    public int[][] twoDimension() {
        int[][] arrayFactories = new int[x][x];
        for (int i = 0; i < x; i++) {
            System.out.println("Podaj numer ");
            arrayFactories[i][i] = sc.nextInt();
        }
        return arrayFactories;
    }

    public static void main(String[] args) {
        ArrayFactory arrayFactory = new ArrayFactory(3);
        int[] array = arrayFactory.oneDimension();

    }

}
