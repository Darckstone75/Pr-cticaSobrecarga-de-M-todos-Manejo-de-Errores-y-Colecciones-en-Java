/* ListaEstudiantes.java
   Ejercicio 3 - Uso de ArrayList<String>
   - Agrega 5 nombres
   - Muestra la lista completa
   - Elimina el tercer nombre (índice 2)
   - Muestra los nombres restantes
*/
import java.util.ArrayList;

public class ListaEstudiantes {
    public static void main(String[] args) {
        ArrayList<String> estudiantes = new ArrayList<>();

        // Agregando al menos 5 nombres
        estudiantes.add("Carlos");
        estudiantes.add("Ana");
        estudiantes.add("Pedro");
        estudiantes.add("Lucía");
        estudiantes.add("María");

        System.out.println("Lista completa de estudiantes:");
        for (String nombre : estudiantes) {
            System.out.println(nombre);
        }

        // Eliminar el tercer nombre ingresado (índice 2 -> "Pedro")
        System.out.println("\nEliminando el tercer nombre (índice 2)...");
        estudiantes.remove(2);

        // Mostrar la lista restante
        System.out.println("\nLista después de la eliminación:");
        for (String nombre : estudiantes) {
            System.out.println(nombre);
        }
    }
}
