/*
 *
 *  * Copyright (c) 2020.  | All rights reserved
 *  * Mateus Borja // UX Designer • 3D Artist • Developer
 *  * www.mateusborja.life
 *
 *
 */

/*

Números Ímpares
Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um
valor por linha, inclusive o X, se for o caso.

Entrada
O arquivo de entrada contém 1 valor inteiro qualquer.

Saída
Imprima todos os valores ímpares de 1 até X, inclusive X, se for o caso.

Exemplo de Entrada
8

Exemplo de Saída
1
3
5
7

 */

package com.mateusborja.urionline.Iniciante.uri1067;

import java.util.Locale;
import java.util.Scanner;

public class uri1067 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        if (x >= 1 && x <= 1000) {
            for (int i = 1; i <= x; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
            sc.close();
        }
    }
}
