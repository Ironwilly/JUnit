package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

    @Test
    @DisplayName("1 + 1 = 2")
    void sumarDosNumeros() {
        Calculadora calculadora = new Calculadora();
        assertEquals(2, calculadora.sumar(1, 1), "1 + 1 debe ser igual a 2");

    }

    @Test
    @DisplayName("2 - 1 = 1")
    void restarDosNumeros() {
        Calculadora calculadora = new Calculadora();
        assertEquals(1, calculadora.restar(2, 1), "2 - 1 debe ser igual a 1");

    }

    @Test
    @DisplayName("2 * 2 = 4")
    void multiplicarrDosNumeros() {
        Calculadora calculadora = new Calculadora();
        assertEquals(4, calculadora.multiplicar(2, 2), "2 * 2 debe ser igual a 4");

    }

    @Test
    @DisplayName("10 / 5 = 2")
    void dividirDosNumeros() {
        Calculadora calculadora = new Calculadora();
        assertEquals(2, calculadora.dividir(10, 5), "10 / 5  debe ser igual a 2");


    }

}


