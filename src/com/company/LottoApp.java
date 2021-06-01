package com.company;
import java.util.concurrent.ThreadLocalRandom;

public class LottoApp {
    public static void main() {
        final int laenge = 7;
        int[] LottoArr = new int[laenge];
        int cntr=0;
        final int LottoMax=49;
        final int LottoMin=1;
        final int Smax=9;
        final int Smin=0;
        while(cntr!=LottoArr.length-1) {
            int randomNum = ThreadLocalRandom.current().nextInt( LottoMin, LottoMax);
            for (int x = 0;x<LottoArr.length;x++)
            {
                if (randomNum == LottoArr[x]) {
                    break;
                }
                else if(x==LottoArr.length-1) {
                LottoArr[cntr]=randomNum;
                cntr++;
                }
            }
        }
        int randomNum = ThreadLocalRandom.current().nextInt( Smin, Smax);
        for (int x = 0;x<LottoArr.length;x++)
        {
            if (randomNum == LottoArr[x]) {
                break;
            }
            else if(x==LottoArr.length-1) {
                LottoArr[cntr]=randomNum;
                cntr++;
            }
        }
        for(int stuff: LottoArr ) {
            if (LottoArr[laenge - 1] == stuff) System.out.print("superzahl: ");
            System.out.printf(String.valueOf(stuff) + " ");
            int temp = 0;
            for (int i = 0; i < LottoArr.length; i++) {
                int sw = 0;
                for (int j = 0; j < LottoArr.length - 2; j++) {
                    if (LottoArr[j] > LottoArr[j + 1]) {
                        temp = LottoArr[j];
                        LottoArr[j] = LottoArr[j + 1];
                        LottoArr[j + 1] = temp;
                        sw++;
                    }
                }
                if (sw == 0) {
                    break;
                }
            }
        }
        System.out.printf(" \nsortiert:\n");
        for(int stuffsort: LottoArr ) {
            System.out.printf(String.valueOf(stuffsort) + " ");
        }
}
}