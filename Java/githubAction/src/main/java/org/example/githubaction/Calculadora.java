package org.example.githubaction;


/**
 * Clase encargada de realizar operaciones de suma y resta.
 *
 */
public class Calculadora {





    public Calculadora(){}

    /**
     * Método encargado de sumar dos numeros int y devolver el resultado en int
     * @param numero1 Primer número a sumar
     * @param numero2 Segundo número a sumar
     * @return Devuelve el resultado de ambos parámetros en int de la operación: numero1 + numero2
     */
    public int sumar(int numero1, int numero2){
        return  numero1 + numero2;
    }

    /**
     * Método encargado de restar  dos numeros int y devolver el resultado en int
     * @param numero1 Primer número a restar
     * @param numero2 Segundo número usado para restarselo al primer parámetro
     * @return Devuelve el resultado en int de la operación: numero1 - numero2
     */
    public int restar(int numero1, int numero2){return numero1-numero2;}


}
