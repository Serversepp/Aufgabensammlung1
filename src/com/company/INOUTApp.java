package com.company;
import java.util.*;

public class INOUTApp {
    String Vorname;
    String Wohnort;
    int Alter;


    public INOUTApp(){
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Bitte Namen eingeben: ");
        this.Vorname = scanner.nextLine();
        System.out.printf("Bitte Wohnort eingeben: ");
        this.Wohnort = scanner.nextLine();
        System.out.printf("Bitte Alter eingeben: ");
        this.Alter = scanner.nextInt();

        scanner.close();
    }

    public  void Ausgabe(){
        System.out.println(this.Vorname);
        System.out.println(this.Wohnort);
        System.out.println(this.Alter);
    }


}
