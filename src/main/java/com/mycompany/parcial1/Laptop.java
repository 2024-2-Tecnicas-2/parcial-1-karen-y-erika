package com.mycompany.parcial1;

// Clase Laptop
public class Laptop extends Producto {
    private String procesador;
    private int memoriaRAM;
 
    public Laptop(String nombre, String descripcion, double precio, int cantidadEnInventario, String procesador, int memoriaRAM) {
        super(nombre, descripcion, precio, cantidadEnInventario);
        this.procesador = procesador;
        this.memoriaRAM = memoriaRAM;
    }
 
    // Getters y Setters
    public String getProcesador() {
        return procesador;
    }
 
    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }
 
    public int getMemoriaRAM() {
        return memoriaRAM;
    }
 
    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }
<<<<<<< HEAD
}
=======
}
 
>>>>>>> b02a2766b6e2267220ce820e916147d4758388c8
