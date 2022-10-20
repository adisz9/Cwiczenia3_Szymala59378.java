import java.util.Scanner;

public class Cwiczenia3zad2_Szymala {
    public static void main(String[] args) {
        //Zadanie 2
        float heightSzymala;
        float weightSzymala;
        float bmiSzymala;
        Scanner scaner = new Scanner(System.in);

        System.out.print("\n\nPodaj swój wzrost (w metrach): ");
        heightSzymala = scaner.nextFloat();
        System.out.print("Podaj swoją masę ciała (w kilogramach): ");
        weightSzymala = scaner.nextFloat();

        bmiSzymala = weightSzymala / (float)Math.pow(2, heightSzymala);

        if (bmiSzymala < 16.00){
            System.out.printf("Współczynnik BMI wynosi: " + bmiSzymala + ". Jest to niedowaga.");
        }
        else if (bmiSzymala >= 16.00 && bmiSzymala <= 16.99){
            System.out.printf("Współczynnik BMI wynosi: " + bmiSzymala + ". Jest to wygłodzenie.");
        }
        else if (bmiSzymala >= 17.00 && bmiSzymala <= 18.49){
            System.out.printf("Współczynnik BMI wynosi: " + bmiSzymala + ". Jest to niedowaga.");
        }
        else if (bmiSzymala >= 18.50 && bmiSzymala <= 22.99){
            System.out.printf("Współczynnik BMI wynosi: " + bmiSzymala + ". Jest to norma norma niski przedział.");
        }
        else if (bmiSzymala >= 23.00 && bmiSzymala <= 24.99){
            System.out.printf("Współczynnik BMI wynosi: " + bmiSzymala + ". Jest to norma wysoki przedział.");
        }
        else if (bmiSzymala >= 25.00 && bmiSzymala <= 27.49){
            System.out.printf("Współczynnik BMI wynosi: " + bmiSzymala + ". Jest to nadwaga niski przedział.");
        }
        else if (bmiSzymala >= 27.50 && bmiSzymala <= 29.99){
            System.out.printf("Współczynnik BMI wynosi: " + bmiSzymala + ". Jest to nadwaga wysoki przedział.");
        }
        else if (bmiSzymala >= 30 && bmiSzymala <= 34.9){
            System.out.printf("Współczynnik BMI wynosi: " + bmiSzymala + ". Jest to otyłość I stopnia.");
        }
        else if (bmiSzymala >= 35 && bmiSzymala <= 39.9){
            System.out.printf("Współczynnik BMI wynosi: " + bmiSzymala + ". Jest to otyłość II stopnia.");
        }
        else
            System.out.printf("Współczynnik BMI wynosi: " + bmiSzymala + ". Jest to otyłość III stopnia.");

    }
}
