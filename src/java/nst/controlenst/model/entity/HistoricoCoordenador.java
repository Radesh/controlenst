/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nst.controlenst.model.entity;

import java.util.Date;

/**
 *
 * @author pablosouza
 */
public class HistoricoCoordenador {
    private Integer id;
    private Date dataEntrada;
    private Date dataSaida;
    private String motivoSaida;
    private Coordenador coordenador;
    private Projeto projeto;

    public HistoricoCoordenador() {
    }

    public HistoricoCoordenador(Integer id, Date dataEntrada, Date dataSaida, String motivoSaida, Coordenador coordenador, Projeto projeto) {
        this.id = id;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.motivoSaida = motivoSaida;
        this.coordenador = coordenador;
        this.projeto = projeto;
    }

    public Coordenador getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(Coordenador coordenador) {
        this.coordenador = coordenador;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMotivoSaida() {
        return motivoSaida;
    }

    public void setMotivoSaida(String motivoSaida) {
        this.motivoSaida = motivoSaida;
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final HistoricoCoordenador other = (HistoricoCoordenador) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        if (this.dataEntrada != other.dataEntrada && (this.dataEntrada == null || !this.dataEntrada.equals(other.dataEntrada))) {
            return false;
        }
        if (this.dataSaida != other.dataSaida && (this.dataSaida == null || !this.dataSaida.equals(other.dataSaida))) {
            return false;
        }
        if ((this.motivoSaida == null) ? (other.motivoSaida != null) : !this.motivoSaida.equals(other.motivoSaida)) {
            return false;
        }
        if (this.coordenador != other.coordenador && (this.coordenador == null || !this.coordenador.equals(other.coordenador))) {
            return false;
        }
        if (this.projeto != other.projeto && (this.projeto == null || !this.projeto.equals(other.projeto))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 71 * hash + (this.dataEntrada != null ? this.dataEntrada.hashCode() : 0);
        hash = 71 * hash + (this.dataSaida != null ? this.dataSaida.hashCode() : 0);
        hash = 71 * hash + (this.motivoSaida != null ? this.motivoSaida.hashCode() : 0);
        hash = 71 * hash + (this.coordenador != null ? this.coordenador.hashCode() : 0);
        hash = 71 * hash + (this.projeto != null ? this.projeto.hashCode() : 0);
        return hash;
    }
    
    
}
