package org.example;

public abstract class Empleados implements TiendaInterface{

    //Variables definidas
    private String idEmpleado;
    private String nombre;
    private int edad;
    private String cargo;
    private int idDocumento;

    //Método constructor
    public Empleados(String idEmpleado, String nombre,int edad,String cargo, int idDocumento){
        this.idEmpleado=idEmpleado;
        this.nombre=nombre;
        this.edad=edad;
        this.cargo=cargo;
        this.idDocumento=idDocumento;
    }

    //Metodos getter and setter Id empleado
    public String getIdEmpleado(){
        return idEmpleado;
    }
    public void setIdEmpleado(String idEmpleado){
        this.idEmpleado=idEmpleado;
    }
    //Metodos getter and setter Nombre
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    //Metodos getter and setter edad
    public int getEdad(){
        return edad;
    }
    public void setEdad(int Edad){
        this.edad=edad;
    }
    //Metodos getter and setter cargo
    public String getCargo(){
        return cargo;
    }
    public void setCargo(String cargo){
        this.cargo=cargo;
    }
    //Metodos getter and setter Id documento
    public int getIdDocumento(){
        return idDocumento;
    }
    public void setIdDocumento(int idDocumento){
        this.idDocumento=idDocumento;
    }

    //Métodos de la clase empleados
    public void vender(){
        System.out.println("El producto fue vendido");
    }
    public void sugerir(){
        System.out.println("El vendedor sugiere el producto");
    }

    //Métodos implementados de la interfaz Tienda
    @Override
    public void organizar() {
        System.out.println("Los empleados organizan los productos");
    }
    @Override
    public void registrar() {
        System.out.println("Los empleados registran los productos");
    }
    @Override
    public void consultar() {
        System.out.println("Los empleados consultan los productos");
    }
    @Override
    public void calcular() {
        System.out.println("Los empleados calculan los precios del producto");
    }
}
