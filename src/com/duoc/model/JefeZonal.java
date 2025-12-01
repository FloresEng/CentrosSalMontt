package com.duoc.model;

/**
 * Representa un jefe encargado del centro de cultivo y planta de proceso de una zona específica.
 * Este objeto se utiliza mediante composición. CentroCultivo y PlantaProceso tiene-un (has-a) JefeZonal
 */

public class JefeZonal {

    protected String nomJefe;
    protected String zona;

    /**
     * Construye un nuevo jefe zonal.
     *
     * @param nombre Nombre del jefe zonal.
     * @param zona Zona geográfica que supervisa.
     */
    public JefeZonal(String nombre, String zona){

        if (nomJefe == null || nomJefe.isBlank())
            throw new IllegalArgumentException("Nombre de jefe no puede estar vacío");

        if (zona == null || zona.isBlank())
            throw new IllegalArgumentException("Debe indicar zona a cargo del jefe");

        this.nomJefe = nombre;
        this.zona = zona;
    }

    public String getNombre() {
        return nomJefe;
    }

    public String getZona() {
        return zona;
    }

    @Override
    public String toString() {
        return "Jefe Zonal" +
                "\n"+ nomJefe+
                "\nZona a cargo: " + zona;
    }
}
