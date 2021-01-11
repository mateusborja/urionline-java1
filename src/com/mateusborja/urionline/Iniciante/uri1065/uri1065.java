/*
 *
 *  * Copyright (c) 2020.  | All rights reserved
 *  * Mateus Borja // UX Designer • 3D Artist • Developer
 *  * www.mateusborja.life
 *
 *
 */

/*

Pares entre Cinco Números
Faça um programa que leia 5 valores inteiros. Conte quantos destes valores digitados
são pares e mostre esta informação.

Entrada
O arquivo de entrada contém 5 valores inteiros quaisquer.

Saída
Imprima a mensagem conforme o exemplo fornecido, indicando a quantidade de valores
pares lidos.

Exemplo de Entrada
7
-5
6
-4
12

Exemplo de Saída
3 valores pares

 */

package com.mateusborja.urionline.Iniciante.uri1065;

import java.util.Scanner;

public class uri1065 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = 0;
        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();
            if (num % 2 == 0) {
                count++;
            }
        }

        System.out.println(count + " valores pares");

        sc.close();


    }
}
