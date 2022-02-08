package ZadaniaRóżne.Zadanie7;

import java.util.Scanner;

public class Hospital {
    Scanner sc = new Scanner(System.in);
    final int maxPatients = 10;
    int regPatient = 0;

    Patient[] patients = new Patient[maxPatients];

    int option = 5;

    private static final int EXIT = 0;
    private static final int ADD_PATIENT = 1;
    private static final int SHOW_PATIENTS = 2;

    public void addPatient() {
        if (regPatient < maxPatients) {
            System.out.println("Podaj imię pacjenta:");
            String firstName = sc.nextLine();
            System.out.println("Podaj nazwisko pacjenta:");
            String lastName = sc.nextLine();
            System.out.println("Podaj pesel pacjenta:");
            String pesel = sc.nextLine();

            patients[regPatient] = new Patient(firstName, lastName, pesel);
            regPatient++;
        } else {
            System.out.println("Maksymalna liczba pacjentów.");
        }
    }

    public void showPatients() {
        for (int i = 0; i < regPatient; i++) {
            System.out.println(patients[i].getFirstName() + " " + patients[i].getLastName() + " "
                    + patients[i].getPesel());
        }
    }

    public void startApp() {
        while (option != EXIT) {
            System.out.println("Wprowadź opcję");
            option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case ADD_PATIENT -> addPatient();
                case SHOW_PATIENTS -> showPatients();
                case EXIT -> System.out.println("Koniec programu");
                default -> System.out.println("Niepoprawna opcja.");
            }
        }
    }
}
