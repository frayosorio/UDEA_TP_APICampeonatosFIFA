package apicampeonatosfifa.apicampeonatosfifa.entidades;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "campeonato")
public class Campeonato {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "secuencia_campeonato")
    @GenericGenerator(name = "secuencia_campeonato", strategy = "increment")
    @Column(name = "id")
    private long id;

    @Column(name = "campeonato", length = 100, unique = true)
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "idpais", referencedColumnName = "id")
    private Seleccion seleccion;

    @Column(name = "año", nullable = false)
    private int año;

    @JsonIgnore
    @OneToMany(mappedBy = "campeonato")
    private List<Grupo> grupos = new ArrayList<>();

    public Campeonato() {
    }

    public Campeonato(long id, String nombre, Seleccion seleccion, int año) {
        this.id = id;
        this.nombre = nombre;
        this.seleccion = seleccion;
        this.año = año;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Seleccion getSeleccion() {
        return seleccion;
    }

    public void setSeleccion(Seleccion seleccion) {
        this.seleccion = seleccion;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public List<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(List<Grupo> grupos) {
        this.grupos = grupos;
    }

}
