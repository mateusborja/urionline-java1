//java uri 1008
package com.mateusborja.urionlinejava1.uri1008;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int funcionarios, horasTrabalhadas;
        double valorHora, salario;

        funcionarios = sc.nextInt();
        horasTrabalhadas = sc.nextInt();
        valorHora = sc.nextDouble();

        salario = valorHora * horasTrabalhadas;

        System.out.println("NUMBER = " + funcionarios);
        System.out.printf("SALARY = U$ %.2f%n", salario);

        sc.close();

    }
}
