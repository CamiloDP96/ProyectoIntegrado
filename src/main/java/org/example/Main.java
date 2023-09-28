package org.example;

import org.example.Model.Product;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Proyecto Integrador \n");

        //String NomProduct = "Leche Entera Alpina  \n";
        //int PrecioProduct = 3100;

        //System.out.println("Nombre Producto:" + NomProduct);
        //System.out.println("Precio Producto: " + PrecioProduct);

        System.out.println("Por favor seleccione una opción del menú");
        System.out.println("1. Agregar un producto \n"+"2. Eliminar un producto \n"+"3. Actualizar un producto \n"+"4. Visualizar inventario \n"+"5. Pendiente \n"+"6. Contactar proveedores \n"+"7. Salir \n"+"-----------------");

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
    }

        Product Producto = new Product();
}

