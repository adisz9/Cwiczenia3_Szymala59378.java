public class Cwiczenia3zad4_Szymala {
    public static void main(String[] args) {
        //Zadanie 4
        int suma100Szymala = 0;
        for (int iSzymala = 1; iSzymala <= 100; iSzymala++) {
            if(iSzymala % 2 == 0) {
                suma100Szymala += iSzymala;
            }
        }
        System.out.print("\nSuma liczb parzystych z zakresu od 0 do 100 synosi: " + suma100Szymala);
    }
}
