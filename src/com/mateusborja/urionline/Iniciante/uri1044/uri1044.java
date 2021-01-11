/*
 *
 *  * Copyright (c) 2020.  | All rights reserved
 *  * Mateus Borja // UX Designer • 3D Artist • Developer
 *  * www.mateusborja.life
 *
 *
 */

/*

Múltiplos
Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos"
ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si.

Entrada
A entrada contém valores inteiros.

Saída
A saída deve conter uma das mensagens conforme descrito acima.

Exemplo de Entrada
6 24

Exemplo de Saída
Sao Multiplos

Exemplo de Entrada
6 25

Exemplo de Saída
Nao sao Multiplos

 */

package com.mateusborja.urionline.Iniciante.uri1044;

import java.util.Locale;
import java.util.Scanner;

public class uri1044 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num1, num2;

        num1 = sc.nextInt();
        num2 = sc.nextInt();


        if (num2 % num1 == 0 || num1 % num2 == 0) {
            System.out.println("Sao Multiplos");

        } else {
            System.out.println("Nao sao Multiplos");

        }

        sc.close();

    }
}
