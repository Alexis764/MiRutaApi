package com.miruta.api.servicios;

import com.miruta.api.entidades.Parada;
import java.util.List;

public interface InParadaServicio {

    //Metodo listar todas las paradas
    List<Parada> listarParadas();



    //Metodo listar paradas por ruta
    List<Parada> listarParadas_ruta(Long idRut);







    //Obtener id de las paradas para una ruta
    List<Long> listaIdParadas(Long idRut);
}
