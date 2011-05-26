
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pablosouza
 */
public class TesteData {
    public static void main(String[] args) throws ParseException {
        Date dataAtual = new Date(System.currentTimeMillis()); 
        System.out.println("Data sem formato"+dataAtual.toString());
        String dataBanco = new SimpleDateFormat("yyyy-MM-dd").format(dataAtual);
        System.out.println(dataBanco.toString());
    }
}
