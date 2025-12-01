package com.duoc.model;

/**
 * Representa un centro de cultivo encargado de criar un tipo de salmón específico.
 * Subclase de UnidadOperativa.
 */
public class CentroCultivo extends UnidadOperativa{

    protected String tipoSalmon;

    protected JefeZonal zonal;

    /**
     * Construye un centro de cultivo.
     *
     * @param nomJefe Nombre del jefe zonal.
     * @param zona Zona supervisada.
     * @param nombre Nombre del centro.
     * @param comuna Comuna donde se ubica el centro.
     * @param tipoSalmon Tipo de salmón cultivado.
     */

    public CentroCultivo(String nomJefe, String zona, String nombre, String comuna, String tipoSalmon){
        super(nombre, comuna);

        if (tipoSalmon == null || tipoSalmon.isBlank())
            throw new IllegalArgumentException("Debe indicar el tipo de salmón producido");

        this.tipoSalmon = tipoSalmon;
        this.zonal = new JefeZonal(nomJefe, zona);
    }

    public String getTipoSalmon() {
        return tipoSalmon;
    }

    public JefeZonal getZonal() {
        return zonal;
    }

    @Override
    public void datosCentro() {
        System.out.println(zonal);
        System.out.println("");
        System.out.println("Centro de Cultivo");
        super.datosCentro();
        System.out.println("Salmon cultivado: "+tipoSalmon);
        System.out.println("---------------------------------------------");
    }
}
