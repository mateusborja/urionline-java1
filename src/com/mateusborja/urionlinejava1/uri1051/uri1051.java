/*
 *
 *  * Copyright (c) 2020.  | All rights reserved
 *  * Mateus Borja // UX Designer • 3D Artist • Developer
 *  * www.mateusborja.life
 *
 *
 */

package com.mateusborja.urionlinejava1.uri1051;

import java.util.Locale;
import java.util.Scanner;

public class uri1051 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        float salario = sc.nextFloat();
        float IR = 0f;

        if (salario <= 2000.0) {
            IR = 0;
        } else if (salario > 2000 && salario <= 3000.0) {
            IR = (salario - 2000f) * 0.08f;
        } else if (salario > 3000 && salario <= 4500.0) {
            IR = (salario - 3000f) * 0.18f + (1000f * 0.08f);
        } else if (salario > 4500) {
            IR = (salario - 4500f) * 0.28f + (1500f * 0.18f) + (1000f * 0.08f);

        }
        System.out.printf((IR == 0) ? "Isento\n" : "R$ %.2f%n", IR);

        sc.close();

    }
}
