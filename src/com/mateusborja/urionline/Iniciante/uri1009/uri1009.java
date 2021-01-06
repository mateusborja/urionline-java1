/*
 *
 *  * Copyright (c) 2020.  | All rights reserved
 *  * Mateus Borja // UX Designer • 3D Artist • Developer
 *  * www.mateusborja.life
 *
 *
 */

//java string type

/*

Salário com Bônus
Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total
de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor
ganha 15% de comissão sobre suas vendas efetuadas, informar o total a receber
no final do mês, com duas casas decimais.

Entrada
O arquivo de entrada contém um texto (primeiro nome do vendedor) e 2 valores
de dupla precisão (double) com duas casas decimais, representando o salário
fixo do vendedor e montante total das vendas efetuadas por este vendedor,
respectivamente.

Saída
Imprima o total que o funcionário deverá receber, conforme exemplo fornecido.

Exemplos de Entrada
JOAO
500.00
1230.30

Exemplos de Saída
TOTAL = R$ 684.54

Exemplos de Entrada
PEDRO
700.00
0.00

Exemplos de Saída
TOTAL = R$ 700.00

Exemplos de Entrada
MANGOJATA
1700.00
1230.50

Exemplos de Saída
TOTAL = R$ 1884.58

 */

package com.mateusborja.urionline.Iniciante.uri1009;

import java.util.Locale;
import java.util.Scanner;

public class uri1009 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nome;
        double salarioFixo;
        double vendas;
        double total;

        nome = sc.next();
        salarioFixo = sc.nextDouble();
        vendas = sc.nextDouble();

        total = salarioFixo + vendas * 0.15;
        System.out.printf("TOTAL = R$ %.2f%n", total);

        sc.close();

    }

}
