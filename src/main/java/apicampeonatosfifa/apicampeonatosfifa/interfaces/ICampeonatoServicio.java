package apicampeonatosfifa.apicampeonatosfifa.interfaces;

import java.util.List;

import apicampeonatosfifa.apicampeonatosfifa.entidades.Campeonato;
import apicampeonatosfifa.apicampeonatosfifa.entidades.Grupo;

public interface ICampeonatoServicio {

    public List<Campeonato> listar();

    public Campeonato obtener(long id);

    public Campeonato guardar(Campeonato campeonato);

    public boolean eliminar(long id);

    public List<Grupo> listarGrupos(long id);

}
