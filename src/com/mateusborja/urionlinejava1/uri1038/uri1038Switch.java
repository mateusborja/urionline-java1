package com.mateusborja.urionlinejava1.uri1038;

import java.util.Scanner;

public class uri1038Switch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o codigo do produto:");
        int codigo = sc.nextInt();

        System.out.println("Digite a quantidade:");
        int quantidade = sc.nextInt();

        double total = 0;
        switch (codigo) {

            case 1:
                total = quantidade * 4.0;
                System.out.printf("Total a pagar: %.2f%n", total);
                break;

            case 2:
                total  = quantidade  * 4.5;
                System.out.printf("Total a pagar: %.2f%n", total);
                break;

            case 3:
                total = quantidade * 5.0;
                System.out.printf("Total a pagar: %.2f%n", total);
                break;

            case 4:
                total = quantidade * 2.0;
                System.out.printf("Total a pagar: %.2f%n", total);
                break;

            case 5:
                total = quantidade * 1.5;
                System.out.printf("Total a pagar: %.2f%n", total);
                break;

            default: System.out.println("Codigo inválidio.");
                break;

        }

    }
}
