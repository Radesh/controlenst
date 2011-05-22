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
    public CoordenadorDAO getCoordenadorDAO();
    public CursoDAO getCursoDAO();
    public EmailCoordenadorDAO getEmailCoordenadorDAO();
    public EmailParticipanteDAO getEmailParticipanteDAO();
    public HIstoricoParticipanteDAO getHistoricoParticipanteDAO();
    public HistoricoCoordenadorDAO getHistoricoCoordenadorDAO();
    public MotivoSaidaDAO getMotivoSaidaDAO();
    public ParticipanteDAO getParticipanteDAO();
    public ProjetoDAO getProjetoDAO();
    public SituacaoDAO getSituacaoDAO();
    public TelefoneCoordenadorDAO getTelefoneCoordenadorDAO();
    public TelefoneParticipanteDAO getTelefoneParticipanteDAO();
    public TipoDAO getTipoDAO();
    public TipoIngressoDAO getTipoIngressoDAO();
    public VinculoDAO getVinculoDAO();
}
