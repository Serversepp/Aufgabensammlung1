package com.company;

public class Beton {
    double rAussen = 100;
    double rInnen = 90;
    double laenge = 100000;
    double flaecheInnen;
    double flaecheAussen;
    double volInnen;
    double volAussen;
    double volSchacht;


    public int berechnen(){  //Methode 1
        flaecheInnen = Math.PI * rInnen * rInnen ;
        flaecheAussen = Math.PI * rAussen * rAussen ;
        System.out.println("flaecheInnen ist: " + flaecheInnen );
        System.out.println("flaecheAussen ist : " + flaecheAussen );
        volAussen = Math.PI * laenge * rAussen * rAussen;
        volInnen = Math.PI * laenge * rInnen * rInnen;
        volSchacht = volAussen - volInnen;

        return (int) (Math.ceil(volSchacht/8000000));//hier anzahl mischer
    }




}



