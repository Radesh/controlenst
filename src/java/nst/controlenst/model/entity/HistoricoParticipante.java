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
public class HistoricoParticipante {
    private Integer id;
    private Date entrada;
    private Date saida;
    private MotivoSaida motivoSaida;
    private Cargo cargo;
    private Curso curso;
    private Vinculo vinculo;
    private Participante participante;
    private TipoIngresso tipoIngresso;
    private Projeto projeto;

    public HistoricoParticipante() {
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Date getEntrada() {
        return entrada;
    }

    public void setEntrada(Date entrada) {
        this.entrada = entrada;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public MotivoSaida getMotivoSaida() {
        return motivoSaida;
    }

    public void setMotivoSaida(MotivoSaida motivoSaida) {
        this.motivoSaida = motivoSaida;
    }

    public Participante getParticipante() {
        return participante;
    }

    public void setParticipante(Participante participante) {
        this.participante = participante;
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }

    public Date getSaida() {
        return saida;
    }

    public void setSaida(Date saida) {
        this.saida = saida;
    }

    public TipoIngresso getTipoIngresso() {
        return tipoIngresso;
    }

    public void setTipoIngresso(TipoIngresso tipoIngresso) {
        this.tipoIngresso = tipoIngresso;
    }

    public Vinculo getVinculo() {
        return vinculo;
    }

    public void setVinculo(Vinculo vinculo) {
        this.vinculo = vinculo;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final HistoricoParticipante other = (HistoricoParticipante) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        if (this.entrada != other.entrada && (this.entrada == null || !this.entrada.equals(other.entrada))) {
            return false;
        }
        if (this.saida != other.saida && (this.saida == null || !this.saida.equals(other.saida))) {
            return false;
        }
        if (this.motivoSaida != other.motivoSaida && (this.motivoSaida == null || !this.motivoSaida.equals(other.motivoSaida))) {
            return false;
        }
        if (this.cargo != other.cargo && (this.cargo == null || !this.cargo.equals(other.cargo))) {
            return false;
        }
        if (this.curso != other.curso && (this.curso == null || !this.curso.equals(other.curso))) {
            return false;
        }
        if (this.vinculo != other.vinculo && (this.vinculo == null || !this.vinculo.equals(other.vinculo))) {
            return false;
        }
        if (this.participante != other.participante && (this.participante == null || !this.participante.equals(other.participante))) {
            return false;
        }
        if (this.tipoIngresso != other.tipoIngresso && (this.tipoIngresso == null || !this.tipoIngresso.equals(other.tipoIngresso))) {
            return false;
        }
        if (this.projeto != other.projeto && (this.projeto == null || !this.projeto.equals(other.projeto))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 31 * hash + (this.entrada != null ? this.entrada.hashCode() : 0);
        hash = 31 * hash + (this.saida != null ? this.saida.hashCode() : 0);
        hash = 31 * hash + (this.motivoSaida != null ? this.motivoSaida.hashCode() : 0);
        hash = 31 * hash + (this.cargo != null ? this.cargo.hashCode() : 0);
        hash = 31 * hash + (this.curso != null ? this.curso.hashCode() : 0);
        hash = 31 * hash + (this.vinculo != null ? this.vinculo.hashCode() : 0);
        hash = 31 * hash + (this.participante != null ? this.participante.hashCode() : 0);
        hash = 31 * hash + (this.tipoIngresso != null ? this.tipoIngresso.hashCode() : 0);
        hash = 31 * hash + (this.projeto != null ? this.projeto.hashCode() : 0);
        return hash;
    }
    
    
}
