/*
 *
 *  * Copyright (c) 2020.  | All rights reserved
 *  * Mateus Borja // UX Designer • 3D Artist • Developer
 *  * www.mateusborja.life
 *
 *
 */
/*

 /*
Leia um valor inteiro N que é a quantidade de casos de teste que vem a seguir. Cada caso de teste
consiste de dois inteiros X e Y.

Você deve apresentar a soma de todos os ímpares existentes entre X e Y.


Entrada

A primeira linha de entrada é um inteiro N que é a quantidade de casos de teste que vem a seguir.
Cada caso de teste consiste em uma linha contendo dois inteiros X e Y.

Saída
Imprima a soma de todos valores ímpares entre X e Y.

Exemplo de Entrada
7

4 5
13 10
6 4
3 3
3 5
3 4
3 8

Exemplo de Saída

0
11
5
0
0
0
12

 */

/*

Soma de Ímpares Consecutivos II
Leia um valor inteiro N que é a quantidade de casos de teste que vem a seguir.
Cada caso de teste consiste de dois inteiros X e Y. Você deve apresentar a soma de
todos os ímpares existentes entre X e Y.

Entrada
A primeira linha de entrada é um inteiro N que é a quantidade de casos de teste que vem
a seguir. Cada caso de teste consiste em uma linha contendo dois inteiros X e Y.

Saída
Imprima a soma de todos valores ímpares entre X e Y.

Exemplo de Entrada
7
4 5
13 10
6 4
3 3
3 5
3 4
3 8

Exemplo de Saída
0
11
5
0
0
0
12

 */

package com.mateusborja.urionline.Iniciante.uri1099;

import java.util.Scanner;

public class uri1099 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int x = sc.nextInt();
        int y = sc.nextInt();

        while (x != y) {
            if (x < y) {
                System.out.println("Crescente");
            } else {
                System.out.println("Decrescente");

            }

            x = sc.nextInt();
            y = sc.nextInt();
        }

        sc.close();

    }
}
