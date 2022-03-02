
package com.mycompany.calculadora;

/**
 * Esta clase contendrá los métodos que se encargan de realizar las diferentes operaciones.
 * @author local_user
 */
public class Operaciones {
    
   
    public Operaciones() {
    };
    
    /**
     * Realiza el producto de dos números
     * @param val1 - multiplicando.
     * @param val2 - multiplicador.
     * @return Devuelve el producto de val1 por val2.
     */
    public double multiplicar (double val1, double val2) {
        return (val1 * val2);
    }
    
/**
 * Este metodo servira para hacer divisiones 
 * mediante dos valores
 * @param val1 este es el valor 1 
 * @param val2 este es el valor 2
 * @return devuelve la division de val1 y val2
 */
    public double dividir (double val1, double val2) {
        if (val2 != 0) 
            return (val1 / val2);
        else
            return (-1);
    }
     
    public double sumar (double val1, double val2) {
        return (val1 + val2);
    }
    
}
