package org.example.Producto;

import org.example.Inventario.Inventario;
import java.util.Scanner;
import java.util.Arrays;

public class Producto {

    //atributos definidas
    private String idProducto;
    private String nombre;
    private String fechaVencimiento ;
    private String marca;
    private int cantidad;
    private String categoria;
    private String descripcion;
    private int precio;

    //Medtodo constructor
    public Producto(String idProducto,String nombre, String fechaVencimiento, String marca, int cantidad, String categoria, String descripcion, int precio) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.fechaVencimiento = fechaVencimiento;
        this.marca = marca;
        this.cantidad = cantidad;
        this.categoria = categoria;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public Producto() {}

    //Metodos de la clase producto
    public void agregarProductoInventario(Inventario inventario){
        System.out.println("Por favor diligencie los siguientes datos para poder agregar el producto en el inventario");
        Scanner datos = new Scanner(System.in);
        System.out.println("Por favor ingrese el Id del producto");
        String id= datos.nextLine();
        System.out.println("Por favor ingrese el nombre del producto");
        String nombre= datos.nextLine();
        System.out.println("Por favor ingrese la fecha de vencimiento del producto");
        String fecha= datos.nextLine();
        System.out.println("Por favor ingrese la marca del producto");
        String marca= datos.nextLine();
        System.out.println("Por favor ingrese la cantidad de producto almacenada en el inventario");
        int cantidad= datos.nextInt();
        datos.nextLine();
        System.out.println("Por favor ingrese la categoria a la que pertenece el producto");
        String categoria= datos.nextLine();
        System.out.println("Por favor ingrese la descripción del producto");
        String descrip= datos.nextLine();
        System.out.println("Por favor ingrese el precio del producto");
        int precio= datos.nextInt();

        Producto producto = new Producto(id,nombre,fecha,marca,cantidad,categoria,descrip,precio);
        inventario.anadirProducto(producto);
    }

    public void retirarProducto(Inventario inventario){
        System.out.println("Por favor ingrese el nombre o el Id del producto que desea eliminar");
        Scanner retirarProduc = new Scanner(System.in);
        String retirarDatos= retirarProduc.nextLine();
    }


    // Metodos getter y setter Id Producto
    public String getIdProducto(){
        return idProducto;
    }
    public void setIdProducto(String idProducto){
        this.idProducto=idProducto;
    }
    // Metodos getter y setter nombre
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    // Metodos getter y setter fecha de vencimiento
    public String getFechaVencimiento(){
        return fechaVencimiento;
    }
    public void setFechaVencimiento(String fechaVencimiento){
        this.fechaVencimiento=fechaVencimiento;
    }
    // Metodos getter y setter marca
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca=marca;
    }
    // Metodos getter y setter cantidad
    public int getCantidad(){
        return cantidad;
    }
    public void setCantidad(int cantidad){
        this.cantidad=cantidad;
    }
    // Metodos getter y setter categoria
    public String getCategoria(){
        return categoria;
    }
    public void setCategoria(String categoria){
        this.categoria=categoria;
    }
    // Metodos getter y setter descripción
    public String getDescripcion(){
        return descripcion;
    }
    public void setDescripcion(String descripcion){
        this.descripcion=descripcion;
    }
    // Metodos getter y setter precio
    public int getPrecio(){
        return precio;
    }
    public void setPrecio(){
        this.precio=precio;
    }

    //Metodo toString
    @Override
    public String toString() {
        return "{ 'Id del producto':" + idProducto + ", Nombre: " + nombre + ", Fecha de vencimiento del producto: " + fechaVencimiento +
                ", Marca: " + marca + ", Cantidad: " + cantidad + ", Categoria: " + categoria +", Descripción: "+descripcion+", Precio: "+precio+ "}";
    }

}