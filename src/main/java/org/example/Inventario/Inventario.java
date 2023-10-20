package org.example.Inventario;

import org.example.Producto.Producto;

import java.util.Date;

public class Inventario extends Producto {

    //Método constructor proveniente de la super clase Producto
    public Inventario(String idProducto, String nombre, Date fechaVencimiento, String marca, int cantidad, String categoria, String descripcion, int precio) {
        super(idProducto, nombre, fechaVencimiento, marca, cantidad, categoria, descripcion, precio);
    }

    //Métodos de la clase Inventario
    public void validarInformacion(){
        System.out.println("El inventario valida la información ingresada");
    }
    public void almacenarProducto(){
        System.out.println("El inventario almacena el producto ingresado");
    }
    public void eliminarProducto(){
        System.out.println("El inventario elimina el producto");
    }
    public void modificarProducto(){
        System.out.println("El inventario modifica el producto");
    }

    //Métodos de empleados
    /*@Override
    public void registrar(){

    }
    @Override
    public void consultar(){

    }*/

    //Metodo toString
    @Override
    public String toString() {
        return "{ 'Id del producto':" + getIdProducto() + ", Nombre: " + getNombre() + ", Fecha de vencimiento del producto: " + getFechaVencimiento() +
                ", Marca: " + getMarca() + ", Cantidad: " + getCantidad() + ", Categoria: " + getCategoria() +", Descripción"+getDescripcion()+", Precio"+getPrecio()+ "}";
    }
}
