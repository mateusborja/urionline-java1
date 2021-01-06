/*
 *
 *  * Copyright (c) 2020.  | All rights reserved
 *  * Mateus Borja // UX Designer • 3D Artist • Developer
 *  * www.mateusborja.life
 *
 *
 */

/*

Soma Simples
Leia dois valores inteiros, no caso para variáveis A e B. A seguir, calcule a
soma entre elas e atribua à variável SOMA. A seguir escrever o valor desta variável.

Entrada
O arquivo de entrada contém 2 valores inteiros.

Saída
Imprima a mensagem "SOMA" com todas as letras maiúsculas, com um espaço em branco
antes e depois da igualdade seguido pelo valor correspondente à soma de A e B.
Como todos os problemas, não esqueça de imprimir o fim de linha após o resultado,
caso contrário, você receberá "Presentation Error".

Exemplos de Entrada
30
10

Exemplos de Saída
SOMA = 40

Exemplos de Entrada
-30
10

Exemplos de Saída
SOMA = -20

Exemplos de Entrada
0
0

Exemplos de Saída
SOMA = 0

 */

package com.mateusborja.urionline.Iniciante.uri1003;

import java.util.Locale;
import java.util.Scanner;

public class uri1003 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int A, B, SOMA;

        A = sc.nextInt();
        B = sc.nextInt();

        SOMA = A + B;
        System.out.println("SOMA = " + SOMA);

        sc.close();

    }

}
