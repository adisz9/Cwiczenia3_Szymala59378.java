import java.util.Random;

public class Cwiczenia4zad5_Szymala {
    public static void main(String[] args) {
        //Zadanie 5
        Random rmbSzymala = new Random();
        int WygenerowanaLiczbaSzymala;
        int liczbaWylosowanychLiczbSzymala = 1;
        int najmniejszaLiczbaSzymala = 101;
        int najwiekszaLiczbaSzymala = 0;

        while (liczbaWylosowanychLiczbSzymala <= 10){
            WygenerowanaLiczbaSzymala = rmbSzymala.nextInt(1, 100);
            System.out.print("\nWylosowana liczba: " + WygenerowanaLiczbaSzymala);
            if (WygenerowanaLiczbaSzymala > najwiekszaLiczbaSzymala)
                najwiekszaLiczbaSzymala = WygenerowanaLiczbaSzymala;
            else if (WygenerowanaLiczbaSzymala < najmniejszaLiczbaSzymala) {
                najmniejszaLiczbaSzymala = WygenerowanaLiczbaSzymala;
            }
            liczbaWylosowanychLiczbSzymala ++;

        }
        System.out.print("\nNajmniejsza wygenerowana liczba to: " + najmniejszaLiczbaSzymala);
        System.out.print("\nNajwiększa wygenerowana liczba to: " + najwiekszaLiczbaSzymala);
    }
}
