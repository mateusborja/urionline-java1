package com.mateusborja.urionlinejava1.uri1038;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo, qtde;
        double preco;


        codigo = sc.nextInt();
        qtde = sc.nextInt();

        if (codigo == 1) {
            preco = qtde * 4.00;
            System.out.printf("Total: R$ %.2f%n ", preco);

        } else if(codigo == 2) {
            preco = qtde * 4.50;
            System.out.printf("Total: R$ %.2f%n ", preco);

        } else if (codigo == 3) {
            preco = qtde * 5.00;
            System.out.printf("Total: R$ %.2f%n ", preco);

        } else if (codigo == 4) {
            preco = qtde * 2.00;
            System.out.printf("Total: R$ %.2f%n ", preco);
        } else {
            preco = qtde * 1.50;
            System.out.printf("Total: R$ %.2f%n ", preco);

        }

        sc.close();
    }
}
