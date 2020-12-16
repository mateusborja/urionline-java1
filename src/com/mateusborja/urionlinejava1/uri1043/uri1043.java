/*
 *
 *  * Copyright (c) 2020.  | All rights reserved
 *  * Mateus Borja // UX Designer • 3D Artist • Developer
 *  * www.mateusborja.life
 *
 *
 */

package com.mateusborja.urionlinejava1.uri1043;

import java.util.Locale;
import java.util.Scanner;

public class uri1043 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C, AREA, PERIMETRO;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        if (A < (B + C) && B < (A + C) && C < (A + B)) {
            PERIMETRO = A + B + C;
            System.out.println("Perimetro = " + PERIMETRO);
        } else {
            AREA = ((A + B) * C) / 2;
            System.out.println("Area = " + AREA);
        }

        sc.close();

    }

}
