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

public class uri1038Switch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o codigo do produto:");
        int codigo = sc.nextInt();
        int quantidade;

        double total;
        switch (codigo) {
            case 1 -> {
                System.out.println("Digite a quantidade:");
                quantidade = sc.nextInt();
                total = quantidade * 4.0;
                System.out.printf("Total a pagar: %.2f%n", total);
            }
            case 2 -> {
                System.out.println("Digite a quantidade:");
                quantidade = sc.nextInt();
                total = quantidade * 4.5;
                System.out.printf("Total a pagar: %.2f%n", total);
            }
            case 3 -> {
                System.out.println("Digite a quantidade:");
                quantidade = sc.nextInt();
                total = quantidade * 5.0;
                System.out.printf("Total a pagar: %.2f%n", total);
            }
            case 4 -> {
                System.out.println("Digite a quantidade:");
                quantidade = sc.nextInt();
                total = quantidade * 2.0;
                System.out.printf("Total a pagar: %.2f%n", total);
            }
            case 5 -> {
                System.out.println("Digite a quantidade:");
                quantidade = sc.nextInt();

                total = quantidade * 1.5;
                System.out.printf("Total a pagar: %.2f%n", total);
            }
            default -> System.out.println("Codigo inválidio.");
        }

    }
}
