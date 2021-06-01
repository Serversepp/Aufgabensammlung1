package com.company;
import java.util.*;

public class CalculatorApp {
    public static void Calc(){
        while (true){
            float x = 0;
            System.out.printf("Sie haben die Auswahl zwischen folgenden Berechnungen:  \n" +
                    "[1] |x| \n[2] sin(x) \n[3] cos(x) \n[4] Ende der Berechnung \n" +
                    "Treffen Sie eine Auswahl 1 bis 4: ");
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            int eing = scanner.nextInt();
            if (0<eing && eing<4) {
                System.out.println("Bitte geben Sie x ein: ");
                x = scanner.nextFloat();
            }
            switch (eing){
                case 1:
                    System.out.printf("|%f|  = %f\n",x,Math.abs(x));
                    break;
                case 2:
                    System.out.printf("sin(%f) = %f\n",x, Math.sin(x));
                    break;
                case 3:
                    System.out.printf("cos(%f) = %f\n",x ,Math.cos(x));
                    break;
                case 4:
                    System.out.printf("beendet");
                    return;
                default:
                    System.out.println("Falsche Eingabe");

            }
        }
    }
}
