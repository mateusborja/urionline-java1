/*
 *
 *  * Copyright (c) 2020.  | All rights reserved
 *  * Mateus Borja // UX Designer • 3D Artist • Developer
 *  * www.mateusborja.life
 *
 *
 */

/*

Tipos de Triângulos
Leia 3 valores de ponto flutuante A, B e C e ordene-os em ordem decrescente, de modo que o
lado A representa o maior dos 3 lados. A seguir, determine o tipo de triângulo que estes
três lados formam, com base nos seguintes casos, sempre escrevendo uma mensagem adequada:

    se A ≥ B+C, apresente a mensagem: NAO FORMA TRIANGULO
    se A2 = B2 + C2, apresente a mensagem: TRIANGULO RETANGULO
    se A2 > B2 + C2, apresente a mensagem: TRIANGULO OBTUSANGULO
    se A2 < B2 + C2, apresente a mensagem: TRIANGULO ACUTANGULO
    se os três lados forem iguais, apresente a mensagem: TRIANGULO EQUILATERO
    se apenas dois dos lados forem iguais, apresente a mensagem: TRIANGULO ISOSCELES

Entrada
A entrada contem três valores de ponto flutuante de dupla precisão A (0 < A) , B (0 < B) e C (0 < C).

Saída
Imprima todas as classificações do triângulo especificado na entrada.

Exemplos de Entrada
7.0 5.0 7.0

Exemplos de Saída
TRIANGULO ACUTANGULO
TRIANGULO ISOSCELES

Exemplos de Entrada
6.0 6.0 10.0

Exemplos de Saída
TRIANGULO OBTUSANGULO
TRIANGULO ISOSCELES

Exemplos de Entrada
6.0 6.0 6.0

Exemplos de Saída
TRIANGULO ACUTANGULO
TRIANGULO EQUILATERO

Exemplos de Entrada
5.0 7.0 2.0

Exemplos de Saída
NAO FORMA TRIANGULO

Exemplos de Entrada
6.0 8.0 10.0

Exemplos de Saída
TRIANGULO RETANGULO

 */

package com.mateusborja.urionline.Iniciante.uri1045;

import java.util.Locale;
import java.util.Scanner;

public class uri1045 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();

        double A, B, C;

        if (n1 > n2 && n1 > n3) {
            A = n1;
            if (n2 > n3) {
                B = n2;
                C = n3;
            } else {
                B = n3;
                C = n2;
            }
        } else if (n2 > n3) {
            A = n2;
            if (n1 > n3) {
                B = n1;
                C = n3;
            } else {
                B = n3;
                C = n1;
            }
        } else {
            A = n3;
            if (n1 > n2) {
                B = n1;
                C = n2;
            } else {
                B = n2;
                C = n1;
            }
        }

        if (A >= B + C) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            // primeiro testar as tres possibilidades em relacao a angulos
            if (A * A == B * B + C * C) {
                System.out.println("TRIANGULO RETANGULO");
            } else if (A * A > B * B + C * C) {
                System.out.println("TRIANGULO OBTUSANGULO");
            } else {
                System.out.println("TRIANGULO ACUTANGULO");
            }

            // segundo testar se e equilatero ou isosceles
            if (A == B && B == C) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (A == B || A == C || B == C) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }

        sc.close();
    }

}




