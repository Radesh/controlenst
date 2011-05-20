/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nst.controlenst.model.entity;

/**
 *
 * @author pablosouza
 */
public class EmailCoordenador {
    private Integer id;
    private String descricao;
    private Coordenador coordenador;

    public EmailCoordenador() {
    }

    public EmailCoordenador(Integer id, String descricao, Coordenador coordenador) {
        this.id = id;
        this.descricao = descricao;
        this.coordenador = coordenador;
    }

    public Coordenador getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(Coordenador coordenador) {
        this.coordenador = coordenador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final EmailCoordenador other = (EmailCoordenador) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        if ((this.descricao == null) ? (other.descricao != null) : !this.descricao.equals(other.descricao)) {
            return false;
        }
        if (this.coordenador != other.coordenador && (this.coordenador == null || !this.coordenador.equals(other.coordenador))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 83 * hash + (this.descricao != null ? this.descricao.hashCode() : 0);
        hash = 83 * hash + (this.coordenador != null ? this.coordenador.hashCode() : 0);
        return hash;
    }
    
    
    
}
