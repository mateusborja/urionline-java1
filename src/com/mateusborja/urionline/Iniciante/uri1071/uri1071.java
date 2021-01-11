/*
 *
 *  * Copyright (c) 2020.  | All rights reserved
 *  * Mateus Borja // UX Designer • 3D Artist • Developer
 *  * www.mateusborja.life
 *
 *
 */

// Soma de Impares Consecutivos I
/*

Soma de Impares Consecutivos I
Leia 2 valores inteiros X e Y. A seguir, calcule e mostre a soma dos números impares
entre eles.

Entrada
O arquivo de entrada contém dois valores inteiros.

Saída
O programa deve imprimir um valor inteiro. Este valor é a soma dos valores ímpares
que estão entre os valores fornecidos na entrada que deverá caber em um inteiro.

Exemplo de Entrada
6
-5

Exemplo de Saída
5

Exemplo de Entrada
15
12

Exemplo de Saída
13

Exemplo de Entrada
12
12

Exemplo de Saída
0

 */

package com.mateusborja.urionline.Iniciante.uri1071;

import java.util.Scanner;

public class uri1071 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        int min, max;

        //condicao crescente e consecutivo
        if(x < y) {
            min = x;
            max = y;

        } else {
            min = y;
            max = x;
        }

        int soma = 0;

        for (int i = min + 1; i < max ; i++) {
            //condicao numero impar
            if (i % 2 !=0) {
                soma = soma + i;
            }

        }

        System.out.println(soma);

        sc.close();

    }
}
