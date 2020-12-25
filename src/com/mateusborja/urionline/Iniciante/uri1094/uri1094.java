/*
 *
 *  * Copyright (c) 2020.  | All rights reserved
 *  * Mateus Borja // UX Designer • 3D Artist • Developer
 *  * www.mateusborja.life
 *
 *
 */

package com.mateusborja.urionline.Iniciante.uri1094;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class uri1094 {

    public static void main(String[] args) throws IOException {

        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.valueOf(sc.readLine());

        int totalCoelhos = 0;
        int totalSapos = 0;
        int totalRatos = 0;

        for (int i = 0; i < n; i++) {
            String info = sc.readLine();
            String infos[] = info.split(" ");
            int quantia = Integer.parseInt(infos[0]);

            char tipo = infos[1].toUpperCase().charAt(0);

            switch (tipo) {
                case 'C':
                    totalCoelhos += quantia;
                    break;
                case 'S':
                    totalSapos += quantia;
                    break;
                case 'R':
                    totalRatos += quantia;
                    break;
            }
        }

        int totalCobaias = totalCoelhos + totalRatos + totalSapos;
        System.out.printf("Total: %d cobaias%n", totalCobaias);
        System.out.printf("Total de coelhos: %d %n", totalCoelhos);
        System.out.printf("Total de ratos: %d %n", totalRatos);
        System.out.printf("Total de sapos: %d %n", totalSapos);

    }
}
