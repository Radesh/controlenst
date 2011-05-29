/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nst.controlenst.persistence.dao.obj.impl;

import java.sql.ResultSet;
import java.util.List;
import nst.controlenst.model.entity.TipoIngresso;
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
public class JDBCTipoIngressoTest {
    
    private JDBCTipoIngresso instance = null;
    
    public JDBCTipoIngressoTest() {
        this.instance = JDBCTipoIngresso.getInstance();
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
     * Test of save method, of class JDBCTipoIngresso.
     */
    @Test
    public void testSave() {
        TipoIngresso tipoIngresso = new TipoIngresso();
        tipoIngresso.setDescricao("Tipo 2");
        System.out.println("save:"+tipoIngresso.getDescricao());
        this.instance.save(tipoIngresso);
    }
    
    /**
     * Test of save method, of class JDBCTipoIngresso.
     */
    @Test
    public void testUpdate() {
        TipoIngresso tipoIngresso = new TipoIngresso();
        tipoIngresso.setDescricao("Testando a alteracao");
        tipoIngresso.setId(3);
        System.out.println("save:"+tipoIngresso.getDescricao());
        this.instance.save(tipoIngresso);
    }

    
    /**
     * Test of getByPrimaryKey method, of class JDBCTipoIngresso.
     */
    @Test
    public void testGetByPrimaryKey() {
        Integer id = 1;
        TipoIngresso result = instance.getByPrimaryKey(id);
        assertNotNull(result);
        System.out.println("getByPrimaryKey:"+ result.getDescricao());
    }
   
    /**
     * Test of getAll method, of class JDBCTipoIngresso.
     */
    @Test
    public void testGetAll() {
               
        List result = instance.getAll();
        assertNotNull(result);
        System.out.println("getAll");
        for (Object object : result) {
            System.out.println(((TipoIngresso) object).getDescricao());
        }
    }


    
     /**
     * Test of delete method, of class JDBCTipoIngresso.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        TipoIngresso tipoIngresso = new TipoIngresso();
        tipoIngresso.setId(2);
        instance.delete(tipoIngresso);
    }

}
