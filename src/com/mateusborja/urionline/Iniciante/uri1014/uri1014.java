/*
 *
 *  * Copyright (c) 2020.  | All rights reserved
 *  * Mateus Borja // UX Designer • 3D Artist • Developer
 *  * www.mateusborja.life
 *
 *
 */


/*

Consumo
Calcule o consumo médio de um automóvel sendo fornecidos a distância total
percorrida (em Km) e o total de combustível gasto (em litros).

Entrada
O arquivo de entrada contém dois valores: um valor inteiro X representando a
distância total percorrida (em Km), e um valor real Y representando o total de
combustível gasto, com um dígito após o ponto decimal.

Saída
Apresente o valor que representa o consumo médio do automóvel com 3
casas após a vírgula, seguido da mensagem "km/l".

Exemplo de Entrada
500
35.0

Exemplo de Saída
14.286 km/l

Exemplo de Entrada
2254
124.4

Exemplo de Saída
18.119 km/l

Exemplo de Entrada
4554
464.6

Exemplo de Saída
9.802 km/l

 */

package com.mateusborja.urionline.Iniciante.uri1014;

import java.util.Locale;
import java.util.Scanner;

public class uri1014 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int X;
        double Y, media;

        X = sc.nextInt();
        Y = sc.nextDouble();

        media = X / Y;
        System.out.printf("%.3f km/l%n", media);

        sc.close();

    }

}
