/* Inventario.java
   Ejercicio 4 - Integrando conceptos:
   - Clase Producto (no pública) con validaciones
   - Clase Inventario con métodos sobrecargados para agregar productos
   - Manejo de errores para precios/cantidades negativas
*/
import java.util.ArrayList;

// Clase producto con validación en el constructor
class Producto {
    String nombre;
    double precio;
    int cantidad;

    public Producto(String nombre) {
        this(nombre, 0.0, 0);
    }

    public Producto(String nombre, double precio) {
        this(nombre, precio, 0);
    }

    public Producto(String nombre, double precio, int cantidad) {
        if (precio < 0) throw new IllegalArgumentException("Precio no puede ser negativo");
        if (cantidad < 0) throw new IllegalArgumentException("Cantidad no puede ser negativa");
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return nombre + " - Precio: " + precio + " - Cantidad: " + cantidad;
    }
}

public class Inventario {
    ArrayList<Producto> productos = new ArrayList<>();

    // Agrega solo nombre (precio 0, cantidad 0)
    public void agregarProducto(String nombre) {
        productos.add(new Producto(nombre));
    }

    // Agrega nombre y precio
    public void agregarProducto(String nombre, double precio) {
        productos.add(new Producto(nombre, precio));
    }

    // Agrega nombre, precio y cantidad (maneja error internamente)
    public void agregarProducto(String nombre, double precio, int cantidad) {
        try {
            productos.add(new Producto(nombre, precio, cantidad));
        } catch (IllegalArgumentException e) {
            System.out.println("Error al agregar producto: " + e.getMessage());
        }
    }

    public void mostrarProductos() {
        for (Producto p : productos) {
            System.out.println(p);
        }
    }

    public static void main(String[] args) {
        Inventario inv = new Inventario();
        inv.agregarProducto("Laptop");
        inv.agregarProducto("Celular", 1200.50);
        inv.agregarProducto("Teclado", 150.0, 10);
        // Este intento tiene precio negativo -> se atrapará el error y se mostrará mensaje
        inv.agregarProducto("Mouse", -50.0, 5);

        System.out.println("\nInventario de productos:");
        inv.mostrarProductos();
    }
}
