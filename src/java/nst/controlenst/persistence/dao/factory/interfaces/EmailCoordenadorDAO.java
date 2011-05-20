/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nst.controlenst.persistence.dao.factory.interfaces;

import java.util.List;
import nst.controlenst.model.entity.EmailCoordenador;

/**
 *
 * @author pablosouza
 */
public interface EmailCoordenadorDAO {
    public void delete(EmailCoordenador email);
    public List getAll();
    public EmailCoordenador getByPrimaryKey(Integer id);
    public void save(EmailCoordenador email);
}
