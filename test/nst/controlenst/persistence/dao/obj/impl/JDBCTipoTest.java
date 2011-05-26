/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nst.controlenst.persistence.dao.obj.impl;

import java.sql.ResultSet;
import java.util.List;
import nst.controlenst.model.entity.Tipo;
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
public class JDBCTipoTest {
    
    public JDBCTipoTest() {
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
     * Test of save method, of class JDBCTipo.
     */
    @Test
    public void testSave() {
        
        Tipo tipo = new Tipo();
        tipo.setDescricao("tipo 1");
        JDBCTipo instance = JDBCTipo.getInstance();
        instance.save(tipo);
        System.out.println("save"+tipo.getDescricao());
    }

    /**
     * Test of getByPrimaryKey method, of class JDBCTipo.
     */
    @Test
    public void testGetByPrimaryKey() {
        System.out.println("getByPrimaryKey");
        Integer id = 1;
        JDBCTipo instance = JDBCTipo.getInstance();
        Tipo result = instance.getByPrimaryKey(id);
        assertNotNull(result);
        System.out.println(result.getDescricao());
    }

    /**
     * Test of getAll method, of class JDBCTipo.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        JDBCTipo instance = JDBCTipo.getInstance();
        List result = instance.getAll();
        assertNotNull(result);
        System.out.println(((Tipo)result.get(1)).getDescricao());
    } 

    /**
     * Test of delete method, of class JDBCTipo.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Tipo tipo = new Tipo();
        tipo.setId(2);
        JDBCTipo instance = JDBCTipo.getInstance();
        instance.delete(tipo);
    }
}
