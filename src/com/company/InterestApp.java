package com.company;
import java.util.*;

public class InterestApp {
    double anfangskapital;
    double zinssatz;
    int anlagedauer;
    double zinsertrag;
    double endkapital;

    public void Ausgabe() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Geben sie ihr Anfangskapital ein: ");
        this.anfangskapital = scanner.nextInt();
        System.out.printf("Geben sie den Zinssatz in Prozent ein: ");
        this.zinssatz = scanner.nextInt();
        System.out.printf("Geben sie die Anlagedauer ein: ");
        this.anlagedauer = scanner.nextInt();
        for (int i = 0; i < this.anlagedauer; i++) {
            zinsertrag =zinsertrag+ ((zinssatz / 100)) * anfangskapital;
        }
        endkapital = anfangskapital + zinsertrag;
        System.out.println("Endkapital: " + endkapital);
        System.out.println("zinsertrag: " + zinsertrag);
    }
}
