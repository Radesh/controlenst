/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nst.controlenst.persistence.dao.obj.impl;

import java.sql.ResultSet;
import java.util.List;
import nst.controlenst.model.entity.Situacao;
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
public class JDBCSituacaoTest {
    
    private JDBCSituacao instance = null;
    
    public JDBCSituacaoTest() {
        instance = JDBCSituacao.getInstance();
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
     * Test of save method, of class JDBCSituacao.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        Situacao situacao = new Situacao();
        situacao.setDescricao("Situacao 2");  
        instance.save(situacao);
    }
    
    /**
     * Test of save method, of class JDBCSituacao.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Situacao situacao = new Situacao();
        situacao.setId(1);
        situacao.setDescricao("Situacao 1 alterado");
        instance.save(situacao);
    }


    /**
     * Test of getAll method, of class JDBCSituacao.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        List result = instance.getAll();
        assertNotNull(result);
    }

    /**
     * Test of getByPrimaryKey method, of class JDBCSituacao.
     */
    @Test
    public void testGetByPrimaryKey() {
        System.out.println("getByPrimaryKey");
        Integer id = 3;
        Situacao result = instance.getByPrimaryKey(id);
        assertNotNull(result);
    }

   
    /**
     * Test of delete method, of class JDBCSituacao.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Situacao situacao = new Situacao();
        situacao.setId(2);
        instance.delete(situacao);
    }
   }

