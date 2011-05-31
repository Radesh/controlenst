/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nst.controlenst.persistence.dao.obj.impl;

import java.sql.ResultSet;
import java.util.List;
import nst.controlenst.model.entity.Coordenador;
import nst.controlenst.model.entity.EmailCoordenador;
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
public class JDBCEmailCoordenadoresTest {
    
    private JDBCEmailCoordenadores instance = null;
    
    public JDBCEmailCoordenadoresTest() {
        instance = JDBCEmailCoordenadores.getInstance();
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
     * Test of save method, of class JDBCEmailCoordenadores.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        EmailCoordenador email = new EmailCoordenador();
        Coordenador coordenador = JDBCCoordenador.getInstance().getByPrimaryKey(3);
        email.setCoordenador(coordenador);
        email.setDescricao("vanessa@gmail.com");
        instance.save(email);
    }
    
    /**
     * Test of save method, of class JDBCEmailCoordenadores.
     */
    @Test
    public void testUpdate() {
        System.out.println("save");
        EmailCoordenador email = new EmailCoordenador();
        Coordenador coordenador = JDBCCoordenador.getInstance().getByPrimaryKey(1);
        email.setCoordenador(coordenador);
        email.setDescricao("emailalteado.com");
        email.setId(2);
        instance.save(email);
    }
    
    /**
     * Test of delete method, of class JDBCEmailCoordenadores.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        EmailCoordenador email = new EmailCoordenador();
        email.setId(1);
        instance.delete(email);
        
    }

    /**
     * Test of getAll method, of class JDBCEmailCoordenadores.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        List result = instance.getAll();
        assertNotNull(result);
    }

    /**
     * Test of getByPrimaryKey method, of class JDBCEmailCoordenadores.
     */
    @Test
    public void testGetByPrimaryKey() {
        System.out.println("getByPrimaryKey");
        Integer id = 3;
        EmailCoordenador result = instance.getByPrimaryKey(id);
        assertNotNull(result);
    }

    

}
