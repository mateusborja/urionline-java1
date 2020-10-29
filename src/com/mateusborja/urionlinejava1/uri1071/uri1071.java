// Soma de Impares Consecutivos I
package com.mateusborja.urionlinejava1.uri1071;

import java.util.Scanner;

public class uri1071 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        int min, max;

        //condicao crescente e consecutivo
        if(x < y) {
            min = x;
            max = y;

        } else {
            min = y;
            max = x;
        }

        int soma = 0;

        for (int i = min + 1; i < max ; i++) {
            //condicao numero impar
            if (i % 2 !=0) {
                soma = soma + i;
            }

        }

        System.out.println(soma);

        sc.close();

    }
}
