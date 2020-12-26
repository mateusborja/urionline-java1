/*
 *
 *  * Copyright (c) 2020.  | All rights reserved
 *  * Mateus Borja // UX Designer • 3D Artist • Developer
 *  * www.mateusborja.life
 *
 *
 */

package com.mateusborja.urionline.Iniciante.uri1074;

import java.util.Scanner;

public class uri1074 {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x == 0) System.out.println("NULL");
            else if (x % 2 != 0 && x > 0) System.out.println("ODD POSITIVE");
            else if (x % 2 != 0 && x < 0) System.out.println("ODD NEGATIVE");
            else if (x % 2 == 0 && x > 0) System.out.println("EVEN POSITIVE");
            else if (x % 2 == 0 && x < 0) System.out.println("EVEN NEGATIVE");
        }

        sc.close();

    }
}
