/*
 *
 *  * Copyright (c) 2020.  | All rights reserved
 *  * Mateus Borja // UX Designer • 3D Artist • Developer
 *  * www.mateusborja.life
 *
 *
 */


/*

Distância Entre Dois Pontos
Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer
no plano, p1(x1,y1) e p2(x2,y2) e calcule a distância entre eles, mostrando 4 casas
decimais após a vírgula, segundo a fórmula:

distancia = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

Entrada
O arquivo de entrada contém duas linhas de dados. A primeira linha contém dois
valores de ponto flutuante: x1 y1 e a segunda linha contém dois valores de ponto flutuante x2 y2.

Saída
Calcule e imprima o valor da distância segundo a fórmula fornecida, com 4 casas após o ponto decimal.

Exemplo de Entrada
1.0 7.0
5.0 9.0

Exemplo de Saída
4.4721

Exemplo de Entrada
-2.5 0.4
12.1 7.3

Exemplo de Saída
16.1484

Exemplo de Entrada
2.5 -0.4
-12.2 7.0

Exemplo de Saída
16.4575

 */

package com.mateusborja.urionline.Iniciante.uri1015;

import java.util.Locale;
import java.util.Scanner;

public class uri1015 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x1, y1, x2, y2, distancia;

        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();

        distancia = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

        System.out.printf("%.4f%n", distancia);
        sc.close();

    }
}
