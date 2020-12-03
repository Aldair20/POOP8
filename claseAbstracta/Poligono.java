/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseAbstracta;

/**
 * Clase abstracta "Poligono"
 * @author Cabal
 */
public abstract class Poligono {
    /**
     * abstracción del método que nos devolvera el area del poligono
     * @return 
     */
    public abstract float area();
    
    /**
     * metodo abstracto del perimetro
     * @return 
     */
    public abstract float perimetro();
    
    /**
     * El toString únicamente muestra que se trata de una clase abstracta poligono 
     * @return 
     */
    @Override
    public String toString() {
        return "Poligono{" + '}';
    }
    
}
