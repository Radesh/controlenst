/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nst.controlenst.persistence.dao.factory.interfaces;

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
public class CargoDAOTest {
    
    public CargoDAOTest() {
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
     * Test of delete method, of class CargoDAO.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Cargo cargo = null;
        CargoDAO instance = new CargoDAOImpl();
        instance.delete(cargo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class CargoDAO.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        CargoDAO instance = new CargoDAOImpl();
        List expResult = null;
        List result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getByPrimaryKey method, of class CargoDAO.
     */
    @Test
    public void testGetByPrimaryKey() {
        System.out.println("getByPrimaryKey");
        Integer id = null;
        CargoDAO instance = new CargoDAOImpl();
        Cargo expResult = null;
        Cargo result = instance.getByPrimaryKey(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of save method, of class CargoDAO.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        Cargo cargo = null;
        CargoDAO instance = new CargoDAOImpl();
        instance.save(cargo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class CargoDAOImpl implements CargoDAO {

        public void delete(Cargo cargo) {
        }

        public List getAll() {
            return null;
        }

        public Cargo getByPrimaryKey(Integer id) {
            return null;
        }

        public void save(Cargo cargo) {
        }
    }
}
