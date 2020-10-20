package com.mateusborja.urionlinejava1.uri1011;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double raio, pi = 3.14159, volumeEsfera;

        raio = sc.nextDouble();

        volumeEsfera = (4.0/3) * pi * raio * raio * raio;

        System.out.printf("VOLUME = %.3f%n", volumeEsfera);

        sc.close();

    }
}
