/*
 *
 *  * Copyright (c) 2020.  | All rights reserved
 *  * Mateus Borja // UX Designer • 3D Artist • Developer
 *  * www.mateusborja.life
 *
 *
 */

/*

Seis Números Ímpares
Leia um valor inteiro X. Em seguida apresente os 6 valores ímpares
consecutivos a partir de X, um valor por linha, inclusive o X ser for o caso.

Entrada
A entrada será um valor inteiro positivo.

Saída
A saída será uma sequência de seis números ímpares.

Exemplo de Entrada
8

Exemplo de Saída
9
11
13
15
17
19

 */

package com.mateusborja.urionline.Iniciante.uri1070;

import java.util.Scanner;

public class uri1070 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int count = 0;

        while(count < 6) {
            if(x %2 != 0) {
                System.out.println(x);
                count++;
            }
            x++;
        }



    }
}
