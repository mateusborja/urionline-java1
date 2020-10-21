//java uri online 1019
package com.mateusborja.urionlinejava1.uri1019;

import java.util.Scanner;

public class uri1019 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N, horas, minutos, segundos, resto;

        N = sc.nextInt();

        horas = N / 3600;
        resto = N % 3600;

        minutos = resto / 60;
        segundos = resto % 60;

        System.out.println(horas + ":" + minutos + ":" + segundos);

        sc.close();

    }
}
