package com.duoc.data;

import com.duoc.model.CentroCultivo;
import com.duoc.model.PlantaProceso;
import com.duoc.model.UnidadOperativa;

/**
 * Gestiona y administra las unidades operativas activas.
 */

public class GestorUnidades {

    /**
     * Crea y muestra por consola todas las unidades activas en producción.
     * Incluye centros de cultivo y plantas de proceso.
     */

    public void unidadesActivas(){

        UnidadOperativa centro1 = new CentroCultivo("Javier Flores", "Osorno", "Alba", "Rio Negro", "Salmon Atlantico");
        UnidadOperativa centro2 = new CentroCultivo("Francisca Maulen", "Llanquihue", "Ocaso", "Frutillar", "Trucha Arcoiris");
        UnidadOperativa planta1 = new PlantaProceso("Javier Flores","Osorno", "Amanecer", "Puerto Octay", 4.7);
        UnidadOperativa planta2 = new PlantaProceso("Francisca Maulen", "Llanquihue", "Atardecer", "Puerto Varas", 3.4);

        System.out.println("");
        System.out.println("========================= Unidades Activas en Produccion =========================");
        centro1.datosCentro();
        centro2.datosCentro();
        planta1.datosCentro();
        planta2.datosCentro();

    }
}
