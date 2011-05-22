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
import nst.controlenst.model.entity.Curso;
import nst.controlenst.persistence.dao.GenericJDBCDAO;
import nst.controlenst.persistence.dao.factory.interfaces.CursoDAO;

/**
 *
 * @author pablosouza
 */
public class JDBCCurso extends GenericJDBCDAO implements CursoDAO{
    
    private static JDBCCurso instancia = null;
    
    private static final String SQL_ADD_CURSO = "INSERT INTO CURSOS(CUR_DESCRICAO) VALUES (?)";
    private static final String SQL_UPD_CURSO = "UPDATE CURSOS SET CUR_DESCRICAO = ? WHERE CUR_ID = ?";
    private static final String SQL_DEL_CURSO = "DELETE FROM CURSOS WHERE CUR_ID = ?";
    private static final String SQL_SEL_BYID = "SELECT * FROM CURSOS WHERE CUR_ID= ?";
    private static final String SQL_SEL_ALL = "SELECT * FROM CURSOS";
    
    private JDBCCurso(){
        
    }
    
    public static JDBCCurso getInstance(){
        if(instancia == null){
            instancia = new JDBCCurso();
        }
        return instancia;
    }

    @Override
    public void delete(Curso curso) {
        try {
            executarComando(SQL_DEL_CURSO, curso.getId());
        } catch (SQLException ex) {
            Logger.getLogger(JDBCCurso.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List getAll() {
        List<Curso> cursos = new ArrayList<Curso>();
        try {
            ResultSet rs = executarQuery(SQL_SEL_ALL);
            if(rs.next()){
            do{
                Curso curso = (Curso) preencherEntidade(rs);
                cursos.add(curso);
            }while(rs.next());
            rs.close();
        }
            
        } catch (SQLException ex) {
            Logger.getLogger(JDBCCurso.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cursos;
    }

    @Override
    public Curso getByPrimaryKey(Integer id) {
        Curso curso = null;
        try {
            ResultSet rs = executarQuery(SQL_SEL_BYID, id);
            if(rs.next()){
                curso = (Curso) preencherEntidade(rs);
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(JDBCCurso.class.getName()).log(Level.SEVERE, null, ex);
        }
        return curso;
    }

    @Override
    public void save(Curso curso) {
        if(curso.getId() == null || curso.getId() == 0){
            try {
                executarComando(SQL_ADD_CURSO, curso.getDescricao());
            } catch (SQLException ex) {
                Logger.getLogger(JDBCCurso.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            try {
                executarComando(SQL_UPD_CURSO, curso.getDescricao(), curso.getId());
            } catch (SQLException ex) {
                Logger.getLogger(JDBCCurso.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    protected Object preencherEntidade(ResultSet rs) throws SQLException {
        Curso curso = new Curso(
                rs.getInt("CUR_ID"),
                rs.getString("CUR_DESCRICAO"));
        return curso;
    }
    
}
