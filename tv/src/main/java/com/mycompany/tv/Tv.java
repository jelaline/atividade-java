/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tv;

/**
 *
 * @author Edson
 */
public class Tv {
    private boolean ligada;
    private int canal;
    private int volume;
    private final int VOLUME_MAXIMO = 100;
    private final int VOLUME_MINIMO = 0;

    public Tv() {
        ligada = false;
        canal = 1;
        volume = 0;
    }

    public void ligarDesligar() {
        ligada = !ligada;
        if (!ligada) {
            canal = 1;  
            volume = 0; 
        }
    }

    public void alterarCanal(int novoCanal) {
        if (ligada && (novoCanal == 1 || novoCanal == 3 || novoCanal == 5 || novoCanal == 7 || novoCanal == 11)) {
            canal = novoCanal;
        } else {
            System.out.println("Não é possível alterar para o canal especificado.");
        }
    }

    public void aumentarVolume() {
        if (ligada && volume < VOLUME_MAXIMO) {
            volume++;
        }
    }

    public void diminuirVolume() {
        if (ligada && volume > VOLUME_MINIMO) {
            volume--;
        }
    }

    public void exibirStatus() {
        System.out.println("TV está ligada: " + ligada);
        System.out.println("Canal: " + canal);
        System.out.println("Volume: " + volume);
    }

    public static void main(String[] args) {
        Tv minhaTV = new Tv();

        minhaTV.ligarDesligar();
        minhaTV.alterarCanal(1);
        minhaTV.diminuirVolume();
        minhaTV.exibirStatus();

        minhaTV.ligarDesligar();
        minhaTV.exibirStatus();
    }
}
