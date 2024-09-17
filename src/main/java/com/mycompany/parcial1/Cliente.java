
package com.mycompany.parcial1;

import java.util.ArrayList;
 
public class Cliente {
    private String nombre;
    private String direccionEnvio;
    private ArrayList<Pedido> listaPedidos;
 
    public Cliente(String nombre, String direccionEnvio) {
        this.nombre = nombre;
        this.direccionEnvio = direccionEnvio;
        this.listaPedidos = new ArrayList<>();
    }
 
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 
    public String getDireccionEnvio() {
        return direccionEnvio;
    }
 
    public void setDireccionEnvio(String direccionEnvio) {
        this.direccionEnvio = direccionEnvio;
    }
 
    public ArrayList<Pedido> getListaPedidos() {
        return listaPedidos;
    }
 
    public void agregarPedido(Pedido pedido) {
        this.listaPedidos.add(pedido);
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", direccionEnvio=" + direccionEnvio + ", listaPedidos=" + listaPedidos + '}';
    }
    
}
