/*
 *
 *  * Copyright (c) 2020.  | All rights reserved
 *  * Mateus Borja // UX Designer • 3D Artist • Developer
 *  * www.mateusborja.life
 *
 *
 */

/*

Crescente e Decrescente
Leia uma quantidade indeterminada de duplas de valores inteiros X e Y. Escreva para
cada X e Y uma mensagem que indique se estes valores foram digitados em ordem
crescente ou decrescente.

Entrada
A entrada contém vários casos de teste. Cada caso contém dois valores inteiros
X e Y. A leitura deve ser encerrada ao ser fornecido valores iguais para X e Y.

Saída
Para cada caso de teste imprima “Crescente”, caso os valores tenham sido digitados
na ordem crescente, caso contrário imprima a mensagem “Decrescente”.

Exemplo de Entrada
5 4
7 2
3 8
2 2

Exemplo de Saída
Decrescente
Decrescente
Crescente

 */

package com.mateusborja.urionline.Iniciante.uri1113;

import java.util.Scanner;

public class uri1113_do {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        do if (x < y) {
            System.out.println("crescente");
            break;
        } else {
            System.out.println("decrescente");
            break;
        } while (x != y);

        sc.close();
    }
}
