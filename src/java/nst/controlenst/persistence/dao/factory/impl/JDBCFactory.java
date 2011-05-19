/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nst.controlenst.persistence.dao.factory.impl;

import nst.controlenst.persistence.dao.factory.interfaces.CargoDAO;
import nst.controlenst.persistence.dao.factory.interfaces.CursoDAO;
import nst.controlenst.persistence.dao.factory.interfaces.DAOFactory;
import nst.controlenst.persistence.dao.factory.interfaces.MotivoSaidaDAO;
import nst.controlenst.persistence.dao.factory.interfaces.SituacaoDAO;
import nst.controlenst.persistence.dao.factory.interfaces.TipoDAO;
import nst.controlenst.persistence.dao.factory.interfaces.TipoIngressoDAO;
import nst.controlenst.persistence.dao.factory.interfaces.VinculoDAO;
import nst.controlenst.persistence.dao.obj.impl.JDBCCargo;
import nst.controlenst.persistence.dao.obj.impl.JDBCCurso;
import nst.controlenst.persistence.dao.obj.impl.JDBCMotivoSaida;
import nst.controlenst.persistence.dao.obj.impl.JDBCSituacao;
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
    
}
