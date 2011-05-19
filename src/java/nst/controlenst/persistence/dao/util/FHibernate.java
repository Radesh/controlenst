package nst.controlenst.persistence.dao.util;

import nst.controlenst.model.entity.Cargo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class FHibernate {

    private static FHibernate instancia = null;
    
    private SessionFactory sessionFactory;

    private FHibernate() {

        sessionFactory = new AnnotationConfiguration()
                .setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect")
                .setProperty("hibernate.connection.driver_class", "org.postgresql.Driver")
                .setProperty("hibernate.connection.url", "jdbc:postgresql://localhost:5432/teste")
                .setProperty("hibernate.connection.username", "postgres")
                .setProperty("hibernate.connection.password", "deliciadecoco")
                .setProperty("hibernate.hbm2ddl.auto", "none") 
                .setProperty("hibernate.show_sql", "true") 
                .setProperty("hibernate.format_sql", "true")
                .setProperty("hibernate.c3p0.acquire_increment", "1")
                .setProperty("hibernate.c3p0.idle_period", "100")
                .setProperty("hibernate.c3p0.max_size", "10")
                .setProperty("hibernate.c3p0.max_statments", "0")
                .setProperty("hibernate.c3p0.min_size", "5")
                .setProperty("hibernate.c3p0.timeout", "100")
                //.addAnnotatedClass(Cargo.class)
                //.addAnnotatedClass(Sale.class)
                //.addAnnotatedClass(Product.class)
                .buildSessionFactory();
    }

    public Session getSession() {
        Session retorno = sessionFactory.openSession();
        retorno.beginTransaction();
        return retorno;
    }

    public static FHibernate getInstance() {
        if (instancia == null) {
            instancia = new FHibernate();
        }
        return instancia;
    }
}
