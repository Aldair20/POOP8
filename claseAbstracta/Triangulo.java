/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseAbstracta;

/**
 * La primer subclase "Triángulo" que hereda de la clase abstracta Poligono
 * @author Cabal
 */
public class Triangulo extends Poligono {
    private float a, b, c, base, altura;
    private int alpha, beta, gamma;
    
    /**
     * Construor vacío
     */
    public Triangulo() {
    }
    
    /**
     * Re
     * @param a, de tipo flotante, lado a del triángulo 
     * @param b, de tipo flotante, lado b del triángulo
     * @param c, de tipo flotante, lado c del triángulo
     * @param base, de tipo flotante, base del triángulo
     * @param altura, de tipo flotante, altura del triángulo
     * @param alpha, de tipo entero, ángulo alpha del triángulo
     * @param beta, de tipo entero, ángulo beta del triángulo
     * @param gamma, de tipo entero, ánuglo gamma del triángulo
     */
    public Triangulo(float a, float b, float c, float base, float altura, int alpha, int beta, int gamma) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.base = base;
        this.altura = altura;
        this.alpha = alpha;
        this.beta = beta;
        this.gamma = gamma;
    }
    
    /**
     * Función getA
     * @return El lado a
     */
    public float getA() {
        return a;
    }
    
    /**
     * Cambia valor
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
     * Función getC
     * @return El lado c
     */
    public float getC() {
        return c;
    }
    
    /**
     * Cambio de valor
     * @param c 
     */
    public void setC(float c) {
        this.c = c;
    }
    
    /**
     * Función getBase
     * @return La base del triángulo
     */
    public float getBase() {
        return base;
    }
    
    /**
     * Cambia de valor
     * @param base 
     */
    public void setBase(float base) {
        this.base = base;
    }
    
    /**
     * Función getAltura
     * @return La altura del triángulo
     */
    public float getAltura() {
        return altura;
    }

    /**
     * Cambia de valor
     * @param altura 
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }

    /**
     * Función getAlpha
     * @return El ánuglo alpha
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
     * Función getBeta
     * @return El ángulo beta
     */
    public int getBeta() {
        return beta;
    }
    
    /**
     * Cambia de valor
     * @param beta 
     */
    public void setBeta(int beta) {
        this.beta = beta;
    }
    
    /**
     * Función getGamma
     * @return 
     */
    public int getGamma() {
        return gamma;
    }
    
    /**
     * Cambia de valor
     * @param gamma 
     */
    public void setGamma(int gamma) {
        this.gamma = gamma;
    }

    /**
     * Cada uno de los atributos son mostrados
     * @return Tipo string, valor almacenado
     */
    @Override
    public String toString() {
        return "Triangulo{" + "a=" + a + ", b=" + b + ", c=" + c + ", base=" + base + ", altura=" + altura + ", alpha=" + alpha + ", beta=" + beta + ", gamma=" + gamma + '}';
    }
    
    /**
     * Aquí se implementan los métodos colocados en la clase abstracta, Método area.
     * @return El área del triángulo
     */
    @Override
    public float area(){ //sobreeescritura pero del abstract de la clase poligono
        return (base*altura)/2;
    }
    
    /**
     * Implementación del método, perímetro. 
     * @return El perímetro del triángulo
     */
    @Override
    public float perimetro(){
        return a + b + c;
    }
}
