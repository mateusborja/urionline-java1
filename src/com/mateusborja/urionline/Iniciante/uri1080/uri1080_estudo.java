/*
 *
 *  * Copyright (c) 2021.  | All rights reserved
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

public class uri1080_estudo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int maior = 0;
        int menor = 0;
        int posMaior = 1;
        int posMenor = 1;

        System.out.print("quantos numeros: ");
        int count = sc.nextInt();

        System.out.print("digite os numeros: ");
        for (int i = 1; i <= count; i++) {

            int x = sc.nextInt();

            if (x == 1) {
                maior = x;
                posMaior = 1;
            }

            if (x > maior) {
                maior = x;
                posMaior = i;
            } else {
                menor = x;
                posMenor = i;
            }

        }

        System.out.println();
        System.out.println("menor e: " + menor);
        System.out.println("maior e: " + maior);
        System.out.println("posicao menor: " + posMenor);
        System.out.println("posicao maior: " + posMaior);

        sc.close();


    }
}
