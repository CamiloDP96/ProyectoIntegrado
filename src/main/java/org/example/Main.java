package org.example;

import org.example.Inventario.Empleado1;
import org.example.Inventario.Inventario;
import org.example.Producto.Producto;
import org.example.Venta.Empleado2;
import org.example.Venta.Venta;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        System.out.println("Proyecto Integrador \n");

        //String NomProduct = "Leche Entera Alpina  \n";
        //int PrecioProduct = 3100;

        //System.out.println("Nombre Producto:" + NomProduct);
        //System.out.println("Precio Producto: " + PrecioProduct);

       /* System.out.println("Por favor seleccione una opción del menú");
        System.out.println("1. Agregar un producto \n" + "2. Eliminar un producto \n" + "3. Actualizar un producto \n" + "4. Visualizar inventario \n" + "5. Pendiente \n" + "6. Contactar proveedores \n" + "7. Salir \n" + "-----------------");

        Scanner Product = new Scanner(System.in);
        int choice = Product.nextInt();

        switch (choice) {
            case 1:
                addProduct();
                //System.out.println("Agregar");
                break;
            case 2:
                removeProduct();
                //System.out.println("Eliminar");
                break;
            case 3:
                updateProduct();
                //System.out.println("Actualizar");
                break;
            case 4:
                ListInvetary();
                //System.out.println("Inventario");
                break;
            case 5:
                Pendiente();
                //System.out.println("Pendiente");
                break;
            case 6:
                ContactProveedor();
                //System.out.println("Proveedores");
                break;
            case 7:
                GoOut();
                //System.out.println("Salir");
                break;
            default:
                System.out.println("Opción invalida. Por favor intenta de nuevo.");
                break;

        }
        Menu(choice);
        addProduct();
        removeProduct();
        updateProduct();
        ListInvetary();
        Pendiente();
        ContactProveedor();
        GoOut();

        Scanner LecturaLetra = new Scanner(System.in);

        System.out.println("Por favor ingrese la letra por la que inicia el producto que busca: ");
        String Letra = LecturaLetra.next();
        //String Letra ="C";
        ProductInicial(Letra);


    }


    static void ProductInicial(String Letra) {

        String[] Product = {"Leche Entera Alpina", "Ablandacarnes El Rey", "Azucar Riopaila", "Arroz Diana Premium ", "Gaseosa Coca Cola Mini", "Lava Loza Blancox Lozacream Aloe y Rosas", "Salsa Picante La Constancia", "Yuca Croqueta Calypso", "Zen Bebida Frutos Rojos", "Galleta Tipo Leche Noel",
                "Frijoles Antioqueños Zenu", "Chocolates M&Ms Chocolate", "Chocolate Corona Vainilla", "Yogurt Alpina Mora", "Pack Jugo del Valle Frutas Citricas", "Kumis Alpina ", "Jamon Zenu", "Huevos Tipo AA", "Insecticida Raid Cucarachas y Chiripas", "Helado Popsy"};

        System.out.println("Los productos que inician por la letra "+Letra+ " son: ");

        //Impresión de productos que inician por una letra

        for (String Prod : Product) {
            if (Prod.startsWith(Letra)) {
                System.out.println(Prod + " .");
            }
        }

        //Impresión en orden alfabetico

        Arrays.sort(Product);
        System.out.println("Los productos ordenados alfabeticamente son: ");
        for (String Produ:Product){
            System.out.println(Produ+" ..");
        }

    }



    private static void Menu(int choise) {

        System.out.println(choise);
    }


    private static void addProduct() {
    }

    private static void removeProduct() {
    }

    private static void updateProduct() {
    }

    private static void ListInvetary() {
    }

    private static void Pendiente() {
    }

    private static void ContactProveedor() {
    }

    private static void GoOut() {
    } */
        LocalDate fecha = LocalDate.of(2025, 6, 12);
        Date miFecha = new Date();
        Producto producto = new Producto("A123","Leche",miFecha,"Alpina",34,"Nevera","Leche alpina descremada",2500);
        System.out.println(producto);

        Empleado2 empleado2 = new Empleado2("A321","Juan",23,"Vendedor",123454321,true);
        System.out.println(empleado2);
    }
}


