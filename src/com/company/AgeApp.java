package com.company;
import java.util.*;

public class AgeApp {
    public static String judge(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Alter eingeben: ");
        int alter = scanner.nextInt();
        if (alter<0) return "False input";
        else if(alter<13) return "Child";
        else if(alter<18) return "Teenager";
        else if(alter<20) return "Teenager/Adult";
        else return "Adult";
    }
}
