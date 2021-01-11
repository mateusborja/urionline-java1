/*
 *
 *  * Copyright (c) 2020.  | All rights reserved
 *  * Mateus Borja // UX Designer • 3D Artist • Developer
 *  * www.mateusborja.life
 *
 *
 */

/*

Animal
Neste problema, você deverá ler 3 palavras que definem o tipo de animal possível
segundo o esquema abaixo, da esquerda para a direita.  Em seguida conclua qual dos
animais seguintes foi escolhido, através das três palavras fornecidas.

vertebrado
    - ave
        - carnivoro - aguia
        - onivoro - pomba
    - mamifero
        - onivoro - homem
        - herbivoro - vaca

invertebrado
    - inseto
        - hematofago - pulga
        - herbivoro - lagarta
    - anelideo
        - hematofago - sanguessuga
        - onivoro - minhoca

Entrada
A entrada contém 3 palavras, uma em cada linha, necessárias para identificar o animal
segundo a figura acima, com todas as letras minúsculas.

Saída
Imprima o nome do animal correspondente à entrada fornecida.

Exemplos de Entrada
vertebrado
mamifero
onivoro

Exemplos de Saída
homem

Exemplos de Entrada
vertebrado
ave
carnivoro

Exemplos de Saída
aguia

Exemplos de Entrada
invertebrado
anelideo
onivoro

Exemplos de Saída
minhoca

 */

package com.mateusborja.urionline.Iniciante.uri1049;

import java.util.Scanner;

public class uri1049 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String palavra1 = sc.nextLine();
        String palavra2 = sc.nextLine();
        String palavra3 = sc.nextLine();

        if (palavra1.equals("vertebrado")) {

            if (palavra2.equals("ave")) {

                if (palavra3.equals("carnivoro")) {
                    System.out.println("aguia");
                } else {
                    System.out.println("pomba");
                }

            } else {

                if (palavra3.equals("onivoro")) {
                    System.out.println("homem");
                } else {
                    System.out.println("vaca");

                }
            }
        } else {

            if (palavra2.equals("inseto")) {

                if (palavra3.equals("hematofago")) {
                    System.out.println("pulga");
                } else {
                    System.out.println("lagarta");

                }
            } else {

                if (palavra3.equals("hematofago")) {
                    System.out.println("sanguessuga");

                } else {
                    System.out.println("minhoca");

                }
            }
        }

        sc.close();
    }
}

