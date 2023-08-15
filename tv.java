public class Tv {
    
     
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
