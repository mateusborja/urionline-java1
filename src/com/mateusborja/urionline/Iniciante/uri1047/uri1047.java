/*
 *
 *  * Copyright (c) 2020.  | All rights reserved
 *  * Mateus Borja // UX Designer • 3D Artist • Developer
 *  * www.mateusborja.life
 *
 *
 */

/*

Tempo de Jogo com Minutos
Leia a hora inicial, minuto inicial, hora final e minuto final de um jogo.
A seguir calcule a duração do jogo.

Obs: O jogo tem duração mínima de um (1) minuto e duração máxima de 24 horas.

Entrada
Quatro números inteiros representando a hora de início e fim do jogo.

Saída
Mostre a seguinte mensagem: “O JOGO DUROU XXX HORA(S) E YYY MINUTO(S)” .

Exemplo de Entrada
7 8 9 10

Exemplo de Saída
O JOGO DUROU 2 HORA(S) E 2 MINUTO(S)

Exemplo de Entrada
7 7 7 7

Exemplo de Saída
O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)

Exemplo de Entrada
7 10 8 9

Exemplo de Saída
O JOGO DUROU 0 HORA(S) E 59 MINUTO(S)

 */

package com.mateusborja.urionline.Iniciante.uri1047;

import java.util.Locale;
import java.util.Scanner;

public class uri1047 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int horaInicial, minutoInicial, horaFinal, minutoFinal, dia;
        dia = 24;

        horaInicial = sc.nextInt();
        minutoInicial = sc.nextInt();
        horaFinal = sc.nextInt();
        minutoFinal = sc.nextInt();

        int instanteInicial = horaInicial * 60 + minutoInicial;
        int instanteFinal = horaFinal * 60 + minutoFinal;

        int duracao;
        if (instanteInicial < instanteFinal) {
            duracao = instanteFinal - instanteInicial;
        } else {
            duracao = (dia * 60 - instanteInicial) + instanteFinal;
        }

        int duracaoHoras = duracao / 60;
        int duracaoMinutos = duracao % 60;

        System.out.println("O JOGO DUROU " + duracaoHoras + " HORA(S) E " + duracaoMinutos + " MINUTO(S)");

        sc.close();

    }
}
