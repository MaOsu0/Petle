package ZadaniaRóżne.Zadanie1;

public class Area {
    public static void main(String[] args) {
        Worker[] pracownicy = new Worker[3];

        String[] imiona = {"Wlodek", "Staszek", "Lukasz"};
        String[] nazwiska = {"Zieba", "Kowalski", "Zietek"};
        int[] wiek = {45, 34, 56};

        for(int i = 0; i < pracownicy.length; i++) {
            pracownicy[i] = new Worker();
            pracownicy[i].imie = imiona[i];
            pracownicy[i].nazwisko = nazwiska[i];
            pracownicy[i].wiek = wiek[i];
        }


        for (int i = 0; i < pracownicy.length; i++)
            System.out.println(pracownicy[i].imie+" "+pracownicy[i].nazwisko+", "+pracownicy[i].wiek+" lat");
    }
}

