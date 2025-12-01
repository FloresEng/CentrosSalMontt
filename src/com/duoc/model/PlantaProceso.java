package com.duoc.model;

/**
 * Representa una planta de procesamiento de Salmón y la cantidad disponible de este.
 * Subclase de UnidadOperativa.
 */

public class PlantaProceso extends UnidadOperativa {

    protected double tonProducto;//toneladas de salmon

    protected JefeZonal zonal;

    /**
     * Construye una planta de proceso.
     *
     * @param nomJefe Nombre del jefe zonal.
     * @param zona Zona supervisada.
     * @param nombre Nombre de la planta.
     * @param comuna Comuna donde se ubica.
     * @param tonProducto Toneladas de producto disponible.
     */

    public PlantaProceso (String nomJefe, String zona, String nombre, String comuna, double tonProducto){
        super (nombre, comuna);

        if (tonProducto < 0)
            throw new IllegalArgumentException("Toneladas de producto no pueden ser negativas");

        this.tonProducto = tonProducto;
        this.zonal= new JefeZonal(nomJefe, zona);
    }

    public double getTonProducto() {
        return tonProducto;
    }

    public JefeZonal getZonal() {
        return zonal;
    }

    @Override
    public void datosCentro() {
        System.out.println(zonal);
        System.out.println("");
        System.out.println("Planta de Producción");
        super.datosCentro();
        System.out.println("Toneladas de Salmon disponibles: "+tonProducto+"T");
        System.out.println("---------------------------------------------");
    }
}
