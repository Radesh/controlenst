/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nst.controlenst.persistence.dao.obj.impl;

import java.sql.ResultSet;
import java.util.List;
import nst.controlenst.model.entity.MotivoSaida;
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
public class JDBCMotivoSaidaTest {
    
    private JDBCMotivoSaida instance = null;
    
    public JDBCMotivoSaidaTest() {
        instance = JDBCMotivoSaida.getInstance();
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
     * Test of save method, of class JDBCMotivoSaida.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        MotivoSaida motivoSaida = new MotivoSaida();
        motivoSaida.setDescricao("Motivo saida 2"); 
        instance.save(motivoSaida);
    }
    
    /**
     * Test of save method, of class JDBCMotivoSaida.
     */
    @Test
    public void testUpdate() {
        System.out.println("save");
        MotivoSaida motivoSaida = new MotivoSaida();
        motivoSaida.setId(1);
        motivoSaida.setDescricao("Motivo saida 1 alterado");
        instance.save(motivoSaida);
    }

    

    /**
     * Test of getAll method, of class JDBCMotivoSaida.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        List result = instance.getAll();
        assertNotNull(result);
    }

    /**
     * Test of getByPrimaryKey method, of class JDBCMotivoSaida.
     */
    @Test
    public void testGetByPrimaryKey() {
        System.out.println("getByPrimaryKey");
        Integer id = 1;
        MotivoSaida result = instance.getByPrimaryKey(id);
        assertNotNull(result);
    }
/**
     * Test of delete method, of class JDBCMotivoSaida.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        MotivoSaida motivoSaida = new MotivoSaida();
        motivoSaida.setId(2);
        instance.delete(motivoSaida);
        
    }

   
}
