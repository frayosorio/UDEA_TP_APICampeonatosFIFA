package apicampeonatosfifa.apicampeonatosfifa.servicios;

import java.util.List;

import org.springframework.stereotype.Service;

import apicampeonatosfifa.apicampeonatosfifa.entidades.Campeonato;
import apicampeonatosfifa.apicampeonatosfifa.entidades.Grupo;
import apicampeonatosfifa.apicampeonatosfifa.interfaces.ICampeonatoServicio;
import apicampeonatosfifa.apicampeonatosfifa.repositorios.CampeonatoRepositorio;

@Service
public class CampeonatoServicio implements ICampeonatoServicio {

    private CampeonatoRepositorio repositorio;

    public CampeonatoServicio(CampeonatoRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public List<Campeonato> listar() {
        return this.repositorio.findAll();
    }

    @Override
    public Campeonato obtener(long id) {
        var campeonato = this.repositorio.findById(id);
        return campeonato.isPresent() ? campeonato.get() : null;
    }

    @Override
    public Campeonato guardar(Campeonato campeonato) {
        return this.repositorio.save(campeonato);
    }

    @Override
    public boolean eliminar(long id) {
        try {
            this.repositorio.deleteById(id);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    @Override
    public List<Grupo> listarGrupos(long id) {
        // Buscar campeonato por su ID
        var campeonatoBuscado = repositorio.findById(id);

        if (campeonatoBuscado.isPresent()) {
            var campeonato = campeonatoBuscado.get();

            return campeonato.getGrupos();
        }
        return null;
    }

}
