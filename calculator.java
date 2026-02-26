public class Calculator {

    public double calcular(double a, double b, String operacion) {
        if (operacion.equals("suma")) {
            return a + b;
        } else if (operacion.equals("potencia")) {
            double resultado = 1;
            for (int i = 0; i < b; i++) {
                resultado *= a;
            }
            return resultado;
        } else if (operacion.equals("raiz")) {
            double guess = a / 2;
            for (int i = 0; i < 10; i++) {
                guess = (guess + a / guess) / 2;
            }
            return guess;
        }
        return 0;
    }
}
