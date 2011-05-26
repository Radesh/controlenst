/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nst.controlenst.persistence.dao.obj.impl;

import java.sql.ResultSet;
import java.util.List;
import nst.controlenst.model.entity.Vinculo;
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
public class JDBCVinculoTest {
    
    public JDBCVinculoTest() {
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
     * Test of save method, of class JDBCVinculo.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        Vinculo vinculo = new Vinculo();
        vinculo.setDescricao("Vinculo 1");
        JDBCVinculo instance = JDBCVinculo.getInstance();
        instance.save(vinculo);
    }
    
    
    /**
     * Test of getByPrimaryKey method, of class JDBCVinculo.
     */
    @Test
    public void testGetByPrimaryKey() {
        System.out.println("getByPrimaryKey");
        Integer id = 1;
        JDBCVinculo instance = JDBCVinculo.getInstance();
        Vinculo result = instance.getByPrimaryKey(id);
        assertNotNull(result);
    }


    /**
     * Test of getAll method, of class JDBCVinculo.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        JDBCVinculo instance = JDBCVinculo.getInstance();
        List result = instance.getAll();
        assertNotNull(result);
    }

    
    /**
     * Test of delete method, of class JDBCVinculo.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Vinculo vinculo = new Vinculo();
        vinculo.setId(1);
        JDBCVinculo instance = JDBCVinculo.getInstance();
        instance.delete(vinculo);
    }
    

    
}
