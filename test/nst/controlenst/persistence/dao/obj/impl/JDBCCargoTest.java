/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nst.controlenst.persistence.dao.obj.impl;

import java.sql.ResultSet;
import java.util.List;
import nst.controlenst.model.entity.Cargo;
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
public class JDBCCargoTest {
    
    public JDBCCargoTest() {
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
     * Test of getInstance method, of class JDBCCargo.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        JDBCCargo result = JDBCCargo.getInstance();
        assertNotNull(result);
    }
    
        /**
     * Test of save method, of class JDBCCargo.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        Cargo cargo = new Cargo();
        cargo.setDescricao("Teste Cargo");
        JDBCCargo instance = JDBCCargo.getInstance();
        instance.save(cargo);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    
            /**
     * Test of save method, of class JDBCCargo.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Cargo cargo = new Cargo();
        cargo.setId(1);
        cargo.setDescricao("testUpdate");
        JDBCCargo instance = JDBCCargo.getInstance();
        instance.save(cargo);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of delete method, of class JDBCCargo.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Cargo cargo = new Cargo();
        cargo.setId(2);
        JDBCCargo instance = JDBCCargo.getInstance();
        instance.delete(cargo);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getAll method, of class JDBCCargo.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        JDBCCargo instance = JDBCCargo.getInstance();
        List result = instance.getAll();
        assertNotNull(result);
        for (Object object : result) {
            System.out.println(((Cargo) object).getDescricao());
        }
    }

    /**
     * Test of getByPrimaryKey method, of class JDBCCargo.
     */
    @Test
    public void testGetByPrimaryKey() {
        
        Integer id = 1;
        JDBCCargo instance = JDBCCargo.getInstance();
        Cargo result = instance.getByPrimaryKey(id);
        assertNotNull(result);
        System.out.println("getByPrimaryKey: "+result.getDescricao());
        
    }
}
