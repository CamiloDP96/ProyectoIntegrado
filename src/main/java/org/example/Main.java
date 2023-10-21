package org.example;
import org.example.Inventario.Inventario;
import org.example.Producto.Producto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("-----------------------------------\n");
        System.out.println("Proyecto Integrador \n");
        System.out.println("-----------------------------------\n");

        Inventario inventario = new Inventario();
        Producto producto = new Producto();

        int option = ejecucionMenu();
        while (option != 8) {

            switch (option) {
                case 1 -> producto.agregarProductoInventario(inventario);
                case 2 -> inventario.productoInventario();
                case 3 -> inventario.eliminarProductoInventario(producto);
                /*case 4 -> enrollStudentToCourse(academicService);
                case 5 -> findAProfessor(academicService);
                case 6 -> findAStudent(academicService);
                case 7 -> findACourse(academicService);*/
            }
            option = ejecucionMenu();
        }
    }

    private static int ejecucionMenu() {
        System.out.println("*----------------------------------------------*");
        System.out.println("| Por favor seleccione una opción:          |");
        System.out.println("| 1. Registrar un Producto                  |");
        System.out.println("| 2. Verificar inventario                   |");
        System.out.println("| 3. Eliminar un producto                   |");
        System.out.println("| 4. Imprimir factura                       |");
        System.out.println("| 5. Consultar un producto en inventario    |");
        System.out.println("| 6. Generar Venta                          |");
        System.out.println("| 7. Salir                                  |");
        System.out.println("*----------------------------------------------*");
        Scanner scanner = new Scanner(System.in);
        int option = 8;
        try {
            option = scanner.nextInt();
            if (option < 1 || option > 8) {
                System.out.println("| La opción que seleccionó no es valida. Por favor intente nuevamente |");
                ejecucionMenu();
            }
        } catch (Exception e) {
            System.out.println("| La opción que seleccionó no es valida. Por favor intente nuevamente |");
            ejecucionMenu();
        }
        return option;
    }
}


