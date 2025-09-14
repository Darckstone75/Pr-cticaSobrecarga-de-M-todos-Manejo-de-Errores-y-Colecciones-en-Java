/* Calculadora.java
   Ejercicio 1 - Sobrecarga de métodos
   Esta clase demuestra tres métodos 'sumar' sobrecargados:
   - sumar(int, int)
   - sumar(int, int, int)
   - sumar(double, double)
*/
public class Calculadora {
    // Suma dos enteros
    public int sumar(int a, int b) {
        return a + b;
    }

    // Suma tres enteros
    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    // Suma dos decimales (double)
    public double sumar(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println("Suma de dos enteros: " + calc.sumar(5, 10));
        System.out.println("Suma de tres enteros: " + calc.sumar(2, 4, 6));
        System.out.println("Suma de dos decimales: " + calc.sumar(3.5, 4.7));
    }
}
