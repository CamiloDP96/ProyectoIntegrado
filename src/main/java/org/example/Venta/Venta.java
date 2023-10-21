package org.example.Venta;

import org.example.Producto.Producto;

import java.util.Arrays;
import java.util.Date;

public class Venta extends Producto {

    //Definición de atributo
    private int cantidadCompra;

    //Constructor de la super clase Producto
    public Venta(String idProducto, String nombre, String fechaVencimiento, String marca, int cantidad, String categoria, String descripcion, int precio,int cantidadCompra) {
        super(idProducto, nombre, fechaVencimiento, marca, cantidad, categoria, descripcion, precio);
        this.cantidadCompra=cantidadCompra;
    }

    //Metodos getter y setter de cantidad de compra
    public int getCantidadCompra() {
        return cantidadCompra;
    }

    public void setCantidadCompra(int cantidadCompra) {
        this.cantidadCompra = cantidadCompra;
    }

    //Métodos de la clase Venta
    public void datosVenta(){
        Arrays.asList(getNombre(),getMarca(),getCantidadCompra(),getPrecio()).forEach(x-> System.out.println(x));
    }
    public void validarInformacion(){
        System.out.println("El inventario valida la información ingresada");
    }
    public void almacenarProducto(){
        System.out.println("El inventario almacena el producto ingresado");
    }

    //Métodos extends de empleados
    /*@Override
    public void calcular() {
        System.out.println("La venta debe calcular cuanto es el total que debe pagar el cliente");
    }*/

    //Método toString
    @Override
    public String toString() {
        return "{ 'Nombre':" + getNombre() + ", Marca: " + getMarca() + ", Cantidad de compra: " + getCantidadCompra() + ", Precio"+getPrecio()+ "}";
    }
}
