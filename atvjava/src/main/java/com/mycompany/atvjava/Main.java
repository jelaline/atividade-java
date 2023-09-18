/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.atvjava;

/**
 *
 * @author Aluno
 */
public class Main {

    public static void main(String[] args) {
        Televisao televisor = new Televisao(); 

        televisor.ligarVisor(); 

        televisor.aumentaVolume(); 
        televisor.aumentaVolume(); 

        televisor.subirCanal(); 

        televisor.mostraStatus(); 

        televisor.desligarVisor(); 
        
        televisor.AlterarCanal(11);

        televisor.mostraStatus(); 
    }
    }

