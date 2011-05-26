/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nst.controlenst.model.entity;

import java.sql.Timestamp;
import java.util.Date;

/**
 *
 * @author pablosouza
 */
public class Projeto {
    private Integer id;
    private String nome;
    private String identificador;
    private Timestamp dataCadastro;
    private Timestamp dataInicio;
    private Timestamp dataEncerramentoPrevisto;
    private Timestamp dataEncerramento;
    private String descricao;
    private Situacao situacao;
    private Tipo tipo;

    public Projeto() {
    }

    public Projeto(Integer id, String nome, String identificador, Timestamp dataCadastro, Timestamp dataInicio, Timestamp dataEncerramentoPrevisto, Timestamp dataEncerramento, String descricao, Situacao situacao, Tipo tipo) {
        this.id = id;
        this.nome = nome;
        this.identificador = identificador;
        this.dataCadastro = dataCadastro;
        this.dataInicio = dataInicio;
        this.dataEncerramentoPrevisto = dataEncerramentoPrevisto;
        this.dataEncerramento = dataEncerramento;
        this.descricao = descricao;
        this.situacao = situacao;
        this.tipo = tipo;
    }

    public Timestamp getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Timestamp dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Timestamp getDataEncerramento() {
        return dataEncerramento;
    }

    public void setDataEncerramento(Timestamp dataEncerramento) {
        this.dataEncerramento = dataEncerramento;
    }

    public Timestamp getDataEncerramentoPrevisto() {
        return dataEncerramentoPrevisto;
    }

    public void setDataEncerramentoPrevisto(Timestamp dataEncerramentoPrevisto) {
        this.dataEncerramentoPrevisto = dataEncerramentoPrevisto;
    }

    public Timestamp getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Timestamp dataInicio) {
        this.dataInicio = dataInicio;
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

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Projeto other = (Projeto) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        if ((this.nome == null) ? (other.nome != null) : !this.nome.equals(other.nome)) {
            return false;
        }
        if ((this.identificador == null) ? (other.identificador != null) : !this.identificador.equals(other.identificador)) {
            return false;
        }
        if (this.dataCadastro != other.dataCadastro && (this.dataCadastro == null || !this.dataCadastro.equals(other.dataCadastro))) {
            return false;
        }
        if (this.dataInicio != other.dataInicio && (this.dataInicio == null || !this.dataInicio.equals(other.dataInicio))) {
            return false;
        }
        if (this.dataEncerramentoPrevisto != other.dataEncerramentoPrevisto && (this.dataEncerramentoPrevisto == null || !this.dataEncerramentoPrevisto.equals(other.dataEncerramentoPrevisto))) {
            return false;
        }
        if (this.dataEncerramento != other.dataEncerramento && (this.dataEncerramento == null || !this.dataEncerramento.equals(other.dataEncerramento))) {
            return false;
        }
        if ((this.descricao == null) ? (other.descricao != null) : !this.descricao.equals(other.descricao)) {
            return false;
        }
        if (this.situacao != other.situacao && (this.situacao == null || !this.situacao.equals(other.situacao))) {
            return false;
        }
        if (this.tipo != other.tipo && (this.tipo == null || !this.tipo.equals(other.tipo))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 17 * hash + (this.nome != null ? this.nome.hashCode() : 0);
        hash = 17 * hash + (this.identificador != null ? this.identificador.hashCode() : 0);
        hash = 17 * hash + (this.dataCadastro != null ? this.dataCadastro.hashCode() : 0);
        hash = 17 * hash + (this.dataInicio != null ? this.dataInicio.hashCode() : 0);
        hash = 17 * hash + (this.dataEncerramentoPrevisto != null ? this.dataEncerramentoPrevisto.hashCode() : 0);
        hash = 17 * hash + (this.dataEncerramento != null ? this.dataEncerramento.hashCode() : 0);
        hash = 17 * hash + (this.descricao != null ? this.descricao.hashCode() : 0);
        hash = 17 * hash + (this.situacao != null ? this.situacao.hashCode() : 0);
        hash = 17 * hash + (this.tipo != null ? this.tipo.hashCode() : 0);
        return hash;
    }
    
}
