/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nst.controlenst.persistence.dao.obj.impl;

import java.sql.ResultSet;
import java.util.List;
import nst.controlenst.model.entity.Curso;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pablosouza
 */
public class JDBCCursoTest {
    
    private JDBCCurso instance = null;
    
    public JDBCCursoTest() {
        instance = JDBCCurso.getInstance();
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    /**
     * Test of save method, of class JDBCCurso.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        Curso curso = new Curso();
        curso.setDescricao("curso 2");
        instance.save(curso);
        
    }
    
    /**
     * Test of save method, of class JDBCCurso.
     */
    @Test
    public void testUpdate() {
        System.out.println("save");
        Curso curso = new Curso();
        curso.setId(1);
        curso.setDescricao("curso 1 alterado");
        instance.save(curso);
        
    }
    

    /**
     * Test of getAll method, of class JDBCCurso.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        List result = instance.getAll();
        assertNotNull(result);
    }

    /**
     * Test of getByPrimaryKey method, of class JDBCCurso.
     */
    @Test
    public void testGetByPrimaryKey() {
        System.out.println("getByPrimaryKey");
        Integer id = 1;
        Curso result = instance.getByPrimaryKey(id);
        assertNotNull(result);
    }
    
    /**
     * Test of delete method, of class JDBCCurso.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Curso curso = new Curso();
        curso.setId(2);
        instance.delete(curso);
    }
}
