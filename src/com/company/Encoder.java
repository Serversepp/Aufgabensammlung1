package com.company;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Encoder{
    public void print(int[] arr) {
        if (arr == null)
            return;
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Stelle(%d) = %d: " ,i, arr[i]);
        }
        System.out.printf("\n");
    }
    public void input (int[] arr) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte Zahlen eingeben: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();
    }

    public int[] reverse(int [] arr) {
        int[] revarr= new int[arr.length ];
        for (int i = arr.length - 1;i>=0;i--){
            revarr[revarr.length -  i -1] = arr[i];
             }
        return revarr;

    }

    public int[] encode (int[] arr){
        int[] retArray = new int[2*arr.length];
        int counter = 1;
        int idx = 0;
        for(int i = 0; i < arr.length; i++){
            if(i+1 < arr.length){
                if(arr[i] == arr[i+1]){
                    counter++;
                }
                else{
                    retArray[idx++] = counter;
                    retArray[idx++] = arr[i];
                    counter = 1;
                }
            }
            else{
                retArray[idx++] = counter;
                retArray[idx++] = arr[i];
            }
        }
        retArray = Arrays.copyOf(retArray, idx);
        return retArray;
    }

    public Integer[] encode2(int[] arr) {
        ArrayList<Integer> ret = new ArrayList<Integer>();
        int cntr= 0;
        int alt = arr[0];
        for  (int neu : arr){
            if (neu==alt){
                cntr++;
            }
            else {
                ret.add(cntr);
                ret.add(alt);
                alt=neu;
            }
        }
        return (Integer[]) ret.toArray();
    }

    public int[] decode(int[] arr) {
        int len = 0;
        int idx = 0;
        for(int i = 0; i < arr.length; i += 2) {
            len += arr[i];
        }
        int[] retArray = new int[len];
        try {
            for(int i = 0; i < arr.length; i += 2){
                int count = arr[i];
                for(int j = 0; j < count; j++) {
                    retArray[idx++] = arr[i+1]; //hier
                }
            }
            return retArray;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Falscher array");
            return arr;
        }

    }
    public boolean compare(int[] a1, int[] a2) {
        if (a2.length != a1.length) return false;
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i]) return false;
        }
        return true;
    }
}

