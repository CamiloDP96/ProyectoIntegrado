package org.example.Model;

public class Product {

    private String Name;
    private double Price;
    private int Stock;

    public Product() {
        this.Name = Name;
        this.Price = Price;
        this.Stock = Stock;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    @Override
    public String toString() {
        return "{ 'name':" + Name + ", price:" + Price + ", stock:" + Stock + "}";
    }

    static void HayProducto(){

    }

    static void PrecioMayor(){

    }
    static void PrecioMenor(){

    }
    static void NombreProducto(){

    }

}
