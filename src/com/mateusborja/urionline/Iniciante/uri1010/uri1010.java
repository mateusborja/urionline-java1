/*
 *
 *  * Copyright (c) 2020.  | All rights reserved
 *  * Mateus Borja // UX Designer • 3D Artist • Developer
 *  * www.mateusborja.life
 *
 *
 */


/*

Cálculo Simples
Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor
unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor
unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.

Entrada
O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores,
respectivamente dois inteiros e um valor com 2 casas decimais.

Saída
A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, lembrando
de deixar um espaço após os dois pontos e um espaço após o "R$". O valor deverá
ser apresentado com 2 casas após o ponto.

Exemplos de Entrada
12 1 5.30
16 2 5.10

Exemplos de Saída
VALOR A PAGAR: R$ 15.50

Exemplos de Entrada
13 2 15.30
161 4 5.20

Exemplos de Saída
VALOR A PAGAR: R$ 51.40

Exemplos de Entrada
1 1 15.10
2 1 15.10

Exemplos de Saída
VALOR A PAGAR: R$ 30.20

 */

package com.mateusborja.urionline.Iniciante.uri1010;

import java.util.Locale;
import java.util.Scanner;

public class uri1010 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo1, codigo2, quantidade1, quantidade2;
        double preco1, preco2, valorPago;

        codigo1 = sc.nextInt();
        quantidade1 = sc.nextInt();
        preco1 = sc.nextDouble();;

        codigo2 = sc.nextInt();
        quantidade2 = sc.nextInt();
        preco2 = sc.nextDouble();

        valorPago = preco1 * quantidade1 + preco2 * quantidade2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorPago);

        sc.close();

    }

}
