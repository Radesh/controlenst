/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nst.controlenst.persistence.dao.obj.impl;

import java.sql.ResultSet;
import java.util.List;
import nst.controlenst.model.entity.EmailParticipante;
import nst.controlenst.model.entity.Participante;
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
public class JDBCEmailParticipanteTest {
    
    private JDBCEmailParticipante instance = null;
    
    public JDBCEmailParticipanteTest() {
        instance = JDBCEmailParticipante.getInstance();
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
     * Test of save method, of class JDBCEmailParticipante.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        EmailParticipante email = new EmailParticipante();
        email.setDescricao("emails1");
        Participante participante = JDBCParticipante.getInstance().getByPrimaryKey(1);
        email.setParticipante(participante);
        instance.save(email);
        
    }

    /**
     * Test of save method, of class JDBCEmailParticipante.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        EmailParticipante email = null;
        JDBCEmailParticipante instance = null;
        instance.save(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    

    /**
     * Test of getAll method, of class JDBCEmailParticipante.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        JDBCEmailParticipante instance = null;
        List expResult = null;
        List result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getByPrimaryKey method, of class JDBCEmailParticipante.
     */
    @Test
    public void testGetByPrimaryKey() {
        System.out.println("getByPrimaryKey");
        Integer id = null;
        JDBCEmailParticipante instance = null;
        EmailParticipante expResult = null;
        EmailParticipante result = instance.getByPrimaryKey(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    /**
     * Test of delete method, of class JDBCEmailParticipante.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        EmailParticipante email = null;
        JDBCEmailParticipante instance = null;
        instance.delete(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
