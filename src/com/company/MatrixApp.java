package com.company;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class MatrixApp {

    public static void main() {
        double min = 0.50;
        double max = 1.40;
        String space="     ";
        String MatrixSpace="";


        Scanner scanner = new Scanner(System.in);
        System.out.printf("Geben sie die Spalten an: ");
        int n = scanner.nextInt();
        System.out.printf("Geben sie die Zeilen an: ");
        int m = scanner.nextInt();

        for (int s = 0;s<m;s++) {
            MatrixSpace = MatrixSpace+space;
        }
        double ARR1[][] = new double[n][m];
        double ARR2[][] = new double[n][m];
        double ARR3[][] = new double[n][m];

        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                ARR1[j][i] = ThreadLocalRandom.current().nextDouble(min, max);
                ARR2[j][i] = ThreadLocalRandom.current().nextDouble(min, max);
                ARR3[j][i] = ARR1[j][i] + ARR2[j][i];
            }
        }
        System.out.println("Anzahl der Spalten (n)..: "+n);
        System.out.println("Anzahl der Zeilen (m)...: "+m);
        System.out.println("Dimension Matrix = dim("+n+", "+m+")\n");

        System.out.println("Matrix A"+MatrixSpace+"Matrix B"+MatrixSpace+"Matrix C = A + B");
        for ( int j = 0; j < n; j++) {
            for ( int i = 0; i < m; i+=n) {
                for (int c =0;c<n;c++){
                    System.out.printf("%.3f ",ARR1[j][c]);
                }
                System.out.printf("|");
                for (int c =0;c<n;c++){
                    System.out.printf(" %.3f ",ARR2[j][c]);
                }
                System.out.printf("|");
                for (int c =0;c<n;c++){
                    System.out.printf(" %.3f ",ARR3[j][c]);
                }
                System.out.println();

            }
        }

    }
}