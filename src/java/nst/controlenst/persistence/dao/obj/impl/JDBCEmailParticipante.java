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
import nst.controlenst.model.entity.EmailParticipante;
import nst.controlenst.persistence.dao.GenericJDBCDAO;
import nst.controlenst.persistence.dao.factory.interfaces.EmailParticipanteDAO;

/**
 *
 * @author pablosouza
 */
public class JDBCEmailParticipante extends GenericJDBCDAO implements EmailParticipanteDAO {

    private static JDBCEmailParticipante instancia = null;
    private static final String SQL_ADD_EMAIL = "INSERT INTO Emails_Participantes(email_part_descricao, fk_part_id) VALUES (?,?)";
    private static final String SQL_UPD_EMAIL = "UPDATE Emails_Participantes SET email_part_descricao = ?, fk_part_id = ? WHERE email_part_id = ?";
    private static final String SQL_DEL_EMAIL = "DELETE FROM Emails_Participantes WHERE email_part_id = ?";
    private static final String SQL_SEL_BYID = "SELECT * FROM Emails_Participantes WHERE email_part_id= ?";
    private static final String SQL_SEL_ALL = "SELECT * FROM Emails_Participantes";

    private JDBCEmailParticipante() {
    }

    public static JDBCEmailParticipante getInstance() {
        if (instancia == null) {
            instancia = new JDBCEmailParticipante();
        }
        return instancia;
    }

    @Override
    public void delete(EmailParticipante email) {
        try {
            executarComando(SQL_DEL_EMAIL, email.getId());
        } catch (SQLException ex) {
            Logger.getLogger(JDBCEmailParticipante.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List getAll() {
        List<EmailParticipante> emails = new ArrayList<EmailParticipante>();
        try {
            ResultSet rs = executarQuery(SQL_SEL_ALL);
            if (rs.next()) {
                do {
                    EmailParticipante email = (EmailParticipante) preencherEntidade(rs);
                    emails.add(email);
                } while (rs.next());
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(JDBCEmailParticipante.class.getName()).log(Level.SEVERE, null, ex);
        }
        return emails;
    }

    @Override
    public EmailParticipante getByPrimaryKey(Integer id) {
        EmailParticipante email = null;
        try {
            ResultSet rs = executarQuery(SQL_SEL_BYID, id);
            if (rs.next()) {
                email = (EmailParticipante) preencherEntidade(rs);
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(JDBCEmailParticipante.class.getName()).log(Level.SEVERE, null, ex);
        }
        return email;
    }

    @Override
    public void save(EmailParticipante email) {
        if (email.getId() == null || email.getId() == 0) {
            try {
                executarComando(SQL_ADD_EMAIL, email.getDescricao(), email.getParticipante().getId());
            } catch (SQLException ex) {
                Logger.getLogger(JDBCEmailParticipante.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                executarComando(SQL_UPD_EMAIL, email.getDescricao(), email.getParticipante().getId(), email.getId());
            } catch (SQLException ex) {
                Logger.getLogger(JDBCEmailParticipante.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    protected Object preencherEntidade(ResultSet rs) throws SQLException {
        EmailParticipante email = new EmailParticipante();
        email.setId(rs.getInt("EMAIL_PART_ID"));
        email.setDescricao(rs.getString("EMAIL_PART_DESCRICAO"));
        email.setParticipante(JDBCParticipante.getInstance().getByPrimaryKey(rs.getInt("FK_PART_ID")));
        return email;
    }
}
