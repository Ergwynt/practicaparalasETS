
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
    
    
    public double dividir (double val1, double val2) {
        if (val2 != 0) 
            return (val1 / val2);
        else
            return (-1);
    }
    
}
