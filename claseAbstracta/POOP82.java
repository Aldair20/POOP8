/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseAbstracta;

/**
 * Actividad 3, diseño de una clase abstracta
 * @author Cabal
 */
public class POOP82 {
    public static void main(String[] args) {
        System.out.println("Actividad3----------------------------------------");
        
        //Poligono poligono = new Poligono(); no puede ser instanciado por que non existe un constructor que lo haga
        Poligono poligono;
        
        poligono = new Triangulo();
        System.out.println(poligono);
        
        poligono = new Cuadrilatero();
        System.out.println(poligono);   
    }
}
