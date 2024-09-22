package tech.unittests;

import org.junit.jupiter.api.Test;

import tech.calculadora.Calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

class CalculatorTest {

    @BeforeEach
    void setUp() {
        new Calculator();

    }

    // Adição
    @Test
    void testAdditionPositiveNumbers() {
        assertEquals(7, Calculator.somar(3, 4));
    }

    @Test
    void testAdditionNegativeNumbers() {
        assertEquals(-5, Calculator.somar(-2, -3));
    }

    // Subtração
    @Test
    void testSubtractionPositiveNumbers() {
        assertEquals(2, Calculator.subtrair(5, 3));
    }

    @Test
    void testSubtractionNegativeNumbers() {
        assertEquals(-1, Calculator.subtrair(2, 3));
    }

    // Multiplicação
    @Test
    void testMultiplicationPositiveNumbers() {
        assertEquals(12, Calculator.multiplicar(3, 4));
    }

    @Test
    void testMultiplicationNegativeNumbers() {
        assertEquals(6, Calculator.multiplicar(-2, -3));
    }

    // Fatorial
    @Test
    void testFactorialPositiveNumber() {
        Calculator calculator = new Calculator();
        assertEquals(120, calculator.factorial(5));
        assertEquals(1, calculator.factorial(0));
    }

    @Test
    void testFactorialNegativeNumber() {
        Calculator calculator = new Calculator();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.factorial(-1);
        });
        assertEquals("Negative number", exception.getMessage());
    }

    // Divisão por número decimal
    @Test
    void testDivisionPositiveNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(2.5, calculator.dividir(5, 2));
    }

    // Divisão por zero
    @Test
    void testDivisionByZero() {
        Calculator calculator = new Calculator();
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calculator.dividir(5, 0);
        });
        assertEquals("Divisão por zero", exception.getMessage());
    }

    // Potência
    @Test
    void testPowerPositiveBaseAndExponent() {
        Calculator calculator = new Calculator();
        assertEquals(8, calculator.potencia(2, 3));
    }

    @Test
    void testPowerNegativeBaseAndExponent() {
        Calculator calculator = new Calculator();
        assertEquals(4.0, calculator.potencia(-2, 2));
    }

    @Test
    void testPowerZeroBaseAndExponent() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.potencia(0, 0));
    }
}
