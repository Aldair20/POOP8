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
public interface IntrumentoMusical { //una especie de contrato xd
    //Por defecto todos los métodos son public y son abstract 
    void tocar();
    void afinar();
    String tipoInstrumento();
    
}
