/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author Cabal
 */
public class POOP8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Actividad1---------------------------------------");
        // TODO code application logic here
        Poligono poligono = new Poligono();
        System.out.println("Poligono " + poligono);
        /* Las clases base pueden comportarse como sus subclases  */
        
        Object object = new Object();
        System.out.println("Objeto " + object);
        
        object = poligono;   
        System.out.println("Objeto " + object);
        
        Object objeto2 = poligono;
        Object objeto3 = new Poligono();
        
        System.out.println("Actividad2---------------------------------------");
        
        poligono = new Triangulo();
        System.out.println(poligono);
        selectorPoligonos(poligono);
        
        poligono = new Cuadrilatero();
        System.out.println(poligono);
        selectorPoligonos(poligono);
        
        poligono = new Poligono();
        System.out.println(poligono);
        selectorPoligonos(poligono);
        
        
        
        
    }
    
    public static void selectorPoligonos(Poligono poligono){
        if(poligono instanceof Triangulo){
            System.out.println("EL objeto es un triangulo ");
        }else if(poligono instanceof Cuadrilatero){
            System.out.println("El objeto es un cuadrilatero");
        }else if(poligono instanceof Poligono){
            System.out.println("El objeto es un poligono");
        }else{
            System.out.println("El objeto es otra figura");
        }
    }
}
