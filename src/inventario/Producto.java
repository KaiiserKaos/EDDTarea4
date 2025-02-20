package inventario;

/**
 * 
 * @author Laro
 * @version Ejercicio 3.1
 * @since 19-02-2025
 * 
 */

public class Producto {
    
    /**
     * 
     * @param nombre
     * @param precio
     * @param stock
     * @return Producto(nombre, precio, stock)
     * 
     * Sobreescribe el método Producto. Método de fábrica.
     * 
     */

    public static Producto crearProducto(String nombre, double precio, int stock) {
        return new Producto(nombre, precio, stock);
    }
    
    /**
     * Atributos
     */
    
    private String nombre;
    private double precio;
    private int stock;
    
    /**
     * 
     * @param nombre
     * @param precio
     * @param stock 
     * 
     * Constructor.
     * 
     */

    private Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    
    /**
     * Muestra información del objeto. Similar a toString.
     */

    public void mostrarInformacion() {
        System.out.println("Producto: " + getNombre() + " | Precio: " + getPrecio() + " | Stock: " + getStock());
    }


    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(int stock) {
        this.stock = stock;
    }
}