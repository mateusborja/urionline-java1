/*
 *
 *  * Copyright (c) 2020.  | All rights reserved
 *  * Mateus Borja // UX Designer • 3D Artist • Developer
 *  * www.mateusborja.life
 *
 *
 */

/*

Par ou Ímpar
Leia um valor inteiro N. Este valor será a quantidade de valores que serão lidos em seguida.
Para cada valor lido, mostre uma mensagem em inglês dizendo se este valor lido é par (EVEN),
ímpar (ODD), positivo (POSITIVE) ou negativo (NEGATIVE). No caso do valor ser igual a zero (0),
embora a descrição correta seja (EVEN NULL), pois por definição zero é par, seu programa deverá
imprimir apenas NULL.

Entrada
A primeira linha da entrada contém um valor inteiro N(N < 10000) que indica o número de casos
de teste. Cada caso de teste a seguir é um valor inteiro X (-107 < X <107).

Saída
Para cada caso, imprima uma mensagem correspondente, de acordo com o exemplo abaixo.
Todas as letras deverão ser maiúsculas e sempre deverá haver um espaço entre duas
palavras impressas na mesma linha.

Exemplo de Entrada
4
-5
0
3
-4

Exemplo de Saída
ODD NEGATIVE
NULL
ODD POSITIVE
EVEN NEGATIVE

 */

package com.mateusborja.urionline.Iniciante.uri1074;

import java.util.Scanner;

public class uri1074 {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x == 0) System.out.println("NULL");
            else if (x % 2 != 0 && x > 0) System.out.println("ODD POSITIVE");
            else if (x % 2 != 0 && x < 0) System.out.println("ODD NEGATIVE");
            else if (x % 2 == 0 && x > 0) System.out.println("EVEN POSITIVE");
            else if (x % 2 == 0 && x < 0) System.out.println("EVEN NEGATIVE");
        }

        sc.close();

    }
}
