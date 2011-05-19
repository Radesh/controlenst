/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nst.controlenst.persistence.dao.util;

import nst.controlenst.persistence.dao.factory.interfaces.DAOFactory;

/**
 *
 * @author pablosouza
 */
public class ControlaFabricasDAO {
    
    private static DAOFactory factory = null;
    
    public static DAOFactory getFactoryType() throws Exception{
        if(factory != null){
            return factory;
        }else{
            throw new Exception("DAOFactory nao foi inicializado.");
        }
    }
    
    
    
    public static void setFactoryType(DAOFactory factory){
        
        ControlaFabricasDAO.factory = factory;
    }
}
