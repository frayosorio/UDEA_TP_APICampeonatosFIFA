package apicampeonatosfifa.apicampeonatosfifa.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class TablaPosicion {

    @Id
    @Column(name = "id")
    private long id;
    @Column(name = "pais")
    private String pais;
    @Column(name = "pJ")
    private int pJ;
    @Column(name = "pG")
    private int pG;
    @Column(name = "pE")
    private int pE;
    @Column(name = "pP")
    private int pP;
    @Column(name = "gF")
    private int gF;
    @Column(name = "gC")
    private int gC;
    @Column(name = "puntos")
    private int puntos;

    public TablaPosicion() {
    }

    public TablaPosicion(long id, String pais, int pJ, int pG, int pE, int pP, int gF, int gC, int puntos) {
        this.id = id;
        this.pais = pais;
        this.pJ = pJ;
        this.pG = pG;
        this.pE = pE;
        this.pP = pP;
        this.gF = gF;
        this.gC = gC;
        this.puntos = puntos;
    }

    public String getPais() {
        return pais;
    }

    public int getpJ() {
        return pJ;
    }

    public int getpG() {
        return pG;
    }

    public int getpE() {
        return pE;
    }

    public int getpP() {
        return pP;
    }

    public int getgF() {
        return gF;
    }

    public int getgC() {
        return gC;
    }

    public int getPuntos() {
        return puntos;
    }

}
