/*
 *
 *  * Copyright (c) 2020.  | All rights reserved
 *  * Mateus Borja // UX Designer • 3D Artist • Developer
 *  * www.mateusborja.life
 *
 *
 */

//java uri 1014
package com.mateusborja.urionline.Iniciante.uri1014;

import java.util.Locale;
import java.util.Scanner;

public class uri1014 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int X;
        double Y, media;

        X = sc.nextInt();
        Y = sc.nextDouble();

        media = X / Y;
        System.out.printf("%.3f km/l%n", media);

        sc.close();

    }

}
