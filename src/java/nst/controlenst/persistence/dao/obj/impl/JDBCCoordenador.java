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
import nst.controlenst.model.entity.Coordenador;
import nst.controlenst.persistence.dao.GenericJDBCDAO;
import nst.controlenst.persistence.dao.factory.interfaces.CoordenadorDAO;

/**
 *
 * @author pablosouza
 */
public class JDBCCoordenador extends GenericJDBCDAO implements CoordenadorDAO {
    
    private static JDBCCoordenador instancia = null;
    
    
    private static final String SQL_ADD_COORDENADOR = "INSERT INTO COORDENADORES(COORD_NOME) VALUES (?, ?)";
    private static final String SQL_UPD_COORDENADOR = "UPDATE COORDENADORES SET COORD_NOME = ? WHERE COORD_ID = ?";
    private static final String SQL_DEL_COORDENADOR = "DELETE FROM COORDENADORES WHERE COORD_ID = ?";
    private static final String SQL_SEL_BYID = "SELECT * FROM COORDENADORES WHERE COORD_ID= ?";
    private static final String SQL_SEL_ALL = "SELECT * FROM COORDENADORES";
    
    private  JDBCCoordenador(){
        
    }
    
    public static JDBCCoordenador getInstance(){
        if(instancia == null){
            instancia = new JDBCCoordenador();
        }
        return instancia;
    }

    @Override
    public void delete(Coordenador coordenador) {
        try {
            executarComando(SQL_DEL_COORDENADOR, coordenador.getId());
        } catch (SQLException ex) {
            Logger.getLogger(JDBCCoordenador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List getAll() {
        List<Coordenador> coordenadores = new ArrayList<Coordenador>();
        try {
            ResultSet rs = executarQuery(SQL_SEL_ALL);
            if(rs.next()){
                do{
                    Coordenador coord = (Coordenador) preencherEntidade(rs);
                    coordenadores.add(coord);
                }while(rs.next());
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(JDBCCoordenador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return coordenadores;
    }

    @Override
    public Coordenador getByPrimaryKey(Integer id) {
        Coordenador coordenador = null;
        try {
            ResultSet rs = executarQuery(SQL_SEL_BYID, id);
            if(rs.next()){
                coordenador = (Coordenador) preencherEntidade(rs);
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(JDBCCoordenador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return coordenador;
    }

    @Override
    public void save(Coordenador coordenador) {
        /*
         * 
         */
        if(coordenador.getId() == null || coordenador.getId() == 0){
            try {
                executarComando(SQL_ADD_COORDENADOR, coordenador.getNome());
            } catch (SQLException ex) {
                Logger.getLogger(JDBCCoordenador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            try {
                executarComando(SQL_UPD_COORDENADOR, coordenador.getNome(), coordenador.getId());
            } catch (SQLException ex) {
                Logger.getLogger(JDBCCoordenador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }

    @Override
    public Object preencherEntidade(ResultSet rs) throws SQLException {
        Coordenador coordenador = new Coordenador();
        coordenador.setId(rs.getInt("COORD_ID"));
        coordenador.setNome(rs.getString("COORD_NOME"));
        return coordenador;
    }
    
}
