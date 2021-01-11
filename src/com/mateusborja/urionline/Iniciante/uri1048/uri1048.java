/*
 *
 *  * Copyright (c) 2020.  | All rights reserved
 *  * Mateus Borja // UX Designer • 3D Artist • Developer
 *  * www.mateusborja.life
 *
 *
 */

/*
Aumento de Salário
A empresa ABC resolveu conceder um aumento de salários a seus funcionários de
acordo com a tabela abaixo:

Salario
0 - 400.00
400.01 - 800.00
800.01 - 1200.00
1200.01 - 2000.00
Acima de 2000.00

Percentual de Reajuste
15%
12%
10%
7%
4%

Leia o salário do funcionário e calcule e mostre o novo salário, bem como o valor de
reajuste ganho e o índice reajustado, em percentual.

Entrada
A entrada contém apenas um valor de ponto flutuante, com duas casas decimais.

Saída
Imprima 3 linhas na saída: o novo salário, o valor ganho de reajuste e o percentual
de reajuste ganho, conforme exemplo abaixo.

Exemplo de Entrada
400.00

Exemplo de Saída
Novo salario: 460.00
Reajuste ganho: 60.00
Em percentual: 15 %

Exemplo de Entrada
800.01

Exemplo de Saída
Novo salario: 880.01
Reajuste ganho: 80.00
Em percentual: 10 %

Exemplo de Entrada
2000.00

Exemplo de Saída
Novo salario: 2140.00
Reajuste ganho: 140.00
Em percentual: 7 %

 */

package com.mateusborja.urionline.Iniciante.uri1048;

import java.util.Locale;
import java.util.Scanner;

public class uri1048 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();

        double percentual;
        if (salario <= 400.0) {
            percentual = 15.0;
        } else if (salario <= 800.0) {
            percentual = 12.0;
        } else if (salario <= 1200.0) {
            percentual = 10.0;
        } else if (salario <= 2000.0) {
            percentual = 7.0;
        } else {
            percentual = 4.0;
        }

        double reajuste = (salario * percentual) / 100.0;
        double novoSalario = salario + reajuste;

        System.out.printf("Novo salario: %.2f%n", novoSalario);
        System.out.printf("Reajuste ganho: %.2f%n", reajuste);
        System.out.printf("Em percentual: %.0f%%%n", percentual);

        sc.close();
    }
}
