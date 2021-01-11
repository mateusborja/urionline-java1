/*
 *
 *  * Copyright (c) 2020.  | All rights reserved
 *  * Mateus Borja // UX Designer • 3D Artist • Developer
 *  * www.mateusborja.life
 *
 *
 */

/*

Tempo de Jogo
Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo,
sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração
mínima de 1 hora e máxima de 24 horas.

Entrada
A entrada contém dois valores inteiros representando a hora de início e a hora de fim
do jogo.

Saída
Apresente a duração do jogo conforme exemplo abaixo.

Exemplo de Entrada
16 2

Exemplo de Saída
O JOGO DUROU 10 HORA(S)

Exemplo de Entrada
0 0

Exemplo de Saída
O JOGO DUROU 24 HORA(S)

Exemplo de Entrada
2 16

Exemplo de Saída
O JOGO DUROU 14 HORA(S)

 */

package com.mateusborja.urionline.Iniciante.uri1046;

import java.util.Locale;
import java.util.Scanner;

public class uri1046 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner((System.in));

        int horaInicial, horaFinal, duracao, dia;
        dia = 24;

        horaInicial = sc.nextInt();
        horaFinal = sc.nextInt();

        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        } else {
            duracao = dia - horaInicial + horaFinal;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");


        sc.close();



    }
}
