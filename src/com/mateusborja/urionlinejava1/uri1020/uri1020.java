package com.mateusborja.urionlinejava1.uri1020;

import java.util.Locale;
import java.util.Scanner;

public class uri1020 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        int n, ano, mes,  resto,  quociente;

        n = entrada.nextInt();
        resto = n;

        ano = 365;
        quociente = n / ano;
        System.out.println(quociente + " ano(s)");
        resto = resto % ano;

        mes = 30;
        quociente = resto / mes;
        System.out.println(quociente + " mes(es)");
        resto = resto % mes;

        quociente = resto % 30;
        System.out.println(quociente + " dia(s)");

        entrada.close();

    }
}
