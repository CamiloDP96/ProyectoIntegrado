package org.example.Venta;

import org.example.Empleados;

public class Empleado2 extends Empleados {

    //atributos definidos
    private boolean encargadoVentas;

    //Método constructor proveniente de la super clase empleados
    public Empleado2(String idEmpleado, String nombre, int edad, String cargo, int idDocumento,boolean encargadoVentas) {
        super(idEmpleado, nombre, edad, cargo, idDocumento);
        this.encargadoVentas=encargadoVentas;
    }

    //Métodos getter y setter encargado del inventario
    public  boolean getEncargadoVentas(){
        return encargadoVentas;
    }
    public void setEncargadoVentas(boolean encargadoVentas){
        this.encargadoVentas=encargadoVentas;
    }


    //Métodos extends de empleados
    @Override
    public void registrar(){
        System.out.println("El empleado 1 ha registrado los productos");
    }
    @Override
    public void organizar(){
        System.out.println("El empleado 1 ha organizado los productos");
    }
    @Override
    public void consultar() {
        System.out.println("Los empleado 1 ha consultado algunos productos");
    }
    @Override
    public void vender(){
        System.out.println("El producto fue vendido por el empleado 2");
    }
    @Override
    public void sugerir(){
        System.out.println("El empleado 2 sugiere el producto");
    }

    //Metodo toString
    @Override
    public String toString() {
        return "{ 'Id Empleado':" + getIdEmpleado() + ", Nombre: " + getNombre() + ", Edad: " + getEdad() + ", Cargo: "+getCargo()+ ", Id Documento: "+getIdDocumento()+", ¿Es la persona encargada de las ventas? "+getEncargadoVentas()+ "}";
    }
}
