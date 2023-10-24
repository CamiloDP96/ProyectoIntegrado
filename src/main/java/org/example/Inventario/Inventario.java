package org.example.Inventario;

import org.example.Producto.Producto;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Inventario {

    //Método constructor vacio
    public Inventario(){}

    //Metodos getter y setter lista productos
    public List<Producto> getListaproductos() {
        return listaproductos;
    }

    public void setListaproductos(List<Producto> listaproductos) {
        this.listaproductos = listaproductos;
    }

    //Métodos de la clase Inventario
    List<Producto> listaproductos = new ArrayList<>();
    public void anadirProducto(Producto producto){
        if (!listaproductos.contains(producto)){
            listaproductos.add(producto);
        }
    }

    //Metodos inventario
    public void productoInventario(){
       System.out.println("  Productos en Inventario \n"+getListaproductos()+"\n");
   }

    public void eliminarProductoInventario(Producto producto){
        if (listaproductos.contains(producto)){
            listaproductos.removeIf(x->x.getIdProducto().equals(producto.getIdProducto()));
        }
    }

    public Optional<Producto> buscarProducto(String nombre){
        return listaproductos.stream().filter(producto -> producto.getNombre().equals(nombre)).findAny();
    }

    //Metodo toString

    @Override
    public String toString() {
        return "Inventario{" +
                "listaproductos=" + listaproductos +
                '}';
    }
}
