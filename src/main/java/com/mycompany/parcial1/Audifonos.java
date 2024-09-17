
package com.mycompany.parcial1;

// Clase Accesorio
public class Audifonos extends Producto {
    private String tipo;
 
    public Audifonos(String nombre, String descripcion, double precio, int cantidadEnInventario, String tipo) {
        super(nombre, descripcion, precio, cantidadEnInventario);
        this.tipo = tipo;
    }
 
    // Getters y Setters
    public String getTipo() {
        return tipo;
    }
 
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Audifonos{" + "tipo=" + tipo + '}';
    }
    
}

