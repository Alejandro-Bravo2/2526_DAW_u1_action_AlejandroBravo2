package org.example.githubaction;

/**
 * Clase principal encargada de llamar a la clase Calculadora para realizar sus operaciones
 */
public class GithubActionApplication {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("Probando funcionalidad de sumar 1 +1");
        System.out.println(calc.sumar(1,1));



        System.out.println("Probando funcionalidad de restar 1 -1");
        System.out.println(calc.restar(1,1));
    }

}
