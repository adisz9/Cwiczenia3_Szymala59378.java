import java.util.Scanner;

public class Cwiczenia3zad3_Szymala {
    public static void main(String[] args) {
        //Zadanie 3
        float aSzymala;
        float bSzymala;
        float cSzymala;
        float deltaSzymala;
        float pierwiastekDeltaSzymala;
        int liczbaSwitchSzymala;
        float x1Szymala;
        float x2Szymala;
        Scanner scaner = new Scanner(System.in);

        System.out.print("\n\nPodaj wartość zmiennej 'a': ");
        do {
            aSzymala = scaner.nextFloat();
            if (aSzymala == 0) {
                System.out.print("Warość 'a' nie może być równa 0!");
                System.out.print("\nPonownie podaj wartość zmiennej 'a': ");
            }
        }while (aSzymala == 0);

        System.out.print("Podaj wartość zmiennej 'b': ");
        bSzymala = scaner.nextFloat();

        System.out.print("Podaj wartość zmiennej 'c': ");
        cSzymala = scaner.nextFloat();

        deltaSzymala = (bSzymala * bSzymala) - (4 * aSzymala * cSzymala);

        if (deltaSzymala == 0)
            liczbaSwitchSzymala = 0;
        else if (deltaSzymala > 0) {
            liczbaSwitchSzymala = 1;
        }
        else liczbaSwitchSzymala = 11;


        switch (liczbaSwitchSzymala){
            case 0: {
                x1Szymala = (-bSzymala) / (2 * aSzymala);
                System.out.print("Delta wynosi: " + deltaSzymala + ", a pierwiastek x1: " + x1Szymala);
                break;
            }
            case 1: {
                pierwiastekDeltaSzymala = (float)Math.pow(deltaSzymala, 0.5);
                x1Szymala = (-bSzymala + pierwiastekDeltaSzymala) / (2 * aSzymala);
                x2Szymala = (-bSzymala - pierwiastekDeltaSzymala) / (2 * aSzymala);
                System.out.print("\nDelta wynosi: " + deltaSzymala);
                System.out.print("\nX1 jest równe: " + x1Szymala + ", a X2 jest równe: " + x2Szymala);
                break;
            }
            default:{
                System.out.print("Równanie o podanych zmiennych nie ma rozwiązań");
                break;
            }

        }
    }
}
