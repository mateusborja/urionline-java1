//java uri cedulas
package com.mateusborja.urionlinejava1.uri1018;

import java.util.Locale;
import java.util.Scanner;

public class uri1018 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N, resto, quociente, nota;

        N = sc.nextInt();
        System.out.println(N);

        resto = N;

        nota = 100;
        quociente = resto / nota;
        System.out.println(quociente + " nota(s) de R$ " + nota + ",00");
        resto = resto % nota;

        nota = 50;
        quociente = resto / nota;
        System.out.println(quociente + " nota(s) de R$ " + nota + ",00");
        resto = resto % nota;

        nota = 20;
        quociente = resto / nota;
        System.out.println(quociente + " nota(s) de R$ " + nota + ",00");
        resto = resto % nota;

        nota = 10;
        quociente = resto / nota;
        System.out.println(quociente + " nota(s) de R$ " + nota + ",00");
        resto = resto % nota;

        nota = 5;
        quociente = resto / nota;
        System.out.println(quociente + " nota(s) de R$ " + nota + ",00");
        resto = resto % nota;

        nota = 2;
        quociente = resto / nota;
        System.out.println(quociente + " nota(s) de R$ " + nota + ",00");
        resto = resto % nota;

        nota = 1;
        quociente = resto / nota;
        System.out.println(quociente + " nota(s) de R$ " + nota + ",00");
        resto = resto % nota;

        sc.close();

    }
}
