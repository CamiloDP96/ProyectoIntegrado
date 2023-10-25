package org.example.Venta;

import org.example.Producto.Producto;
import org.example.Producto.ProductoComprado;

import java.util.*;

public class Venta {

    //Definición de atributo
    private int cantidadCompra;
    List<ProductoComprado> datosCompra = new ArrayList<>();
    List<Integer> precios = new ArrayList<>();
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

    //Metodos getter y setter de Lista datos compra
    public List<ProductoComprado> getDatosCompra() {return datosCompra;}
    public void setDatosCompra(List<ProductoComprado> datosCompra) {this.datosCompra = datosCompra;}

    //Metodos getter y setter de lista precios
    public List<Integer> getPrecios() {
        return precios;
    }
    public void setPrecios(List<Integer> precios) {
        this.precios = precios;
    }

    //Métodos de la clase Venta
    public void ventaProduct(Producto producto) {
        Scanner selec = new Scanner(System.in);

        int cantiCompra = 0;
        String nombreCompra = "";
        int totalFinal=0;
        int conversiontotalCompra=0;

        //Scanner que recibe los parametros del nombre, precio y cantidad de compra
        Scanner compra = new Scanner(System.in);

        System.out.println("¿Desea ingresar un producto a la venta?");
        System.out.println("| 1. Si              |");
        System.out.println("| 2. No              |");
        //Este es el del do while que indica que mientras opcion1 sea diferente a 2 va a seguir ejerciendo el do while
        int opcion1 = selec.nextInt();

        do {
            switch (opcion1) {
                case 1:
                    System.out.println("Por favor ingrese el nombre del producto a comprar");
                    nombreCompra = compra.nextLine();

                    System.out.println("Por favor ingrese el precio del producto a comprar");
                    int precioCompra = compra.nextInt();
                    compra.nextLine();

                    System.out.println("Por favor ingrese la cantidad de " + nombreCompra + " que compra el cliente");
                    cantiCompra = compra.nextInt();
                    compra.nextLine();

                    double IVA = 0.19;
                    double totalIva = precioCompra * IVA;
                    double total = totalIva + precioCompra;
                    double totalCompra = total * cantiCompra;
                    conversiontotalCompra = (int) totalCompra;

                    ProductoComprado productoComprado = new ProductoComprado(nombreCompra, conversiontotalCompra, cantiCompra,totalFinal);
                    datosCompra.add(productoComprado);

                    precios.add(conversiontotalCompra);
                    totalFinal= precios.stream().mapToInt(Integer::intValue).sum();

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

        ProductoComprado productoComprado = new ProductoComprado();
        productoComprado.toString();
        System.out.println("*----------------------------------------------*");
        System.out.println("        PRODUCTOS COMPRADOS  ");
        System.out.println(getDatosCompra()+"\n");
        System.out.println("Total de la compra: "+totalFinal);
        System.out.println("*----------------------------------------------*");
    }
}
