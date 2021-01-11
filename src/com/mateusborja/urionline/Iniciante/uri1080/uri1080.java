/*
 *
 *  * Copyright (c) 2020.  | All rights reserved
 *  * Mateus Borja // UX Designer • 3D Artist • Developer
 *  * www.mateusborja.life
 *
 *
 */

/*

Maior e Posição
Leia 100 valores inteiros. Apresente então o maior valor lido e a posição dentre
os 100 valores lidos.

Entrada
O arquivo de entrada contém 100 números inteiros, positivos e distintos.

Saída
Apresente o maior valor lido e a posição de entrada, conforme exemplo abaixo.

Exemplo de Entrada
2
113
45
34565
6
...
8

Exemplo de Saída
34565
4

 */

package com.mateusborja.urionline.Iniciante.uri1080;

import java.util.Scanner;

public class uri1080 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int maior = 0;
        int posMaior = 1;

        for (int i = 1; i < 6; i++) {

            int x = sc.nextInt();

            if (x == 1) {
                maior = x;
                posMaior = 1;
            } else if (x > maior) {
                maior = x;
                posMaior = i;
            }


        }

        System.out.println(maior);
        System.out.println(posMaior);


        sc.close();


    }
}
