/* Division.java
   Ejercicio 2 - Manejo de errores (ArithmeticException)
   Pide dos enteros y realiza la división, capturando división entre cero.
*/
import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Ingrese el primer número entero: ");
            int num1 = sc.nextInt();
            System.out.print("Ingrese el segundo número entero: ");
            int num2 = sc.nextInt();

            // Puede lanzar ArithmeticException si num2 == 0
            int resultado = num1 / num2;
            System.out.println("Resultado de la división: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: división entre cero no permitida");
        } finally {
            sc.close();
        }
    }
}
