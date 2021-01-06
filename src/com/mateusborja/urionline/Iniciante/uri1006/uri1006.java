/*
 *
 *  * Copyright (c) 2020.  | All rights reserved
 *  * Mateus Borja // UX Designer • 3D Artist • Developer
 *  * www.mateusborja.life
 *
 *
 */

/*
Média 2
Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de um aluno.
A seguir, calcule a média do aluno, sabendo que a nota A tem peso 2, a nota B
tem peso 3 e a nota C tem peso 5. Considere que cada nota pode ir de 0 até 10.0,
sempre com uma casa decimal.

Entrada
O arquivo de entrada contém 3 valores com uma casa decimal, de dupla precisão (double).

Saída
Imprima a mensagem "MEDIA" e a média do aluno conforme exemplo abaixo, com 1 dígito
 após o ponto decimal e com um espaço em branco antes e depois da igualdade.
 Assim como todos os problemas, não esqueça de imprimir o fim de linha após o
 resultado, caso contrário, você receberá "Presentation Error".

Exemplos de Entrada
5.0
6.0
7.0

Exemplos de Saída
MEDIA = 6.3

Exemplos de Entrada
5.0
10.0
10.0

Exemplos de Saída
MEDIA = 9.0

Exemplos de Entrada
10.0
10.0
5.0

Exemplos de Saída
MEDIA = 7.5

 */

package com.mateusborja.urionline.Iniciante.uri1006;

import java.util.Locale;
import java.util.Scanner;

public class uri1006 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double nota1, nota2, nota3, A, B, C, media, soma;

        A = 2.0;
        B = 3.0;
        C = 5.0;
        soma = 10.0;

        nota1 = sc.nextDouble();
        nota2 = sc.nextDouble();
        nota3 = sc.nextDouble();

        media = (nota1 * A + nota2 * B + nota3 * C) / soma;
        System.out.printf("MEDIA = %.1f%n", media);

        sc.close();

    }

}
