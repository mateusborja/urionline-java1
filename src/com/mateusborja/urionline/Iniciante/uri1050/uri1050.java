/*
 *
 *  * Copyright (c) 2020.  | All rights reserved
 *  * Mateus Borja // UX Designer • 3D Artist • Developer
 *  * www.mateusborja.life
 *
 *
 */

/*

DDD
Leia um número inteiro que representa um código de DDD para discagem interurbana.
Em seguida, informe à qual cidade o DDD pertence, considerando a tabela abaixo:

DDD
61 - Brasilia
71 - Salvador
11 - São Paulo
21 - Rio de Janeiro
32 - Juiz de Fora
19 - Campinas
27 - Vitoria
31 - Belo Horizonte

Se a entrada for qualquer outro DDD que não esteja presente na tabela acima, o programa
deverá informar:
DDD nao cadastrado

Entrada
A entrada consiste de um único valor inteiro.

Saída
Imprima o nome da cidade correspondente ao DDD existente na entrada. Imprima DDD
nao cadastrado caso não existir DDD correspondente ao número digitado.

 */

package com.mateusborja.urionline.Iniciante.uri1050;

import java.util.Scanner;

public class uri1050 {

    public static void main(String[] args) {

        int ddd = new Scanner(System.in).nextInt();

        switch (ddd) {
            case 61 -> System.out.println("Brasilia");
            case 71 -> System.out.println("Salvador");
            case 11 -> System.out.println("Sao Paulo");
            case 21 -> System.out.println("Rio de Janeiro");
            case 32 -> System.out.println("Juiz de Fora");
            case 19 -> System.out.println("Campinas");
            case 27 -> System.out.println("Vitoria");
            case 31 -> System.out.println("Belo Horizonte");
            default -> System.out.println("DDD nao cadastrado");

        }

    }
}
