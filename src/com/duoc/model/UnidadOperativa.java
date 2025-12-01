package com.duoc.model;

/**
 * Superclase que representa una unidad operativa dentro del proceso productivo.
 * Contiene información básica como el nombre del lugar y comuna donde se ubica.
 */
public class UnidadOperativa {

    protected String nombre;
    protected String comuna;

    /**
     * Construye una nueva unidad operativa.
     *
     * @param nombre Nombre de la unidad operativa.
     * @param comuna Comuna donde se encuentra ubicada.
     */

    public UnidadOperativa(String nombre, String comuna){

        if (nombre == null || nombre.isBlank())
            throw new IllegalArgumentException("Nombre no puede estar vacío");

        if (comuna == null || comuna.isBlank())
            throw new IllegalArgumentException("Comuna no puede estar vacío");

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

        System.out.println(
                        "Nombre: " +nombre+
                "\nComuna: "+comuna);
    }

}
