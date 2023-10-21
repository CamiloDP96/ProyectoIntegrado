package org.example.Inventario;

import org.example.Producto.Producto;

import java.util.ArrayList;
import java.util.List;

public class Inventario {

    //Método constructor vacio
    public Inventario(){}

    //Métodos de la clase Inventario
    List<Producto> listaproductos = new ArrayList<>();
    public void anadirProducto(Producto producto){
        if (!listaproductos.contains(producto)){
            listaproductos.add(producto);
        }
    }

    //Metodos getter y setter lista productos
    public List<Producto> getListaproductos() {
        return listaproductos;
    }

    public void setListaproductos(List<Producto> listaproductos) {
        this.listaproductos = listaproductos;
    }

    //Metodos inventario
    public void productoInventario(){
       System.out.println("  Productos en Inventario \n"+getListaproductos()+"\n");
   }
    public void eliminarProductoInventario(Producto producto){
        if (listaproductos.contains(producto)){
            listaproductos.remove(producto);
        }

    }

    //Metodo toString

    @Override
    public String toString() {
        return "Inventario{" +
                "listaproductos=" + listaproductos +
                '}';
    }
}
