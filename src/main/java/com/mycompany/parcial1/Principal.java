package com.mycompany.parcial1;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    static ArrayList Productos = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

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

        for (int i = 0; i < productos.size(); i++) {
            System.out.println(i + " : " + productos.get(i).toString());
        }

    }

    public static void RealizarPedido(int opc) {
        Laptop laptop = new Laptop();
        Telefono telefono = new Telefono();
        Audifonos audifonos = new Audifonos;
        System.out.println("Seleccione el producto que desea comprar");

        while (true) {
            System.out.println("1.Telefono");
            System.out.println("2.Laptop");
            System.out.println("3.Audifonos");
            opc = Integer.parseInt(sc.nextLine());

            if (opc == 1) {
                Telfono(opc);
            } else if (opc == 2) {
                Laptop(opc);

            } else if (opc == 3) {
                Audifonos(opc);

            } else {
                System.out.println("Por favor ingrese una opcion correcta");
            }

           