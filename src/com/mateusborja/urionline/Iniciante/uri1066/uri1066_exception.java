/*
 *
 *  * Copyright (c) 2020.  | All rights reserved
 *  * Mateus Borja // UX Designer • 3D Artist • Developer
 *  * www.mateusborja.life
 *
 *
 */

package com.mateusborja.urionline.Iniciante.uri1066;

import java.io.IOException;
import java.util.Scanner;

public class uri1066_exception {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int contPar = 0;
        int contImpar = 0;
        int contPositivos = 0;
        int contNegativos = 0;
        int x;
        for (int i = 0; i < 5; i++) {
            x = sc.nextInt();
            if (x % 2 == 0) contPar++;
            else contImpar++;
            if (x > 0) contPositivos++;
            else if (x < 0) contNegativos++;
        }

        System.out.println(contPar + " valor(es) par(es)");
        System.out.println(contImpar + " valor(es) impar(es)");
        System.out.println(contPositivos + " valor(es) positivo(s)");
        System.out.println(contNegativos + " valor(es) negativo(s)");
    }
}
