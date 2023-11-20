package apicampeonatosfifa.apicampeonatosfifa.interfaces;

import java.util.List;

import apicampeonatosfifa.apicampeonatosfifa.entidades.TablaPosicion;


public interface IGrupoServicio {

    public List<TablaPosicion> obtenerPosiciones(int id);
}
