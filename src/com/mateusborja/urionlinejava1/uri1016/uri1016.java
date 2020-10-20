//java uri 1016 distancia em km/h
package com.mateusborja.urionlinejava1.uri1016;

import java.util.Locale;
import java.util.Scanner;

public class uri1016 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, distanciaKm = 2, tempo;

        n = sc.nextInt();

        tempo = distanciaKm * n;

        System.out.printf("%d minutos%n", tempo);

        sc.close();

    }

}
