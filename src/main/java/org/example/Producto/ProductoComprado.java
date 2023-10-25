package org.example.Producto;

import org.example.Venta.Venta;

public class ProductoComprado {
    private String nomCompra;
    private int precioCompra;
    private int cantiCompra;
    private int totalFinal;

    //Metodos constructores
    public ProductoComprado() {
    }
    public ProductoComprado(String nomCompra, int precioCompra, int cantiCompra,int totalFinal) {
        this.nomCompra = nomCompra;
        this.precioCompra = precioCompra;
        this.cantiCompra = cantiCompra;
        this.totalFinal=totalFinal;
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

    public int getTotalFinal() {
        return totalFinal;
    }
    public void setTotalFinal(int totalFinal) {
        this.totalFinal = totalFinal;
    }

    //Metodo toString
    @Override
    public String toString() {
        return "Producto= " + nomCompra +"  *  " + cantiCompra +"    " + precioCompra +" \n ";

    }
    /*public void mostrarFactura(){
        System.out.println("Producto: "+nomCompra+"  *  "+cantiCompra+"    "+precioCompra+"\n");
        System.out.println(totalFinal);
    }*/
}
