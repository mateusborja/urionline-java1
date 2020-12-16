/*
 *
 *  * Copyright (c) 2020.  | All rights reserved
 *  * Mateus Borja // UX Designer • 3D Artist • Developer
 *  * www.mateusborja.life
 *
 *
 */

package com.mateusborja.urionlinejava1.uri1047;

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
