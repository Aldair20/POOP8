/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atributosInterfaz;
//esto es una interfaz, o interface
    //Atributos 
        //public static final

/**
 * Diseño de una interfaz que nos ayuda a acceder, al número y nombre del mes de forma más sencilla 
 * Atributos colocados como los meses, por número y letra
 * @author Cabal
 */
public interface Meses {
    
    int UNO = 1, DOS = 2, TRES = 3, CUATRO = 4, CINCO = 5, SEIS = 6;
    int  SIETE = 7, OCHO = 8, NUEVE = 9, DIEZ = 10, ONCE = 11, DOCE = 12;
    
    String[] NOMBRE_MESES = {"","enero","febrero","marzo","abril","mayo","junio","julio","agosto",
                                "septiembre","octubre","noviembre","diciembre"};
    
}
