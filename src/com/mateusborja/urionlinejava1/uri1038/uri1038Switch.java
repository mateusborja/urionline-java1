package com.mateusborja.urionlinejava1.uri1038;

import java.util.Scanner;

public class uri1038Switch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o codigo do produto:");
        int codigo = sc.nextInt();
        int quantidade;

        double total;
        switch (codigo) {
            case 1 -> {
                System.out.println("Digite a quantidade:");
                quantidade = sc.nextInt();
                total = quantidade * 4.0;
                System.out.printf("Total a pagar: %.2f%n", total);
            }
            case 2 -> {
                System.out.println("Digite a quantidade:");
                quantidade = sc.nextInt();
                total = quantidade * 4.5;
                System.out.printf("Total a pagar: %.2f%n", total);
            }
            case 3 -> {
                System.out.println("Digite a quantidade:");
                quantidade = sc.nextInt();
                total = quantidade * 5.0;
                System.out.printf("Total a pagar: %.2f%n", total);
            }
            case 4 -> {
                System.out.println("Digite a quantidade:");
                quantidade = sc.nextInt();
                total = quantidade * 2.0;
                System.out.printf("Total a pagar: %.2f%n", total);
            }
            case 5 -> {
                System.out.println("Digite a quantidade:");
                quantidade = sc.nextInt();

                total = quantidade * 1.5;
                System.out.printf("Total a pagar: %.2f%n", total);
            }
            default -> System.out.println("Codigo inválidio.");
        }

    }
}
