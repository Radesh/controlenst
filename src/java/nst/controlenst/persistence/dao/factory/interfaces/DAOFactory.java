/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nst.controlenst.persistence.dao.factory.interfaces;

/**
 *
 * @author pablosouza
 */
public interface  DAOFactory {
    public CargoDAO getCargoDAO();
    public CursoDAO getCursoDAO();
    public MotivoSaidaDAO getMotivoSaidaDAO();
    public SituacaoDAO getSituacaoDAO();
    public TipoDAO getTipoDAO();
    public TipoIngressoDAO getTipoIngressoDAO();
    public VinculoDAO getVinculoDAO();
}
