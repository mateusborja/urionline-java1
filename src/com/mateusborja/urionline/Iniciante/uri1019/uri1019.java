/*
 *
 *  * Copyright (c) 2020.  | All rights reserved
 *  * Mateus Borja // UX Designer • 3D Artist • Developer
 *  * www.mateusborja.life
 *
 *
 */

/*

Conversão de Tempo
Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma
fábrica, e informe-o expresso no formato horas:minutos:segundos.

Entrada
O arquivo de entrada contém um valor inteiro N.

Saída
Imprima o tempo lido no arquivo de entrada (segundos), convertido para
horas:minutos:segundos, conforme exemplo fornecido.

Exemplo de Entrada
556

Exemplo de Saída

0:9:16
Exemplo de Entrada
1

Exemplo de Saída
0:0:1

Exemplo de Entrada
140153

Exemplo de Saída
38:55:53

 */

package com.mateusborja.urionline.Iniciante.uri1019;

import java.util.Scanner;

public class uri1019 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N, horas, minutos, segundos, resto;

        N = sc.nextInt();

        horas = N / 3600;
        resto = N % 3600;

        minutos = resto / 60;
        segundos = resto % 60;

        System.out.println(horas + ":" + minutos + ":" + segundos);

        sc.close();

    }
}
