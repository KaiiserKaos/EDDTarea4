package inventario;

/**
 * 
 * @author Laro
 * @version Ejercicio 3.1
 * @since 19-02-2025
 * 
 */

/**
 * Importación de librerías.
 */

import java.util.ArrayList;

public class Inventario {
    
    /**
     * Atributos.
     */
    
    public ArrayList<Producto> listaProductos;

    /**
     * Inicializa listaProductos
     */
    
    public Inventario() {
        listaProductos = new ArrayList<>();
    }
    
    /**
     * 
     * @param p 
     * 
     * Agrega parámetro a listaProductos
     */

    public void agregar(Producto p) {
        listaProductos.add(p);
    }
    
    /**
     * Muestra cada elemento de listaProductos con llamada al método mostrarInformacion()
     */

    public void mostrar() {
        for (int i = 0; i < listaProductos.size(); i++) {
            listaProductos.get(i).mostrarInformacion();
        }
    }
    
    /**
     * 
     * @param args 
     * 
     * Método principal.
     */

    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        Producto p1 = Producto.crearProducto("Laptop", 1200.99, 10);
        Producto p2 = Producto.crearProducto("Mouse", 25.50, 50);
        
        inventario.agregar(p1);
        inventario.agregar(p2);
        
        System.out.println("Inventario de productos:");
        inventario.mostrar();
    }
}