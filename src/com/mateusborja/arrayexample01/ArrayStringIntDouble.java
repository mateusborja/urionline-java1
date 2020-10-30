//java array with for if and else
package com.mateusborja.arrayexample01;

import java.util.Locale;
import java.util.Scanner;

public class ArrayStringIntDouble {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("qtd de pessoas: ");
        int n = sc.nextInt();

        String [] nome = new String[n];
        int [] idade = new int[n];
        double [] altura = new double[n];

        System.out.println();
        System.out.println("nome, idade e altura das " + n + " pessoas: ");
        for (int i = 0; i < n; i++) { // lendo meu array
            nome[i] = sc.next();
            idade [i] = sc.nextInt();
            altura[i] = sc.nextDouble();
        }

        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.printf("[Nome: %s], [Idade: %d anos], [Altura: %.2fm]%n", nome[i], idade[i], altura[i]);

        }


    }
}
