package com.duoc.ui;

/**
 * Ejecuta la aplicación mostrando las unidades operativas activas.
 */

import com.duoc.data.GestorUnidades;

public class Main {

    /**
     * Instancia un {@link GestorUnidades}
     * y muestra las unidades activas.
     */
    public static void main(String[] args) {

        GestorUnidades gestor = new GestorUnidades();

        gestor.unidadesActivas();

    }
}