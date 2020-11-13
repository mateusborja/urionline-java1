/*
 *
 *  * Copyright (c) 2020.  | All rights reserved
 *  * Mateus Borja // UX Designer • 3D Artist • Developer
 *  * www.mateusborja.life
 *
 *
 */

package com.mateusborja.urionlinejava1.uri1041;


import java.util.Locale;
import java.util.Scanner;

public class uri1041 {

    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double y = sc.nextDouble();


        if (x == 0.0 && y == 0.0) {
            System.out.println("Origem");

        } else if (x == 0.0) {
            System.out.println("Eixo Y");

        } else if (y == 0.0) {
            System.out.println("Eixo X");

        } else if (x > 0 && y > 0) {
            System.out.println("Q1");

        } else if (x < 0 && y > 0) {
            System.out.println("Q2");

        } else if (x < 0 && y < 0) {
            System.out.println("Q3");

        } else if (x > 0 && y < 0) {

            System.out.println("Q4");

        } else {
            System.out.println("Q4");
        }

        sc.close();


    }


}





