/*
 *
 *  * Copyright (c) 2020.  | All rights reserved
 *  * Mateus Borja // UX Designer • 3D Artist • Developer
 *  * www.mateusborja.life
 *
 *
 */

//java while with if and else
package com.mateusborja.urionline.AdHoc;


import java.util.Scanner;

public class uri1113 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();

        while (X!= Y) {
            if (X < Y) {
                System.out.println("Crescente");
            } else {
                System.out.println("Decrescente");
            }

            X = sc.nextInt();
            Y = sc.nextInt();
        }

        sc.close();

    }
}
