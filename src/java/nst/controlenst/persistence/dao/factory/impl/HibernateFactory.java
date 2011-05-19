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

/**
 *
 * @author pablosouza
 */
public class HibernateFactory implements DAOFactory
{
    @Override
    public CargoDAO getCargoDAO() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public CursoDAO getCursoDAO() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public MotivoSaidaDAO getMotivoSaidaDAO() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public SituacaoDAO getSituacaoDAO() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public TipoDAO getTipoDAO() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public TipoIngressoDAO getTipoIngressoDAO() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public VinculoDAO getVinculoDAO() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
