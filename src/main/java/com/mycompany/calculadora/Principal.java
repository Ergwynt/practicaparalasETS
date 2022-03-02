package com.mycompany.calculadora;

/**
 * Esta clase contiene la función main desde la que crearemos la instancia de la clase operaciones
 * que contiene los métodos que realizan las diferentes operaciones
 * @author Juán Jesús
 */
public class Principal {
    public static void main(String[] args) {
        int valor1 = 6;
        int valor2 = 2;
        
        Operaciones oper = new Operaciones ();
        System.out.print("El resultado de multiplicar valor1 por valor2 es ");
        System.out.println(oper.multiplicar(valor1, valor2));
        System.out.print("El resultado de dividir valor1 entre valor2 es ");
        System.out.println(oper.dividir(valor1, valor2));
    }
    
}
