package com.company;

import java.util.Scanner;

public class RectangleApp {
    double a;
    double b;
    double umfang;
    double flaeche;
    boolean quadrat = false;

    public void Ausgabe(){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("a:");
        this.a = scanner.nextDouble();
        System.out.printf("b:");
        this.b = scanner.nextDouble();

        umfang = 2*a+2*b;
        flaeche = a*b;
        if (a==b){
            quadrat=true;
        }
        System.out.printf("umfang:%.2f \n ", umfang);
        System.out.printf("flaeche:%.2f \n ", flaeche);
        System.out.println("quadratisch: "+quadrat);



    }



}
