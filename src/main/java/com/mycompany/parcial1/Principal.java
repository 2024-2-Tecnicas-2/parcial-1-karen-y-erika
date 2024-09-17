package com.mycompany.parcial1;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        int opc;
        while (true) {
            System.out.println("1.Ver catalogo");
            System.out.println("2.Realizar pedido");
            System.out.println("3.Editar pedido");
            System.out.println("4.Ver inventario");
            opc = Integer.parseInt(sc.nextLine());

            if (opc == 1) {
                verProductos(opc);
            } else if (opc == 2) {
                RealizarPedido(opc);

            } else if (opc == 3) {
                editarPedido(opc);

            } else if (opc == 4) {
                Inventario(opc);

            } else {
                System.out.println("Por favor ingrese una opcion correcta");
            }

        }

    }

     public static void verProductos(int opc) {
        Revista revista = new Revista();
        Libro libro = new Libro();
        System.out.println("");

        switch (opc) {
            case 1:
                System.out.println("Ingrese el nombre de la revista: ");
                String Nombre = sc.nextLine();
                revista.setTitulo(Nombre);
                System.out.println("Ingrese el año de publicación: ");
                int ano = Integer.parseInt(sc.nextLine());
                revista.setAnoPublicacion(ano);
                System.out.println("Ingrese el numero de la revista: ");
                int numbrevista = Integer.parseInt(sc.nextLine());
                revista.setNumeroRevistas(numbrevista);
                System.out.println("Ingrese el titulo de la revista: ");
                String nombRevista = sc.nextLine();
                revista.setNombreRevista(nombRevista);
                publicaciones.add(revista);
}



    
    
}
