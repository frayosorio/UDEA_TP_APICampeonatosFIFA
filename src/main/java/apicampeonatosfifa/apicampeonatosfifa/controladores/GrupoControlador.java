package apicampeonatosfifa.apicampeonatosfifa.controladores;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import apicampeonatosfifa.apicampeonatosfifa.entidades.TablaPosicion;
import apicampeonatosfifa.apicampeonatosfifa.interfaces.IGrupoServicio;

@RestController
@RequestMapping("/grupos")
public class GrupoControlador {
    
    private IGrupoServicio servicio;

    public GrupoControlador(IGrupoServicio servicio) {
        this.servicio = servicio;
    }

    @RequestMapping(value = "/posiciones/{id}", method = RequestMethod.GET)
    public List<TablaPosicion> obtenerPosiciones(@PathVariable int id) {
        return servicio.obtenerPosiciones(id);
    }
}
