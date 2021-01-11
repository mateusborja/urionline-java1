/*
 *
 *  * Copyright (c) 2020.  | All rights reserved
 *  * Mateus Borja // UX Designer • 3D Artist • Developer
 *  * www.mateusborja.life
 *
 *
 */

/*

Tempo de um Evento
Pedrinho está organizando um evento em sua Universidade. O evento deverá ser no mês de Abril,
iniciando e terminando dentro do mês. O problema é que Pedrinho quer calcular o tempo que o evento
vai durar, uma vez que ele sabe quando inicia e quando termina o evento.

Sabendo que o evento pode durar de poucos segundos a vários dias, você deverá ajudar Pedrinho
a calcular a duração deste evento.

Entrada
Como entrada, na primeira linha vai haver a descrição “Dia”, seguido de um espaço e o dia do mês
no qual o evento vai começar. Na linha seguinte, será informado o momento no qual o evento vai
iniciar, no formato hh : mm : ss. Na terceira e quarta linha de entrada haverá outra informação
no mesmo formato das duas primeiras linhas, indicando o término do evento.

Saída
Na saída, deve ser apresentada a duração do evento, no seguinte formato:

W dia(s)
X hora(s)
Y minuto(s)
Z segundo(s)

Obs: Considere que o evento do caso de teste para o problema tem duração mínima de 1 minuto.

Exemplo de Entrada
Dia 5
08 : 12 : 23
Dia 9
06 : 13 : 23

Exemplo de Saída
3 dia(s)
22 hora(s)
1 minuto(s)
0 segundo(s)

 */

package com.mateusborja.urionline.Iniciante.uri1061;

import java.util.Locale;
import java.util.Scanner;

public class uri1061 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        int W1, X1, Y1, Z1, W2, X2, Y2, Z2, W, X, Y, Z, inicio, fim, duracao, resto;
        String s;

        s = entrada.next();
        W1 = entrada.nextInt();
        X1 = entrada.nextInt();
        s = entrada.next();
        Y1 = entrada.nextInt();
        s = entrada.next();
        Z1 = entrada.nextInt();
        s = entrada.next();
        W2 = entrada.nextInt();
        X2 = entrada.nextInt();
        s = entrada.next();
        Y2 = entrada.nextInt();
        s = entrada.next();
        Z2 = entrada.nextInt();

        inicio = W1*24*60*60 + X1*60*60 + Y1*60 + Z1;
        fim = W2*24*60*60 + X2*60*60 + Y2*60 + Z2;
        duracao = fim - inicio;

        W = duracao / (24*60*60);
        resto = duracao % (24*60*60);
        X = resto / (60*60);
        resto = resto % (60*60);
        Y = resto / 60;
        Z = resto % 60;

        System.out.println(W + " dia(s)");
        System.out.println(X + " hora(s)");
        System.out.println(Y + " minuto(s)");
        System.out.println(Z + " segundo(s)");

        entrada.close();

    }
}
