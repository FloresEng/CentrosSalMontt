package com.duoc.model;

public class PlantaProceso extends UnidadOperativa {

    protected double tonProducto;//toneladas de salmon

    public PlantaProceso (String nombre, String comuna, double tonProducto){
        super (nombre, comuna);
        this.tonProducto = tonProducto;
    }

    public double getTonProducto() {
        return tonProducto;
    }

    @Override
    public void datosCentro() {
        super.datosCentro();
        System.out.println("Toneladas de Salmon disponibles: "+tonProducto);
        System.out.println("-----------------------------");
    }
}
