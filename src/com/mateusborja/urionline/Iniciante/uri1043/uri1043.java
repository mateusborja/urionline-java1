/*
 *
 *  * Copyright (c) 2020.  | All rights reserved
 *  * Mateus Borja // UX Designer • 3D Artist • Developer
 *  * www.mateusborja.life
 *
 *
 */

/*

Triângulo
Leia 3 valores reais (A, B e C) e verifique se eles formam ou não um triângulo.
Em caso positivo, calcule o perímetro do triângulo e apresente a mensagem:

Perimetro = XX.X

Em caso negativo, calcule a área do trapézio que tem A e B como base e C como altura, mostrando a mensagem

Area = XX.X

Entrada
A entrada contém três valores reais.

Saída
O resultado deve ser apresentado com uma casa decimal.

Exemplo de Entrada
6.0 4.0 2.0

Exemplo de Saída
Area = 10.0

Exemplo de Entrada
6.0 4.0 2.1

Exemplo de Saída
Perimetro = 12.1

 */

package com.mateusborja.urionline.Iniciante.uri1043;

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
