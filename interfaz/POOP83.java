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
public class POOP83 {
    public static void main(String[] args) {
        System.out.println("Actividad 4-----------------------------------------------------------------------------------");
        
        //IntrumentoMusical instrumento = new IntrumentoMusical();
        IntrumentoMusical instrumento;
        
        instrumento = new Flauta();
        instrumento.tocar();
        instrumento.afinar();
        System.out.println(instrumento.tipoInstrumento());
        System.out.println(instrumento);
    }
}
