package tech.calculadora;

public class Calculator {

    public static double somar(double a, double b) {
        return a + b;
    }

    public static double subtrair(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero");
        }
        return a / b;
    }

    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Negative number");
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public double potencia(double base, int expoente) {
        if (expoente == 0) {
            return 1;
        }
        double resultado = 1;
        for (int i = 0; i < Math.abs(expoente); i++) {
            resultado *= base;
        }
        return expoente < 0 ? 1 / resultado : resultado;
    }
}
