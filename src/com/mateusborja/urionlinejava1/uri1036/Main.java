//java uri 1036
package com.mateusborja.urionlinejava1.uri1036;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a, b, c, delta, x1, x2;

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        //formula de bascara
        delta = Math.pow(b, 2.0) - 4 * a * c;
        x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
        x2 = (-b - Math.sqrt(delta)) / (2.0 * a);

        if (a != 0 && delta > 0){
            System.out.printf("R1 = %.5f%n", + x1);
            System.out.printf("R2 = %.5f", x2);

        } else {
            System.out.println("Impossivel calcular");
        }





    }

}
