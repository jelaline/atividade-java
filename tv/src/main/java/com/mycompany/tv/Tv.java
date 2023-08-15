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
    private final int VOLUME_MAX = 100;
    private final int VOLUME_MIN = 0;

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

    public void pularCanal(int novoCanal) {
        if (ligada && (novoCanal == 1 || novoCanal == 3 || novoCanal == 5 || novoCanal == 7 || novoCanal == 11)) {
            canal = novoCanal;
        } else {
            System.out.println("Não terá como passar para o canal específico.");
        }
    }

    public void aumentarVolume() {
        if (ligada && volume < VOLUME_MAX) {
            volume++;
        }
    }

    public void diminuirVolume() {
        if (ligada && volume > VOLUME_MIN) {
            volume--;
        }
    }

    public void status() {
        System.out.println("TV está ligada: " + ligada);
        System.out.println("Canal: " + canal);
        System.out.println("Volume: " + volume);
    }

    public static void main(String[] args) {
        Tv minhaTV = new Tv();

        minhaTV.ligarDesligar();
        minhaTV.alterarCanal(1);
        minhaTV.diminuirVolume();
        minhaTV.status();

        minhaTV.ligarDesligar();
        minhaTV.status();
    }
}
