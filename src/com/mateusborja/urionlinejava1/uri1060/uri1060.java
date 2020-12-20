/*
 *
 *  * Copyright (c) 2020.  | All rights reserved
 *  * Mateus Borja // UX Designer • 3D Artist • Developer
 *  * www.mateusborja.life
 *
 *
 */

package com.mateusborja.urionlinejava1.uri1060;

import java.util.Locale;
import java.util.Scanner;

public class uri1060 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int count = 0;

        for (int i = 0; i < 6; i++) {
            float n = sc.nextFloat();
            if (n > 0) {
                count++;
            }
        }
        System.out.println(count + " valores positivos");

    }
}
