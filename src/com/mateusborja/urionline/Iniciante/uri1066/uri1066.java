/*
 *
 *  * Copyright (c) 2020.  | All rights reserved
 *  * Mateus Borja // UX Designer • 3D Artist • Developer
 *  * www.mateusborja.life
 *
 *
 */

/*

Pares, Ímpares, Positivos e Negativos
Leia 5 valores Inteiros. A seguir mostre quantos valores digitados foram pares, quantos
valores digitados foram ímpares, quantos valores digitados foram positivos e quantos
valores digitados foram negativos.

Entrada
O arquivo de entrada contém 5 valores inteiros quaisquer.

Saída
Imprima a mensagem conforme o exemplo fornecido, uma mensagem por linha, não esquecendo
o final de linha após cada uma.

Exemplo de Entrada
-5
0
-3
-4
12

Exemplo de Saída
3 valor(es) par(es)
2 valor(es) impar(es)
1 valor(es) positivo(s)
3 valor(es) negativo(s)

 */

package com.mateusborja.urionline.Iniciante.uri1066;

import java.util.Scanner;

public class uri1066 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int pares = 0;
        int impares = 0;
        int positivos = 0;
        int negativos = 0;

        for (int i = 1; i <= 5; i++) {

            int num = sc.nextInt();

            if (num % 2 == 0) {
                pares++;

            } else {
                impares++;

            }
            if (num > 0) {
                positivos++;

            } else if (num < 0) {
                negativos++;

            }

        }

        System.out.println(pares + " valor(es) par(es)");
        System.out.println(impares + " valor(es) impar(es)");
        System.out.println(positivos + " valor(es) positivo(s)");
        System.out.println(negativos + " valor(es) negativos(s)");

        sc.close();

    }

}
