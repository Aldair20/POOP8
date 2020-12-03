/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 *
 * @author Cabal
 */
public class InstrumentoViento extends Object implements IntrumentoMusical {

    public InstrumentoViento() {
    }
    
    @Override
    public void tocar(){
        System.out.println("Estoy tocando el instrumentode viento ");
    }
    
    @Override
    public void afinar(){
        System.out.println("Estoy afinando un instrumento ");        
    }
    
    @Override
    public String tipoInstrumento(){
        return "InstrumentoViento {" + "}"; 
    }

    @Override
    public String toString() {
        return "InstrumentoViento{" + '}';
    }
    
    
}
