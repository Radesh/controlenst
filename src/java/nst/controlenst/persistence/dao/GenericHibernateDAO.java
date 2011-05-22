package nst.controlenst.persistence.dao;

import nst.controlenst.persistence.dao.connection.ConnectionHIBERNATE;
import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class GenericHibernateDAO {

    public GenericHibernateDAO() {
    }

    protected Session getSession() {
        return ConnectionHIBERNATE.getInstance().getSession();
    }

    protected Serializable getPurePojo(String query, Object... params) {

        Query qr = getSession().createQuery(query);

        for (int i = 1; i <= params.length; i++) {
            qr.setParameter(i, params[i - 1]);
        }

        Object toReturn = qr.uniqueResult();

        getSession().getTransaction().commit();
        getSession().close();

        return (Serializable) toReturn;
    }

    
    protected <T extends Serializable> List<T> getPureListPojo(
            Class<T> classToCast, String query, Object... params) {

        Query qr = getSession().createQuery(query);

        for (int i = 1; i <= params.length; i++) {
            qr.setParameter(i, params[i - 1]);
        }

        List<T> toReturn = qr.list();

        getSession().getTransaction().commit();
        getSession().close();

        return toReturn;
    }

    protected void saveOrUpdatePojo(Serializable pojo) {
        getSession().saveOrUpdate(pojo);
        getSession().getTransaction().commit();
        getSession().close();
    }

    protected <T extends Serializable> T getPojo(Class<T> classToSearch,
            Serializable key) {
        Serializable toReturn = (Serializable) getSession().get(classToSearch,
                key);
        getSession().getTransaction().commit();
        getSession().close();
        return (T) toReturn;
    }

    protected void deletePojo(Serializable pojo) {
        getSession().delete(pojo);
        getSession().getTransaction().commit();
        getSession().close();
    }
}
