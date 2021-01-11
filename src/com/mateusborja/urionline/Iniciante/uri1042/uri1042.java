/*
 *
 *  * Copyright (c) 2020.  | All rights reserved
 *  * Mateus Borja // UX Designer • 3D Artist • Developer
 *  * www.mateusborja.life
 *
 *
 */


/*

Sort Simples
Leia 3 valores inteiros e ordene-os em ordem crescente. No final, mostre os valores em
ordem crescente, uma linha em branco e em seguida, os valores na sequência como foram lidos.

Entrada
A entrada contem três números inteiros.

Saída
Imprima a saída conforme foi especificado.

Exemplo de Entrada
7 21 -14

Exemplo de Saída
-14
7
21

7
21
-14

Exemplo de Entrada
-14 21 7

Exemplo de Saída
-14
7
21

-14
21
7

 */

package com.mateusborja.urionline.Iniciante.uri1042;

import java.util.Locale;
import java.util.Scanner;

public class uri1042 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();


        //ordem crescente
        if (num1 < num2 && num1 < num3 && num3 < num2) {
            System.out.println(num1);
            System.out.println(num3);
            System.out.println(num2);

        } else if (num1 < num2 && num1 < num3 && num2 < num3) {
            System.out.println(num1);
            System.out.println(num2);
            System.out.println(num3);

        } else if (num2 < num1 && num2 < num3 && num1 < num3) {
            System.out.println(num2);
            System.out.println(num1);
            System.out.println(num3);

        } else if (num2 < num1 && num2 < num3 && num3 < num1) {
            System.out.println(num2);
            System.out.println(num3);
            System.out.println(num1);


        } else if (num3 < num1 && num3 < num2 && num2 < num1) {
            System.out.println(num3);
            System.out.println(num2);
            System.out.println(num1);

        } else if (num3 < num1 && num3 < num2 && num1 < num2) {
            System.out.println(num3);
            System.out.println(num1);
            System.out.println(num2);

        } else {
            System.out.println("opção inválida.");
        }

        System.out.println();
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        sc.close();

    }
}
