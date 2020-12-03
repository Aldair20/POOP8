/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseAbstracta;

/**
 * Segunda subclase implementada de la clase abstracta Polígono
 * @author Cabal
 */
public class Cuadrilatero extends Poligono {
    private int alpha, beta;
    private float a, b, base, altura;
    
    /**
     * Constructor vacío
     */
    public Cuadrilatero() {
    }

    /**
     * Constructor que inializa los atributos presentados
     * @param alpha
     * @param beta
     * @param a
     * @param b
     * @param base
     * @param altura 
     */
    public Cuadrilatero(int alpha, int beta, float a, float b, float base, float altura) {
        this.alpha = alpha;
        this.beta = beta;
        this.a = a;
        this.b = b;
        this.base = base;
        this.altura = altura;
    }

    /**
     * Función getAlpha
     * @return El ángulo alpha
     */
    public int getAlpha() {
        return alpha;
    }

    /**
     * Cambio de valor
     * @param alpha 
     */
    public void setAlpha(int alpha) {
        this.alpha = alpha;
    }
    
    /**
     * Función getBeta()
     * @return El ángulo beta
     */
    public int getBeta() {
        return beta;
    }

    /**
     * Cambio de valor
     * @param beta 
     */
    public void setBeta(int beta) {
        this.beta = beta;
    }
    
    /**
     * Funcion getA()
     * @return el lado a
     */
    public float getA() {
        return a;
    }
    
    /**
     * Cambio de valor
     * @param a 
     */
    public void setA(float a) {
        this.a = a;
    }

    /**
     * Función getB
     * @return El lado b
     */
    public float getB() {
        return b;
    }

    /**
     * Cambio de valor
     * @param b 
     */
    public void setB(float b) {
        this.b = b;
    }

    /**
     * Funcion getBase
     * @return La base del cuadrilatero
     */
    public float getBase() {
        return base;
    }

    /**
     * Cambio de valor
     * @param base 
     */
    public void setBase(float base) {
        this.base = base;
    }

    /**
     * Función getAltura
     * @return La altura del cuadrilatero
     */
    public float getAltura() {
        return altura;
    }

    /**
     * Cambio de valor
     * @param altura 
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    /**
     * Tostring
     * @return Parametros con valores
     */
    @Override
    public String toString() {
        return "Cuadrilatero{" + "alpha=" + alpha + ", beta=" + beta + ", a=" + a + ", b=" + b + ", base=" + base + ", altura=" + altura + '}';
    }
    
    /**
     * Definición de los métodos de la clase abstracta
     * @return 
     */
    @Override //sobreeescritura pero del abstract de la clase poligono
    public float area(){
        return base*altura;
    }
    
    /**
     * Definicón de los métodos de la clase abstracta
     * @return 
     */
    @Override
    public float perimetro(){
        return (2 * a) + (2 * b);
    }
    
}
