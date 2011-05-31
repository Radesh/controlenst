/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nst.controlenst.persistence.dao.obj.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import nst.controlenst.model.entity.Projeto;
import nst.controlenst.persistence.dao.GenericJDBCDAO;
import nst.controlenst.persistence.dao.factory.interfaces.ProjetoDAO;

/**
 *
 * @author pablosouza
 */
public class JDBCProjeto extends GenericJDBCDAO implements ProjetoDAO {

    private static JDBCProjeto instancia = null;
    private static final String SQL_ADD_PROJETOS = "INSERT INTO projetos(proj_identificador,"
            + "proj_data_cadastro,"
            + "proj_data_inicio,"
            + "proj_dt_encer_previsto,"
            + "proj_dt_encerramento,"
            + "proj_descricao,"
            + "fk_sit_id,"
            + "fk_tip_id,"
            + "proj_nome) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, )";
    private static final String SQL_UPD_PROJETOS = "UPDATE projetos SET proj_identificador = ?"
            + "proj_data_cadastro = ?,"
            + "proj_data_inicio = ?,"
            + "proj_dt_encer_previsto = ?,"
            + "proj_dt_encerramento = ?,"
            + "proj_descricao = ?,"
            + "fk_sit_id = ?,"
            + "fk_tip_id = ?,"
            + "proj_nome = ?"
            + " WHERE proj_id = ?";
    private static final String SQL_DEL_PROJETOS = "DELETE FROM projetos WHERE proj_id = ?";
    private static final String SQL_SEL_BYID = "SELECT * FROM projetos WHERE proj_id= ?";
    private static final String SQL_SEL_ALL = "SELECT * FROM projetos";

    private JDBCProjeto() {
    }

    public static JDBCProjeto getInstance() {
        if (instancia == null) {
            instancia = new JDBCProjeto();
        }

        return instancia;
    }

    @Override
    public void delete(Projeto projeto) {
        try {
            executarComando(SQL_DEL_PROJETOS, projeto.getId());
        } catch (SQLException ex) {
            Logger.getLogger(JDBCProjeto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List getAll() {
        List<Projeto> projetos = null;
        try {
            ResultSet rs = executarQuery(SQL_SEL_ALL);
            if (rs.next()) {
                projetos = new ArrayList<Projeto>();
                do {
                    Projeto projeto = (Projeto) preencherEntidade(rs);
                    projetos.add(projeto);
                } while (rs.next());
            }
        } catch (SQLException ex) {
            Logger.getLogger(JDBCProjeto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return projetos;
    }

    @Override
    public Projeto getByPrimaryKey(Integer id) {
        Projeto projeto = null;
        try {
            ResultSet rs = executarQuery(SQL_SEL_BYID, id);
            if (rs.next()) {
                projeto = (Projeto) preencherEntidade(rs);
            }
        } catch (SQLException ex) {
            Logger.getLogger(JDBCProjeto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return projeto;
    }

    @Override
    public void save(Projeto projeto) {
        if (projeto.getId() == null || projeto.getId() == 0) {
            try {
                executarComando(SQL_ADD_PROJETOS, projeto.getIdentificador(),
                        projeto.getDataCadastro(),
                        projeto.getDataInicio(),
                        projeto.getDataEncerramentoPrevisto(),
                        projeto.getDataEncerramento(),
                        projeto.getDescricao(),
                        projeto.getSituacao(),
                        projeto.getTipo(),
                        projeto.getNome());
            } catch (SQLException ex) {
                try {
                    executarComando(SQL_UPD_PROJETOS, projeto.getIdentificador(),
                            projeto.getIdentificador(),
                            projeto.getDataCadastro(),
                            projeto.getDataInicio(),
                            projeto.getDataEncerramentoPrevisto(),
                            projeto.getDataEncerramento(),
                            projeto.getDescricao(),
                            projeto.getSituacao(),
                            projeto.getTipo(),
                            projeto.getNome(),
                            projeto.getId());
                } catch (SQLException ex1) {
                    Logger.getLogger(JDBCProjeto.class.getName()).log(Level.SEVERE, null, ex1);
                }
            }
        }
    }

    @Override
    protected Object preencherEntidade(ResultSet rs) throws SQLException {
        Projeto projeto = new Projeto();
        projeto.setId(rs.getInt("proj_id"));
        projeto.setDataCadastro(rs.getTimestamp("proj_data_cadastro"));
        projeto.setDataEncerramento(rs.getTimestamp("proj_dt_encerramento"));
        projeto.setDataEncerramentoPrevisto(rs.getTimestamp("proj_dt_encer_previsto"));
        projeto.setDataInicio(rs.getTimestamp("proj_data_inicio"));
        projeto.setDescricao(rs.getString("proj_descricao"));
        projeto.setIdentificador(rs.getString("proj_identificador"));
        projeto.setNome(rs.getString("proj_nome"));
        projeto.setSituacao(JDBCSituacao.getInstance().getByPrimaryKey(rs.getInt("fk_sit_id")));
        projeto.setTipo(JDBCTipo.getInstance().getByPrimaryKey(rs.getInt("fk_tip_id")));
        return projeto;
    }
}
