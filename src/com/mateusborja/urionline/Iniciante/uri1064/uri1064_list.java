/*
 *
 *  * Copyright (c) 2020.  | All rights reserved
 *  * Mateus Borja // UX Designer • 3D Artist • Developer
 *  * www.mateusborja.life
 *
 *
 */

/*

Positivos e Média
Leia 6 valores. Em seguida, mostre quantos destes valores digitados foram positivos.
Na próxima linha, deve-se mostrar a média de todos os valores positivos digitados, com
um dígito após o ponto decimal.

Entrada
A entrada contém 6 números que podem ser valores inteiros ou de ponto flutuante. Pelo
menos um destes números será positivo.

Saída
O primeiro valor de saída é a quantidade de valores positivos. A próxima linha deve mostrar
a média dos valores positivos digitados.

Exemplo de Entrada
7
-5
6
-3.4
4.6
12

Exemplo de Saída
4 valores positivos
7.4

 */

package com.mateusborja.urionline.Iniciante.uri1064;

import java.util.ArrayList;
import java.util.Scanner;

public class uri1064_list {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Double> pares = new ArrayList<Double>();

        int count = 0;
        double media = 0;
        double sum = 0;

        System.out.print("qtde: ");
        int qtde = sc.nextInt();

        System.out.print("numeros: ");
        for (int i = 0; i < qtde; i++) {
            pares.add(sc.nextDouble());
            if (pares.get(i) > 0) {
                sum += pares.get(i);
                count++;
                media = sum / count;
            }
        }
        System.out.println(count + " valores positivos");
        System.out.println(media);

    }
}