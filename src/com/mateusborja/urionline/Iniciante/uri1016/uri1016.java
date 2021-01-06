/*
 *
 *  * Copyright (c) 2020.  | All rights reserved
 *  * Mateus Borja // UX Designer • 3D Artist • Developer
 *  * www.mateusborja.life
 *
 *
 */

/*

Distância
Dois carros (X e Y) partem em uma mesma direção. O carro X sai com velocidade constante de
60 Km/h e o carro Y sai com velocidade constante de 90 Km/h.
Em uma hora (60 minutos) o carro Y consegue se distanciar 30 quilômetros do carro X, ou seja,
consegue se afastar um quilômetro a cada 2 minutos.

Leia a distância (em Km) e calcule quanto tempo leva (em minutos) para o carro Y tomar
essa distância do outro carro.

Entrada
O arquivo de entrada contém um número inteiro.

Saída
Imprima o tempo necessário seguido da mensagem "minutos".

Exemplo de Entrada
30

Exemplo de Saída
60 minutos

Exemplo de Entrada
110

Exemplo de Saída
220 minutos

Exemplo de Entrada
7

Exemplo de Saída
14 minutos

 */

package com.mateusborja.urionline.Iniciante.uri1016;

import java.util.Locale;
import java.util.Scanner;

public class uri1016 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, distanciaKm = 2, tempo;

        n = sc.nextInt();

        tempo = distanciaKm * n;

        System.out.printf("%d minutos%n", tempo);

        sc.close();

    }

}