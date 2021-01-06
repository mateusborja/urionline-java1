/*
 *
 *  * Copyright (c) 2020.  | All rights reserved
 *  * Mateus Borja // UX Designer • 3D Artist • Developer
 *  * www.mateusborja.life
 *
 *
 */

/*

Produto Simples
Leia dois valores inteiros. A seguir, calcule o produto entre estes dois valores
e atribua esta operação à variável PROD. A seguir mostre a variável PROD com
mensagem correspondente.
Entrada

O arquivo de entrada contém 2 valores inteiros.
Saída

Imprima a mensagem "PROD" e a variável PROD conforme exemplo abaixo, com um espaço
em branco antes e depois da igualdade. Não esqueça de imprimir o fim de linha
após o produto, caso contrário seu programa apresentará a mensagem: “Presentation Error”.

Exemplos de Entrada
3
9

Exemplos de Saída
PROD = 27

Exemplos de Entrada
-30
10

Exemplos de Saída
PROD = -300

Exemplos de Entrada
0
9

Exemplos de Saída
PROD = 0

 */

package com.mateusborja.urionline.Iniciante.uri1004;

import java.util.Locale;
import java.util.Scanner;

public class uri1004 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x, y, prod;

        x = sc.nextInt();
        y = sc.nextInt();

        prod = x * y;

        System.out.println("PROD = " + prod);

        sc.close();

    }

}
