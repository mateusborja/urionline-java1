/*
 *
 *  * Copyright (c) 2020.  | All rights reserved
 *  * Mateus Borja // UX Designer • 3D Artist • Developer
 *  * www.mateusborja.life
 *
 *
 */


/*

Gasto de Combustível
Joaozinho quer calcular e mostrar a quantidade de litros de combustível gastos em uma viagem,
ao utilizar um automóvel que faz 12 KM/L. Para isso, ele gostaria que você o auxiliasse através de
um simples programa. Para efetuar o cálculo, deve-se fornecer o tempo gasto na viagem (em horas) e
a velocidade média durante a mesma (em km/h). Assim, pode-se obter distância percorrida e, em seguida,
calcular quantos litros seriam necessários. Mostre o valor com 3 casas decimais após o ponto.

Entrada
O arquivo de entrada contém dois inteiros. O primeiro é o tempo gasto na viagem (em horas) e o segundo
é a velocidade média durante a mesma (em km/h).

Saída
Imprima a quantidade de litros necessária para realizar a viagem, com três dígitos após o ponto decimal

Exemplo de Entrada
10
85

Exemplo de Saída
70.833

Exemplo de Entrada
2
92

Exemplo de Saída
15.333

Exemplo de Entrada
22
67

Exemplo de Saída
122.833

 */

package com.mateusborja.urionline.Iniciante.uri1017;

import java.util.Locale;
import java.util.Scanner;

public class uri1017 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int tempo, velocidade;

        double litros;

        tempo = sc.nextInt();
        velocidade = sc.nextInt();

        litros = (double) tempo * velocidade / 12.0;

        System.out.printf("%.3f%n", litros);

        sc.close();

    }
}
