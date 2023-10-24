package org.example.Venta;

import org.example.Producto.Producto;
import org.example.Producto.ProductoComprado;

import java.util.*;
import java.util.stream.Collectors;

public class Venta {

    //Definición de atributo
    private int cantidadCompra;

    //Constructor
    public Venta(int cantidadCompra) {
        this.cantidadCompra = cantidadCompra;
    }
    public Venta() {}

    //Metodos getter y setter de cantidad de compra
    public int getCantidadCompra() {
        return cantidadCompra;
    }
    public void setCantidadCompra(int cantidadCompra) {
        this.cantidadCompra = cantidadCompra;
    }

    //Métodos de la clase Venta
    public void ventaProduct(Producto producto) {
        Scanner selec = new Scanner(System.in);

        int precioCompra = 0;
        int cantiCompra = 0;
        String nombreCompra = "";

        System.out.println("¿Desea ingresar un producto a la venta?");
        System.out.println("| 1. Si              |");
        System.out.println("| 2. No              |");

        //Este es el del do while que indica que mientras opcion1 sea diferente a 2 va a seguir ejerciendo el do while
        int opcion1 = selec.nextInt();

        //Scanner que recibe los parametros del nombre, precio y cantidad de compra
        Scanner compra = new Scanner(System.in);
        List<ProductoComprado> datosCompra = new ArrayList<>();

        do {
            switch (opcion1) {
                case 1:
                    System.out.println("Por favor ingrese el nombre del producto a comprar");
                    nombreCompra = compra.nextLine();

                    System.out.println("Por favor ingrese el precio del producto a comprar");
                    precioCompra = compra.nextInt();
                    compra.nextLine();
                    double IVA = 0.19;
                    double totalIva = precioCompra * IVA;
                    double total = totalIva + precioCompra;
                    double totalCompra = total * cantiCompra;
                    int conversiontotalCompra = (int) totalCompra;

                    System.out.println("Por favor ingrese la cantidad de " + nombreCompra + " que compra el cliente");
                    cantiCompra = compra.nextInt();
                    compra.nextLine();

                    ProductoComprado productoComprado = new ProductoComprado(nombreCompra,conversiontotalCompra,cantiCompra);
                    datosCompra.add(productoComprado);
                    break;
                case 2:
                    System.out.println("Salió del menú");
                    break;
                default:
                    System.out.println("La opción seleccionada no es valida");
                    break;
            }
            System.out.println("¿Desea ingresar otro producto a la venta?");
            System.out.println("| 1. Si              |");
            System.out.println("| 2. No              |");
            opcion1 = selec.nextInt();

        } while (opcion1 != 2);
        //System.out.println("Productos comprados:");
        //datosCompra.stream().forEach(d-> System.out.println("\n"));
    }

}
