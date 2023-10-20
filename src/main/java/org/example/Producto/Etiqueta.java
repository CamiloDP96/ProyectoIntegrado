package org.example.Producto;

public abstract class Etiqueta extends Categoria{
    @Override
    public void listar() {
        System.out.println("La etiqueta pertenece a la categoria");
    }
}
