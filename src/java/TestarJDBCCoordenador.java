
import java.util.List;
import nst.controlenst.model.entity.Coordenador;
import nst.controlenst.persistence.dao.factory.impl.JDBCFactory;
import nst.controlenst.persistence.dao.factory.interfaces.CoordenadorDAO;
import nst.controlenst.persistence.dao.util.ControlaFabricasDAO;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pablosouza
 */
public class TestarJDBCCoordenador {
    public static void main(String[] args) throws Exception {
        //Primeiro seta o tipo de Persistencia
        ControlaFabricasDAO.setFactoryType(new JDBCFactory());
        
        CoordenadorDAO coordenadorDAO = ControlaFabricasDAO.getFactoryType().getCoordenadorDAO();
        
        //Adcionar um coordenador
//        Coordenador coordenador0 = new Coordenador();
//        coordenador0.setEmail("pvrsouza@gmail.com");
//        coordenador0.setNome("Pablo Souza");
//        coordenadorDAO.save(coordenador0);
        
        
//        Coordenador coordenador1 = new Coordenador();
//        coordenador1.setEmail("vsouza@gmail.com");
//        coordenador1.setNome("Vanessa Souza");
//        coordenadorDAO.save(coordenador1);
        
        
        //Pegar pelo ID
        //System.out.println(coordenadorDAO.getByPrimaryKey(1).getNome());
        
        
        
        //Atualizar um registro
        Coordenador coordeUpd = new Coordenador(1, "Pablo Delicia de coco", "pvrsouza@gmail.com");
        coordenadorDAO.save(coordeUpd);
        
        //Pegar todos
        List<Coordenador> todos = coordenadorDAO.getAll();
        for (Coordenador coordenador : todos) {
            System.out.println("Nome: "+coordenador.getNome());
        }
        
    }
}
