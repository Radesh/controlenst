/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nst.controlenst.persistence.dao.factory.interfaces;

import java.util.List;
import nst.controlenst.model.entity.Coordenador;

/**
 *
 * @author pablosouza
 */
public interface CoordenadorDAO {
    public void delete(Coordenador coordenador);
    public List getAll();
    public Coordenador getByPrimaryKey(Integer id);
    public void save(Coordenador coordenador);
}
