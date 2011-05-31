/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nst.controlenst.persistence.dao.obj.impl;

import java.sql.ResultSet;
import java.util.List;
import nst.controlenst.model.entity.Coordenador;
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
public class JDBCCoordenadorTest {
    
    private JDBCCoordenador instance = null;
    
    public JDBCCoordenadorTest() {
        instance = JDBCCoordenador.getInstance();
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
     * Test of save method, of class JDBCCoordenador.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        Coordenador coordenador = new Coordenador();
        coordenador.setNome("Sandro Arruda");
        instance.save(coordenador);
        
    }
    
    /**
     * Test of save method, of class JDBCCoordenador.
     */
    @Test
    public void testUpdate() {
        System.out.println("save");
        Coordenador coordenador = new Coordenador();
        coordenador.setId(1);
        coordenador.setNome("Pablo souza alterado");
        instance.save(coordenador);
        
    }
    /**
     * Test of delete method, of class JDBCCoordenador.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Coordenador coordenador = new Coordenador();
        coordenador.setId(2);
        instance.delete(coordenador);
        
    }

    /**
     * Test of getAll method, of class JDBCCoordenador.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        List result = instance.getAll();
        assertNotNull(result);
    }

    /**
     * Test of getByPrimaryKey method, of class JDBCCoordenador.
     */
    @Test
    public void testGetByPrimaryKey() {
        System.out.println("getByPrimaryKey");
        Integer id = 1;
        Coordenador result = instance.getByPrimaryKey(id);
        assertNotNull(result);
    }

    

    
}
