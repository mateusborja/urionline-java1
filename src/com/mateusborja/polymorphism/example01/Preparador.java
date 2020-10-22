package com.mateusborja.polymorphism.example01;

public class Preparador {

    public void prepararBebida(Bebida bebida) {
        System.out.println("Preparando a bebida" + bebida.getNome());
        bebida.preparar();

        if (bebida.isAquecer()) {
            System.out.println("A bebida " + bebida.getNome() + " foi preparada com sucesso\n");
        }

    }


}
