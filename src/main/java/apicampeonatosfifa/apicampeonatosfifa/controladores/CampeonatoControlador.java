package apicampeonatosfifa.apicampeonatosfifa.controladores;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import apicampeonatosfifa.apicampeonatosfifa.entidades.Campeonato;
import apicampeonatosfifa.apicampeonatosfifa.interfaces.ICampeonatoServicio;

@RestController
@RequestMapping("/campeonatos")
public class CampeonatoControlador {

    private ICampeonatoServicio servicio;

    public CampeonatoControlador(ICampeonatoServicio servicio) {
        this.servicio = servicio;
    }

    @RequestMapping(value = "/listar", method = RequestMethod.GET)
    public List<Campeonato> listar() {
        return this.servicio.listar();
    }

    @RequestMapping(value = "/obtener/{id}", method = RequestMethod.GET)
    public Campeonato obtener(@PathVariable long id) {
        return this.servicio.obtener(id);
    }

    @RequestMapping(value = "/agregar", method = RequestMethod.POST)
    public Campeonato agregar(@RequestBody Campeonato campeonato) {
        campeonato.setId(0);
        return this.servicio.guardar(campeonato);
    }

}
