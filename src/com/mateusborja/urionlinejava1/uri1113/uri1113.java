//java while with if and else
package com.mateusborja.urionlinejava1.uri1113;


import java.util.Scanner;

public class uri1113 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();

        while (X!= Y) {
            if (X < Y) {
                System.out.println("Crescente");
            } else {
                System.out.println("Decrescente");
            }

            X = sc.nextInt();
            Y = sc.nextInt();
        }

        sc.close();

    }
}
