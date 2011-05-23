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
import nst.controlenst.model.entity.EmailCoordenador;
import nst.controlenst.persistence.dao.GenericJDBCDAO;
import nst.controlenst.persistence.dao.factory.interfaces.CoordenadorDAO;
import nst.controlenst.persistence.dao.factory.interfaces.EmailCoordenadorDAO;


/**
 *
 * @author pablosouza
 */
public class JDBCEmailCoordenadores extends GenericJDBCDAO implements EmailCoordenadorDAO {

    private static JDBCEmailCoordenadores instancia = null;
    
    private static final String SQL_ADD_EMAIL = "INSERT INTO emails_coordenadores(email_coord_descricao, fk_coord_id) VALUES (?,?)";
    private static final String SQL_UPD_EMAIL = "UPDATE emails_coordenadores SET email_coord_descricao = ?, fk_coord_id = ? WHERE email_coord_id = ?";
    private static final String SQL_DEL_EMAIL = "DELETE FROM emails_coordenadores WHERE email_coord_id = ?";
    private static final String SQL_SEL_BYID = "SELECT * FROM emails_coordenadores WHERE email_coord_id= ?";
    private static final String SQL_SEL_ALL = "SELECT * FROM emails_coordenadores";

    private JDBCEmailCoordenadores() {
    }

    public static JDBCEmailCoordenadores getInstance() {
        if (instancia == null) {
            instancia = new JDBCEmailCoordenadores();
        }

        return instancia;
    }

    @Override
    public void delete(EmailCoordenador email) {
        try {
            executarComando(SQL_DEL_EMAIL, email.getId());
        } catch (SQLException ex) {
            Logger.getLogger(JDBCEmailCoordenadores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List getAll() {
        List<EmailCoordenador> emails = new ArrayList<EmailCoordenador>();
        try {
            ResultSet rs = executarQuery(SQL_SEL_ALL);
            if (rs.next()) {
                do {
                    EmailCoordenador email = (EmailCoordenador) preencherEntidade(rs);
                    emails.add(email);
                } while (rs.next());
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(JDBCEmailCoordenadores.class.getName()).log(Level.SEVERE, null, ex);
        }

        return emails;
    }

    @Override
    public EmailCoordenador getByPrimaryKey(Integer id) {
        EmailCoordenador email = null;
        try {
            ResultSet rs = executarQuery(SQL_SEL_BYID, id);
            if (rs.next()) {
                email = (EmailCoordenador) preencherEntidade(rs);
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(JDBCEmailCoordenadores.class.getName()).log(Level.SEVERE, null, ex);
        }

        return email;
    }

    @Override
    public void save(EmailCoordenador email) {
        if (email.getId() == null || email.getId() == 0) {
            try {
                executarComando(SQL_ADD_EMAIL, email.getDescricao(), email.getCoordenador().getId());
            } catch (SQLException ex) {
                Logger.getLogger(JDBCEmailCoordenadores.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                executarComando(SQL_UPD_EMAIL, email.getDescricao(), email.getCoordenador().getId(), email.getId());
            } catch (SQLException ex) {
                Logger.getLogger(JDBCEmailCoordenadores.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    @Override
    protected Object preencherEntidade(ResultSet rs) throws SQLException {
        EmailCoordenador email = new EmailCoordenador();
        CoordenadorDAO coordenadorDao = JDBCCoordenador.getInstance(); 
        email.setCoordenador(coordenadorDao.getByPrimaryKey(rs.getInt("fk_coord_id")));
        email.setDescricao(rs.getString("email_coord_descricao"));
        email.setId(rs.getInt("email_coord_id"));
        return email;
    }
}
