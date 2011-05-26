/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nst.controlenst.persistence.dao.obj.impl;


import java.text.SimpleDateFormat;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;
import nst.controlenst.model.entity.Coordenador;
import nst.controlenst.model.entity.HistoricoCoordenador;
import nst.controlenst.model.entity.Projeto;
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
public class JDBCHIstoricoCoordenadorTest {
    
    public JDBCHIstoricoCoordenadorTest() {
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
     * Test of save method, of class JDBCHIstoricoCoordenador.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        HistoricoCoordenador historico = new HistoricoCoordenador();
        
        Projeto projeto = new Projeto();
        projeto.setId(1);
        
        Coordenador coordenador = new Coordenador();
        coordenador.setId(1);
        
        Date dataAtual = new Date(System.currentTimeMillis());
        Timestamp tm = new Timestamp(System.currentTimeMillis());
        

        
        historico.setCoordenador(coordenador);
        historico.setDataEntrada(tm);
        historico.setDataSaida(null);
        historico.setMotivoSaida("Sei la");
        historico.setProjeto(projeto);
        JDBCHIstoricoCoordenador instance = JDBCHIstoricoCoordenador.getInstance();
        instance.save(historico);
        
        
        
    }

    /**
     * Test of delete method, of class JDBCHIstoricoCoordenador.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        HistoricoCoordenador historico = null;
        JDBCHIstoricoCoordenador instance = null;
        instance.delete(historico);

    }

    /**
     * Test of getAll method, of class JDBCHIstoricoCoordenador.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        JDBCHIstoricoCoordenador instance = null;
        List expResult = null;
        List result = instance.getAll();
        assertEquals(expResult, result);


    }

    /**
     * Test of getByPrimaryKey method, of class JDBCHIstoricoCoordenador.
     */
    @Test
    public void testGetByPrimaryKey() {
        
        System.out.println("getByPrimaryKey");
        Integer id = 4;
        JDBCHIstoricoCoordenador instance = JDBCHIstoricoCoordenador.getInstance();
        HistoricoCoordenador result = instance.getByPrimaryKey(id);
        assertNotNull(result);
        String dataBanco = new SimpleDateFormat("dd/MM/yyyy").format(result.getDataEntrada());
        System.out.println(dataBanco);
        

    }

    
}
