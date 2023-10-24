package org.example.Producto;

import org.example.Venta.Venta;

public class ProductoComprado {
    private String nomCompra;
    private int precioCompra;
    private int cantiCompra;

    //Metodos constructores
    public ProductoComprado() {
    }
    public ProductoComprado(String nomCompra, int precioCompra, int cantiCompra) {
        this.nomCompra = nomCompra;
        this.precioCompra = precioCompra;
        this.cantiCompra = cantiCompra;
    }

    //Metodos getter y setter
    public String getNomCompra() {
        return nomCompra;
    }

    public void setNomCompra(String nomCompra) {
        this.nomCompra = nomCompra;
    }

    public int getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(int precioCompra) {
        this.precioCompra = precioCompra;
    }

    public int getCantiCompra() {
        return cantiCompra;
    }

    public void setCantiCompra(int cantiCompra) {
        this.cantiCompra = cantiCompra;
    }

    //Metodo toString
    public String imprimirFactura(Venta venta) {
        return "ProductoComprado{" +
                "nomCompra='" + nomCompra + '\'' +
                ", precioCompra=" + precioCompra +
                ", cantiCompra=" + cantiCompra +
                '}';
    }

}
