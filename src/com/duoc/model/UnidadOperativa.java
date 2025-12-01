package com.duoc.model;

public class UnidadOperativa {

    protected String nombre;
    protected String comuna;

    public UnidadOperativa(String nombre, String comuna){
        this.nombre = nombre;
        this.comuna = comuna;
    }

    public String getComuna() {
        return comuna;
    }

    public String getNombre() {
        return nombre;
    }

    public void datosCentro(){

        System.out.println("Unidad Operativa" +
                        "\nNombre: " +nombre+
                "\nComuna: "+comuna);
    }

}
