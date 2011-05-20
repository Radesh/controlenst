/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nst.controlenst.model.entity;

/**
 *
 * @author pablosouza
 */
public class TelefoneParticipante {
    private Integer id;
    private String ddd;
    private String telefone;
    private Participante participante;

    public TelefoneParticipante() {
    }

    public TelefoneParticipante(Integer id, String ddd, String telefone, Participante participante) {
        this.id = id;
        this.ddd = ddd;
        this.telefone = telefone;
        this.participante = participante;
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

    public Participante getParticipante() {
        return participante;
    }

    public void setParticipante(Participante participante) {
        this.participante = participante;
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
        final TelefoneParticipante other = (TelefoneParticipante) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        if ((this.ddd == null) ? (other.ddd != null) : !this.ddd.equals(other.ddd)) {
            return false;
        }
        if ((this.telefone == null) ? (other.telefone != null) : !this.telefone.equals(other.telefone)) {
            return false;
        }
        if (this.participante != other.participante && (this.participante == null || !this.participante.equals(other.participante))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 89 * hash + (this.ddd != null ? this.ddd.hashCode() : 0);
        hash = 89 * hash + (this.telefone != null ? this.telefone.hashCode() : 0);
        hash = 89 * hash + (this.participante != null ? this.participante.hashCode() : 0);
        return hash;
    }
    
    
}
