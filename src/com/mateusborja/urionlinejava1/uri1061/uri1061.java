package com.mateusborja.urionlinejava1.uri1061;

import java.util.Locale;
import java.util.Scanner;

public class uri1061 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        int W1, X1, Y1, Z1, W2, X2, Y2, Z2, W, X, Y, Z, inicio, fim, duracao, resto;
        String s;

        s = entrada.next();
        W1 = entrada.nextInt();
        X1 = entrada.nextInt();
        s = entrada.next();
        Y1 = entrada.nextInt();
        s = entrada.next();
        Z1 = entrada.nextInt();
        s = entrada.next();
        W2 = entrada.nextInt();
        X2 = entrada.nextInt();
        s = entrada.next();
        Y2 = entrada.nextInt();
        s = entrada.next();
        Z2 = entrada.nextInt();

        inicio = W1*24*60*60 + X1*60*60 + Y1*60 + Z1;
        fim = W2*24*60*60 + X2*60*60 + Y2*60 + Z2;
        duracao = fim - inicio;

        W = duracao / (24*60*60);
        resto = duracao % (24*60*60);
        X = resto / (60*60);
        resto = resto % (60*60);
        Y = resto / 60;
        Z = resto % 60;

        System.out.println(W + " dia(s)");
        System.out.println(X + " hora(s)");
        System.out.println(Y + " minuto(s)");
        System.out.println(Z + " segundo(s)");

        entrada.close();

    }
}
