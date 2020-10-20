//java string type
package com.mateusborja.urionlinejava1.uri1009;

import java.util.Locale;
import java.util.Scanner;

public class uri1009 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nome;
        double salarioFixo;
        double vendas;
        double total;

        nome = sc.next();
        salarioFixo = sc.nextDouble();
        vendas = sc.nextDouble();

        total = salarioFixo + vendas * 0.15;
        System.out.printf("TOTAL = R$ %.2f%n", total);

        sc.close();

    }

}
