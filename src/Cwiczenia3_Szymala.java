import java.io.Console;
import java.util.Random;
import java.util.Scanner;

public class Cwiczenia3_Szymala {
    public static void main(String[] args) {
        //Zadanie 1
        float firsNumberSzymala;
        float secondNumberSzymala;
        float sumaSzymala;
        float roznicaSzymala;
        float iloczynSzymala;
        float ilorazSzymala;

        Scanner scaner = new Scanner(System.in);
        System.out.print("Podaj pierwszą liczbę: ");
        firsNumberSzymala = scaner.nextFloat();
        System.out.print("Podaj drugą liczbę: ");
        secondNumberSzymala = scaner.nextFloat();

        sumaSzymala = firsNumberSzymala + secondNumberSzymala;
        System.out.printf("Otrzymana suma liczb: '%5.2f'%n", sumaSzymala);

        roznicaSzymala = firsNumberSzymala - secondNumberSzymala;
        System.out.printf("Otrzymana różnica liczb: '%5.2f'%n", roznicaSzymala);

        iloczynSzymala = firsNumberSzymala * secondNumberSzymala;
        System.out.printf("Otrzymany iloczyn liczb: '%5.2f'%n", iloczynSzymala);

        ilorazSzymala = firsNumberSzymala / secondNumberSzymala;
        System.out.printf("Otrzymany iloraz liczb: '%5.2f'%n", ilorazSzymala);


    }
}
