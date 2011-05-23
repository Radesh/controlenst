/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nst.controlenst.persistence.dao.factory.impl;

import nst.controlenst.persistence.dao.factory.interfaces.CargoDAO;
import nst.controlenst.persistence.dao.factory.interfaces.CoordenadorDAO;
import nst.controlenst.persistence.dao.factory.interfaces.CursoDAO;
import nst.controlenst.persistence.dao.factory.interfaces.DAOFactory;
import nst.controlenst.persistence.dao.factory.interfaces.EmailCoordenadorDAO;
import nst.controlenst.persistence.dao.factory.interfaces.EmailParticipanteDAO;
import nst.controlenst.persistence.dao.factory.interfaces.HIstoricoParticipanteDAO;
import nst.controlenst.persistence.dao.factory.interfaces.HistoricoCoordenadorDAO;
import nst.controlenst.persistence.dao.factory.interfaces.MotivoSaidaDAO;
import nst.controlenst.persistence.dao.factory.interfaces.ParticipanteDAO;
import nst.controlenst.persistence.dao.factory.interfaces.ProjetoDAO;
import nst.controlenst.persistence.dao.factory.interfaces.SituacaoDAO;
import nst.controlenst.persistence.dao.factory.interfaces.TelefoneCoordenadorDAO;
import nst.controlenst.persistence.dao.factory.interfaces.TelefoneParticipanteDAO;
import nst.controlenst.persistence.dao.factory.interfaces.TipoDAO;
import nst.controlenst.persistence.dao.factory.interfaces.TipoIngressoDAO;
import nst.controlenst.persistence.dao.factory.interfaces.VinculoDAO;
import nst.controlenst.persistence.dao.obj.impl.JDBCCargo;
import nst.controlenst.persistence.dao.obj.impl.JDBCCoordenador;
import nst.controlenst.persistence.dao.obj.impl.JDBCCurso;
import nst.controlenst.persistence.dao.obj.impl.JDBCEmailCoordenadores;
import nst.controlenst.persistence.dao.obj.impl.JDBCEmailParticipante;
import nst.controlenst.persistence.dao.obj.impl.JDBCHIstoricoCoordenador;
import nst.controlenst.persistence.dao.obj.impl.JDBCHistoricoParticipantes;
import nst.controlenst.persistence.dao.obj.impl.JDBCMotivoSaida;
import nst.controlenst.persistence.dao.obj.impl.JDBCParticipante;
import nst.controlenst.persistence.dao.obj.impl.JDBCProjeto;
import nst.controlenst.persistence.dao.obj.impl.JDBCSituacao;
import nst.controlenst.persistence.dao.obj.impl.JDBCTelefoneCoordenador;
import nst.controlenst.persistence.dao.obj.impl.JDBCTelefoneParticipante;
import nst.controlenst.persistence.dao.obj.impl.JDBCTipo;
import nst.controlenst.persistence.dao.obj.impl.JDBCTipoIngresso;
import nst.controlenst.persistence.dao.obj.impl.JDBCVinculo;



/**
 *
 * @author pablosouza
 */
public class JDBCFactory implements DAOFactory{

    @Override
    public CargoDAO getCargoDAO() {
        return JDBCCargo.getInstance();
    }

    @Override
    public CursoDAO getCursoDAO() {
        return JDBCCurso.getInstance();
    }

    @Override
    public MotivoSaidaDAO getMotivoSaidaDAO() {
        return JDBCMotivoSaida.getInstance();
    }

    @Override
    public SituacaoDAO getSituacaoDAO() {
        return JDBCSituacao.getInstance();
    }

    @Override
    public TipoDAO getTipoDAO() {
        return JDBCTipo.getInstance();
    }

    @Override
    public TipoIngressoDAO getTipoIngressoDAO() {
        return JDBCTipoIngresso.getInstance();
    }

    @Override
    public VinculoDAO getVinculoDAO() {
        return JDBCVinculo.getInstance();
    }

    @Override
    public CoordenadorDAO getCoordenadorDAO() {
        return JDBCCoordenador.getInstance();
    }

    @Override
    public EmailCoordenadorDAO getEmailCoordenadorDAO() {
        return JDBCEmailCoordenadores.getInstance();
    }

    @Override
    public EmailParticipanteDAO getEmailParticipanteDAO() {
        return JDBCEmailParticipante.getInstance();
    }

    @Override
    public HIstoricoParticipanteDAO getHistoricoParticipanteDAO() {
        return JDBCHistoricoParticipantes.getInstance();
    }

    @Override
    public HistoricoCoordenadorDAO getHistoricoCoordenadorDAO() {
        return JDBCHIstoricoCoordenador.getInstance();
    }

    @Override
    public ParticipanteDAO getParticipanteDAO() {
        return JDBCParticipante.getInstance();
    }

    @Override
    public ProjetoDAO getProjetoDAO() {
        return JDBCProjeto.getInstance();
    }

    @Override
    public TelefoneCoordenadorDAO getTelefoneCoordenadorDAO() {
        return JDBCTelefoneCoordenador.getInstance();
    }

    @Override
    public TelefoneParticipanteDAO getTelefoneParticipanteDAO() {
        return JDBCTelefoneParticipante.getInstance();
    }
    
}
