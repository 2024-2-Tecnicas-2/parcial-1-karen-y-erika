package com.mycompany.parcial1;

public class Producto {

    private String Nombre;
    private String Descripcion;
    private double Precio;
    private int cantidadInventario;

    // Constructor
    public Producto(String Nombre, String Descripcion, double Precio, int cantidadInventario) {
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.Precio = Precio;
        this.cantidadInventario = cantidadInventario;
    }
    // Métodos
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public int getCantidadInventario() {
        return cantidadInventario;
    }

    public void setCantidadInventario(int cantidadInventario) {
        this.cantidadInventario = cantidadInventario;
    }

    @Override
    public String toString() {
        return "Producto{" + "Nombre=" + Nombre + ", Descripcion=" + Descripcion + ", Precio=" + Precio + ", cantidadInventario=" + cantidadInventario + '}';
    }

}
