/*
 *
 *  * Copyright (c) 2020.  | All rights reserved
 *  * Mateus Borja // UX Designer • 3D Artist • Developer
 *  * www.mateusborja.life
 *
 *
 */

package com.mateusborja.urionlinejava1.uri1042;

import java.util.Locale;
import java.util.Scanner;

public class uri1042 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();


        //ordem crescente
        if (num1 < num2 && num1 < num3 && num3 < num2) {
            System.out.println(num1);
            System.out.println(num3);
            System.out.println(num2);

        } else if (num1 < num2 && num1 < num3 && num2 < num3) {
            System.out.println(num1);
            System.out.println(num2);
            System.out.println(num3);

        } else if (num2 < num1 && num2 < num3 && num1 < num3) {
            System.out.println(num2);
            System.out.println(num1);
            System.out.println(num3);

        } else if (num2 < num1 && num2 < num3 && num3 < num1) {
            System.out.println(num2);
            System.out.println(num3);
            System.out.println(num1);


        } else if (num3 < num1 && num3 < num2 && num2 < num1) {
            System.out.println(num3);
            System.out.println(num2);
            System.out.println(num1);

        } else if (num3 < num1 && num3 < num2 && num1 < num2) {
            System.out.println(num3);
            System.out.println(num1);
            System.out.println(num2);

        } else {
            System.out.println("opção inválida.");
        }

        System.out.println();
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        sc.close();

    }
}
