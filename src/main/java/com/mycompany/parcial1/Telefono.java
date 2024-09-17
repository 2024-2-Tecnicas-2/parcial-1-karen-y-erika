package com.mycompany.parcial1;
// Clase Telefono

public class Telefono extends Producto {

    private String marca;
    private String modelo;

    public Telefono(String nombre, String descripcion, double precio, int cantidadEnInventario, String marca, String modelo) {
        super(nombre, descripcion, precio, cantidadEnInventario);
        this.marca = marca;
        this.modelo = modelo;
    }

// Getters y Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Telefono{" + "marca=" + marca + ", modelo=" + modelo + '}';
    }

}
