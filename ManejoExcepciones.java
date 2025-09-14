/* ManejoExcepciones.java
   Ejercicio 5 - Manejo de múltiples excepciones:
   - Captura NumberFormatException si el texto no es un número
   - Si el número es negativo, lanza NumeroNegativoException
*/
import java.util.Scanner;

public class ManejoExcepciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Ingrese un número entero: ");
            String input = sc.nextLine();
            int numero = Integer.parseInt(input); // Puede lanzar NumberFormatException

            if (numero < 0) {
                throw new NumeroNegativoException("Error: el número no puede ser negativo");
            }

            System.out.println("Número ingresado correctamente: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: debe ingresar un valor numérico válido");
        } catch (NumeroNegativoException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}
