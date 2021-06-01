package com.company;
import java.util.*;

public class TriangleApp {
    double a;
    double b;
    double c;

    public boolean berechnen(){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Bitte a eingeben: ");
        this.a = scanner.nextDouble();
        System.out.printf("Bitte b eingeben: ");
        this.b = scanner.nextDouble();
        System.out.printf("Bitte c eingeben: ");
        this.c = scanner.nextDouble();
        scanner.close();
        return Math.pow(Math.pow(this.a,2)+Math.pow(this.b,2), 0.5)==this.c;// Return here
    }
}
