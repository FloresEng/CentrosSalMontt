package com.duoc.data;

import com.duoc.model.CentroCultivo;
import com.duoc.model.PlantaProceso;
import com.duoc.model.UnidadOperativa;

public class GestorUnidades {

    public void unidadesActivas(){

        UnidadOperativa centro1 = new CentroCultivo("Alba", "Osorno", "Salmon Atlantico");
        UnidadOperativa centro2 = new CentroCultivo("Ocaso", "Llanquihue", "Trucha Arcoiris");
        UnidadOperativa planta1 = new PlantaProceso("Amanecer","Osorno", 4.5);
        UnidadOperativa planta2 = new PlantaProceso("Atardecer", "Llanquihue", 3.3);

        System.out.println("");
        System.out.println("========================= Unidades Activas en Produccion =========================");
        centro1.datosCentro();
        centro2.datosCentro();
        planta1.datosCentro();
        planta2.datosCentro();

    }
}
