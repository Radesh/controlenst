/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nst.controlenst.persistence.dao.factory.interfaces;

import java.util.List;
import nst.controlenst.model.entity.EmailParticipante;

/**
 *
 * @author pablosouza
 */
public interface EmailParticipanteDAO {
    public void delete(EmailParticipante email);
    public List getAll();
    public EmailParticipante getByPrimaryKey(Integer id);
    public void save(EmailParticipante email);
}
