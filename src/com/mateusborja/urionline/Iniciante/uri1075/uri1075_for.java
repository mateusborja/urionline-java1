/*
 *
 *  * Copyright (c) 2020.  | All rights reserved
 *  * Mateus Borja // UX Designer • 3D Artist • Developer
 *  * www.mateusborja.life
 *
 *
 */

/*

Resto 2
Leia um valor inteiro N. Apresente todos os números entre 1 e 10000 que divididos
por N dão resto igual a 2.

Entrada
A entrada contém um valor inteiro N (N < 10000).

Saída
Imprima todos valores que quando divididos por N dão resto = 2, um por linha.

Exemplo de Entrada
13

Exemplo de Saída
2
15
28
41
...

 */

package com.mateusborja.urionline.Iniciante.uri1075;

import java.util.Scanner;

public class uri1075_for {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i < 10000; i++) {
            if (i % n == 2) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
