package apicampeonatosfifa.apicampeonatosfifa.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "grupopais")
public class GrupoSeleccion {

    @Id
    @ManyToOne
    @JoinColumn(name = "idgrupo", referencedColumnName = "id")
    private Grupo grupo;

    @Id
    @ManyToOne
    @JoinColumn(name = "idpais", referencedColumnName = "id")
    private Seleccion seleccion;

    public GrupoSeleccion() {
    }

    public GrupoSeleccion(Grupo grupo, Seleccion seleccion) {
        this.grupo = grupo;
        this.seleccion = seleccion;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public Seleccion getSeleccion() {
        return seleccion;
    }

    public void setSeleccion(Seleccion seleccion) {
        this.seleccion = seleccion;
    }

    
}
