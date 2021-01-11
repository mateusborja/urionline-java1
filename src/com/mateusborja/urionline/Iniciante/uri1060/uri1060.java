/*
 *
 *  * Copyright (c) 2020.  | All rights reserved
 *  * Mateus Borja // UX Designer • 3D Artist • Developer
 *  * www.mateusborja.life
 *
 *
 */

/*

Números Positivos
Faça um programa que leia 6 valores. Estes valores serão somente negativos ou positivos
(desconsidere os valores nulos). A seguir, mostre a quantidade de valores positivos digitados.

Entrada
Seis valores, negativos e/ou positivos.

Saída
Imprima uma mensagem dizendo quantos valores positivos foram lidos.

Exemplo de Entrada
7
-5
6
-3.4
4.6
12

Exemplo de Saída
4 valores positivos

 */

package com.mateusborja.urionline.Iniciante.uri1060;

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
