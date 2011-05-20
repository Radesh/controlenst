/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nst.controlenst.model.entity;

/**
 *
 * @author pablosouza
 */
public class TelefoneCoordenador {
    private Integer id;
    private String ddd;
    private String telefone;
    private Coordenador coordenador;

    public TelefoneCoordenador() {
    }

    public TelefoneCoordenador(Integer id, String ddd, String telefone, Coordenador coordenador) {
        this.id = id;
        this.ddd = ddd;
        this.telefone = telefone;
        this.coordenador = coordenador;
    }

    public Coordenador getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(Coordenador coordenador) {
        this.coordenador = coordenador;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TelefoneCoordenador other = (TelefoneCoordenador) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        if ((this.ddd == null) ? (other.ddd != null) : !this.ddd.equals(other.ddd)) {
            return false;
        }
        if ((this.telefone == null) ? (other.telefone != null) : !this.telefone.equals(other.telefone)) {
            return false;
        }
        if (this.coordenador != other.coordenador && (this.coordenador == null || !this.coordenador.equals(other.coordenador))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 47 * hash + (this.ddd != null ? this.ddd.hashCode() : 0);
        hash = 47 * hash + (this.telefone != null ? this.telefone.hashCode() : 0);
        hash = 47 * hash + (this.coordenador != null ? this.coordenador.hashCode() : 0);
        return hash;
    }

    
    
}
