package com.company;

public class CaesarApp2 {
    public static void main(int key, boolean mode, String m) {
        char Alph[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char[] buch = m.toCharArray();
        char[] endecrypted = new char[buch.length];

        if (mode == true) {
            System.out.println("Verschlüsselter Text: ");
            for (int j = 0; j < buch.length; j++) {
                if (Character.isLowerCase(buch[j])) {
                    for (int i = 0; i < Alph.length; i++) {
                        if (buch[j] == Alph[i]) {
                            if ((i + key) >= 26) {
                                endecrypted[j] = Alph[i + key - 26];
                            } else {
                                endecrypted[j] = Alph[i + key];
                            }
                        }
                    }
                } else{
                    endecrypted[j] = buch[j];
                }

            }
            for (char s : endecrypted) {
                System.out.print(s);
            }
        } else {
            System.out.println("Entschlüsselter Text: ");
            for (char elem : buch) {

                if (Character.isLowerCase(elem)) {
                    for (int i = 0; i < Alph.length; i++) {
                        if (elem == Alph[i]) {

                            if ((i - key) < 0) {
                                elem = Alph[(25 - (i + key))];
                            } else {
                                elem = Alph[i - key];
                            }
                        }
                    }
                    System.out.print(elem);
                }
            }
        }
    }
}