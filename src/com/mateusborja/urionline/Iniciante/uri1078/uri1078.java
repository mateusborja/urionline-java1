/*
 *
 *  * Copyright (c) 2020.  | All rights reserved
 *  * Mateus Borja // UX Designer • 3D Artist • Developer
 *  * www.mateusborja.life
 *
 *
 */

//java for - uri 1078 - TABUADA
package com.mateusborja.urionline.Iniciante.uri1078;

import java.util.Scanner;

public class uri1078 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 1; i <=10; i++) {
            int produto = i * N;
            System.out.println(i + " x " + N + " = " + produto);

        }



    }
}
