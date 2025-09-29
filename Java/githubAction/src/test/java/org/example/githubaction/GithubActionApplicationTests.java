package org.example.githubaction;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class GithubActionApplicationTests {

    private Calculadora calc;

    @BeforeEach
    void setUp(){
        this.calc = new Calculadora();
    }

    @Test
    void sumar() {
        int resultado = calc.sumar(1,2);
        assertEquals(3,resultado);
    }


    @Test
    void restar() {
        int resultado = calc.restar(2,2);
        assertEquals(0,resultado);
    }

}
