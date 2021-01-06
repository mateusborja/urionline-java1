/*
 *
 *  * Copyright (c) 2020.  | All rights reserved
 *  * Mateus Borja // UX Designer • 3D Artist • Developer
 *  * www.mateusborja.life
 *
 *
 */

/*

Diferença
Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença
do produto de A e B pelo produto de C e D segundo a fórmula:
DIFERENCA = (A * B - C * D).

Entrada
O arquivo de entrada contém 4 valores inteiros.

Saída
Imprima a mensagem DIFERENCA com todas as letras maiúsculas, conforme exemplo
abaixo, com um espaço em branco antes e depois da igualdade.

Exemplos de Entrada
5
6
7
8

Exemplos de Saída
DIFERENCA = -26

Exemplos de Entrada
0
0
7
8

Exemplos de Saída
DIFERENCA = -56

Exemplos de Entrada
5
6
-7
8

Exemplos de Saída
DIFERENCA = 86

 */

package com.mateusborja.urionline.Iniciante.uri1007;

import java.util.Locale;
import java.util.Scanner;

public class uri1007 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int A, B, C, D, prod;

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        prod = (A * B - C * D);
        System.out.println("DIFERENCA = " + prod);

        sc.close();

    }
}
