/*
 *
 *  * Copyright (c) 2020.  | All rights reserved
 *  * Mateus Borja // UX Designer • 3D Artist • Developer
 *  * www.mateusborja.life
 *
 *
 */

package com.mateusborja.urionlinejava1.uri1044;

import java.util.Locale;
import java.util.Scanner;

public class uri1044 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num1, num2;

        num1 = sc.nextInt();
        num2 = sc.nextInt();


        if (num2 % num1 == 0 || num1 % num2 == 0) {
            System.out.println("Sao Multiplos");

        } else {
            System.out.println("Nao sao Multiplos");

        }

        sc.close();

    }
}
