package org.example.Inventario;

import org.example.Empleados;

public class Empleado1 extends Empleados {

        //Variables definidas
        private boolean encargadoInventario;

    //Método constructor proveniente de la super clase empleados
    public Empleado1(String idEmpleado, String nombre, int edad, String cargo, int idDocumento,boolean encargadoInventario) {
        super(idEmpleado, nombre, edad, cargo, idDocumento);
        this.encargadoInventario=encargadoInventario;
    }

    //Métodos getter y setter encargado del inventario
    public  boolean getEncargadoInventario(){
        return encargadoInventario;
    }
    public void setEncargadoInventario(boolean encargadoInventario){
        this.encargadoInventario=encargadoInventario;
    }

    //Métodos de la clase empleado1
    public void recibir(){
        System.out.println("El empleado 1 ha recibido todos los productos");
    }
    /*public void desempacar(){
        System.out.println("El empleado 1 ha desempacado todos los productos");
    } */
    public void inventariar(){
        System.out.println("El empleado 1 ha inventariado todos los productos");
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

}
