package ZadaniaRóżne.Zadanie5;

import java.util.Random;

public class Zadanie5 {
    public static void main(String[] args) {
        Random random = new Random();

        int maxNumber = 9999;
        int number = random.nextInt(0, maxNumber);

        MEthods methods = new MEthods();
        methods.compareAndPrint(number);
        methods.isOddorEven(number);
        System.out.println("Uzupełniona do 4 cyfr to: " + methods.description(number));

    }
}

