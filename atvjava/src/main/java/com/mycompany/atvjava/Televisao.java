/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atvjava;

/**
 *
 * @author Aluno
 */
class Televisao {
     public int canal=1;
    public int volume=0;
    public boolean ligado;
    
    public void aumentaVolume(){
        if(ligado)
            if(volume < 100)
                volume =+ 1;
    }
    
    public void reduzirVolume(){
        if(ligado)
            if(volume > 0)
                volume =- 1;
    }
    
     public int AlterarCanal(int canal) {
	if (ligado){
            if (canal == 1 || canal == 3 || canal == 5 || canal == 7 || canal == 11){
                this.canal = canal;
                return canal;
        }
        }
        return -1;
     }
     
    
    public void subirCanal(){
        if(ligado)
            if(canal < 7)
                canal =+ 1;
    }
    
    public void descerCanal(){
        if(ligado)
            if(canal > 1)
                canal =- 1;   
    }
    
    public void ligarVisor(){
        ligado=true;
    }
    
    public void desligarVisor(){
        ligado=false;
    }
    
    public void mostraStatus(){
        if(ligado)
            System.out.println("Esta no canal "+canal+", no volume "+volume+" e o televisor esta ligado.");
        else
            System.out.println("O televisor esta desligado.");
            
            
    }
    
}

