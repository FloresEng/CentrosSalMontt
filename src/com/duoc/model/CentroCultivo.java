package com.duoc.model;

public class CentroCultivo extends UnidadOperativa{

    protected String tipoSalmon;

    public CentroCultivo(String nombre, String comuna, String tipoSalmon){
        super(nombre, comuna);
        this.tipoSalmon = tipoSalmon;
    }

    public String getTipoSalmon() {
        return tipoSalmon;
    }

    @Override
    public void datosCentro() {
        super.datosCentro();
        System.out.println("Salmon cultivado: "+tipoSalmon);
        System.out.println("-----------------------------");
    }
}
