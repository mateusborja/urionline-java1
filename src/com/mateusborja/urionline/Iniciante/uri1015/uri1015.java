/*
 *
 *  * Copyright (c) 2020.  | All rights reserved
 *  * Mateus Borja // UX Designer • 3D Artist • Developer
 *  * www.mateusborja.life
 *
 *
 */

/* java Math.sqrt(x) e Math.pow(x,y)
distrancia entre dois pontos uri 1015
 */
package com.mateusborja.urionline.Iniciante.uri1015;

import java.util.Locale;
import java.util.Scanner;

public class uri1015 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x1, y1, x2, y2, distancia;

        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();

        distancia = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

        System.out.printf("%.4f%n", distancia);
        sc.close();

    }
}
