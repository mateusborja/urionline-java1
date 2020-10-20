//java Math.abs -  uri 1013
package com.mateusborja.urionlinejava1.uri1013;

import java.util.Locale;
import java.util.Scanner;

public class uri1013 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int a, b, c, maiorAB, maiorABC;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        maiorAB = (a + b + Math.abs(a - b)) / 2;

        maiorABC = (maiorAB + c + Math.abs(maiorAB - c)) / 2;

        System.out.println(maiorABC + " eh o maior");

        sc.close();

    }

}
