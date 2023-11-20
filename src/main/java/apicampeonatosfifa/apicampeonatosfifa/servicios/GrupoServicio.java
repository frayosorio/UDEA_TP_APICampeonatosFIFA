package apicampeonatosfifa.apicampeonatosfifa.servicios;

import java.util.List;

import org.springframework.stereotype.Service;

import apicampeonatosfifa.apicampeonatosfifa.entidades.TablaPosicion;
import apicampeonatosfifa.apicampeonatosfifa.interfaces.IGrupoServicio;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Service
public class GrupoServicio implements IGrupoServicio {

    @PersistenceContext
    public EntityManager em;

    @Override
    public List<TablaPosicion> obtenerPosiciones(int idGrupo) {
        List<TablaPosicion> tablaPosiciones = em
                .createNativeQuery("SELECT * FROM fTablaPosicionesGrupo(:idgrupotabla)", TablaPosicion.class)
                .setParameter("idgrupotabla", idGrupo)
                .getResultList();

        return tablaPosiciones;
    }

}
