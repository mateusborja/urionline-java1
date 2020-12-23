/*
 *
 *  * Copyright (c) 2020.  | All rights reserved
 *  * Mateus Borja // UX Designer • 3D Artist • Developer
 *  * www.mateusborja.life
 *
 *
 */

package com.mateusborja.urionline.Iniciante.uri1113;

import java.util.Scanner;

public class uri1113_do {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        do {
            if (x > y) {
                System.out.println("crescente");
            } else
                System.out.println("decrescente");
        } while (x != y);


        sc.close();


    }
}
