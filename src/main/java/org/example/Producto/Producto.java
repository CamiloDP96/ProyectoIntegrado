package org.example.Producto;

import java.util.Date;

public class Producto {

    //atributos definidas
    private String idProducto;
    private String nombre;
    private Date fechaVencimiento ;
    private String marca;
    private int cantidad;
    private String categoria;
    private String descripcion;
    private int precio;

    //Medtodo constructor
    public Producto(String idProducto,String nombre, Date fechaVencimiento, String marca, int cantidad, String categoria, String descripcion, int precio) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.fechaVencimiento = fechaVencimiento;
        this.marca = marca;
        this.cantidad = cantidad;
        this.categoria = categoria;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    //Metodos de la clase producto
    public void inventariar(){
        System.out.println("El producto fue inventariado exitosamente");
    }

    //Método que se extenderia de empleados
    public void organizar(){
        System.out.println("El producto fue organizado exitosamente");
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
    public Date getFechaVencimiento(){
        return fechaVencimiento;
    }
    public void setFechaVencimiento(Date fechaVencimiento){
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