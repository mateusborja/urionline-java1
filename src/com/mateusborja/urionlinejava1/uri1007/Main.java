package com.mateusborja.urionlinejava1.uri1007;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int A, B, C, D, prod;

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        prod = (A * B - C * D);
        System.out.println("DIFERENCA = " + prod);

        sc.close();

    }
}
