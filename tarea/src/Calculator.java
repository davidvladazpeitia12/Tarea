public class Calculator {

    public double calcular(double a, double b, String operacion) {
        if (operacion.equals("suma")) {
            return a + b;
        } else if (operacion.equals("potencia")) {
            return calcularPotencia(a, b);
        } else if (operacion.equals("raiz")) {
            return calcularRaiz(a);
        }
        return 0;
    }

    private double calcularPotencia(double a, double b) {
        double resultado = 1;
        for (int i = 0; i < b; i++) {
            resultado *= a;
        }
        return resultado;
    }

    private double calcularRaiz(double a) {
        double guess = a / 2;
        for (int i = 0; i < 10; i++) {
            guess = (guess + a / guess) / 2;
        }
        return guess;
    }
}