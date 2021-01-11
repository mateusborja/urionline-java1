/*
 *
 *  * Copyright (c) 2020.  | All rights reserved
 *  * Mateus Borja // UX Designer • 3D Artist • Developer
 *  * www.mateusborja.life
 *
 *
 */

/*


Experiências
Maria acabou de iniciar seu curso de graduação na faculdade de medicina e precisa de sua
ajuda para organizar os experimentos de um laboratório o qual ela é responsável.
Ela quer saber no final do ano, quantas cobaias foram utilizadas no laboratório e o
percentual de cada tipo de cobaia utilizada.

Este laboratório em especial utiliza três tipos de cobaias: sapos, ratos e coelhos.
Para obter estas informações, ela sabe exatamente o número de experimentos que foram realizados,
o tipo de cobaia utilizada e a quantidade de cobaias utilizadas em cada experimento.

Entrada
A primeira linha de entrada contém um valor inteiro N que indica os vários casos de
teste que vem a seguir. Cada caso de teste contém um inteiro Quantia (1 ≤ Quantia ≤ 15)
que representa a quantidade de cobaias utilizadas e um caractere Tipo ('C', 'R' ou 'S'),
indicando o tipo de cobaia (R:Rato S:Sapo C:Coelho).

Saída
Apresente o total de cobaias utilizadas, o total de cada tipo de cobaia utilizada e o
percentual de cada uma em relação ao total de cobaias utilizadas, sendo que o percentual
deve ser apresentado com dois dígitos após o ponto.

Exemplo de Entrada
10
10 C
6 R
15 S
5 C
14 R
9 C
6 R
8 S
5 C
14 R

Exemplo de Saída
Total: 92 cobaias
Total de coelhos: 29
Total de ratos: 40
Total de sapos: 23
Percentual de coelhos: 31.52 %
Percentual de ratos: 43.48 %
Percentual de sapos: 25.00 %

 */
package com.mateusborja.urionline.Iniciante.uri1094;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class uri1094 {

    public static void main(String[] args) throws IOException {

        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.valueOf(sc.readLine());

        int totalCoelhos = 0;
        int totalSapos = 0;
        int totalRatos = 0;

        for (int i = 0; i < n; i++) {
            String info = sc.readLine();
            String infos[] = info.split(" ");
            int quantia = Integer.parseInt(infos[0]);

            char tipo = infos[1].toUpperCase().charAt(0);

            switch (tipo) {
                case 'C':
                    totalCoelhos += quantia;
                    break;
                case 'S':
                    totalSapos += quantia;
                    break;
                case 'R':
                    totalRatos += quantia;
                    break;
            }
        }

        int totalCobaias = totalCoelhos + totalRatos + totalSapos;
        System.out.printf("Total: %d cobaias%n", totalCobaias);
        System.out.printf("Total de coelhos: %d %n", totalCoelhos);
        System.out.printf("Total de ratos: %d %n", totalRatos);
        System.out.printf("Total de sapos: %d %n", totalSapos);

    }
}
