/*
 *
 *  * Copyright (c) 2020.  | All rights reserved
 *  * Mateus Borja // UX Designer • 3D Artist • Developer
 *  * www.mateusborja.life
 *
 *
 */

/*

Lanche
Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade
deste item. A seguir, calcule e mostre o valor da conta a pagar.

Codigo
1
2
3
4
5
Especificacao
Cachorro Quente
X-Salada
X-Bacon
TorradaSimples
Refrigerante

Preco
R$ 4.00
R$ 4.50
R$ 5.00
R$ 2.00
R$ 1.50

Entrada
O arquivo de entrada contém dois valores inteiros correspondentes ao código e à
quantidade de um item conforme tabela acima.

Saída
O arquivo de saída deve conter a mensagem "Total: R$ " seguido pelo valor a ser pago,
com 2 casas após o ponto decimal.

Exemplo de Entrada
3 2

Exemplo de Saída
Total: R$ 10.00

Exemplo de Entrada
4 3

Exemplo de Saída
Total: R$ 6.00

Exemplo de Entrada
2 3

Exemplo de Saída
Total: R$ 13.50

 */

package com.mateusborja.urionline.Iniciante.uri1038;

import java.util.Scanner;

public class uri1038 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();

        double total;
        if (codigo == 1) {
            total = quantidade * 4.0;
        }
        else if (codigo == 2) {
            total = quantidade * 4.5;
        }
        else if (codigo == 3) {
            total = quantidade * 5.0;
        }
        else if (codigo == 4) {
            total = quantidade * 2.0;
        }
        else {
            total = quantidade * 1.5;
        }

        System.out.printf("Total: R$ %.2f%n", total);

        sc.close();
    }
}