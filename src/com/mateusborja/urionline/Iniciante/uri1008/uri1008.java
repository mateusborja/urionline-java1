/*
 *
 *  * Copyright (c) 2020.  | All rights reserved
 *  * Mateus Borja // UX Designer • 3D Artist • Developer
 *  * www.mateusborja.life
 *
 *
 */

//java uri 1008

/*

Salário
Escreva um programa que leia o número de um funcionário, seu número de horas
trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário.
A seguir, mostre o número e o salário do funcionário, com duas casas decimais.

Entrada
O arquivo de entrada contém 2 números inteiros e 1 número com duas casas decimais,
representando o número, quantidade de horas trabalhadas e o valor que o funcionário
recebe por hora trabalhada, respectivamente.

Saída
Imprima o número e o salário do funcionário, conforme exemplo fornecido,
com um espaço em branco antes e depois da igualdade. No caso do salário, também
deve haver um espaço em branco após o $.

Exemplos de Entrada
25
100
5.50

Exemplos de Saída
NUMBER = 25
SALARY = U$ 550.00

Exemplos de Entrada
1
200
20.50

Exemplos de Saída
NUMBER = 1
SALARY = U$ 4100.00

Exemplos de Entrada
6
145
15.55

Exemplos de Saída
NUMBER = 6
SALARY = U$ 2254.75

 */

package com.mateusborja.urionline.Iniciante.uri1008;

import java.util.Locale;
import java.util.Scanner;

public class uri1008 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int funcionarios, horasTrabalhadas;
        double valorHora, salario;

        funcionarios = sc.nextInt();
        horasTrabalhadas = sc.nextInt();
        valorHora = sc.nextDouble();

        salario = valorHora * horasTrabalhadas;

        System.out.println("NUMBER = " + funcionarios);
        System.out.printf("SALARY = U$ %.2f%n", salario);

        sc.close();

    }
}
