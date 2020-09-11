package hibernate.dao;

import hibernate.OrmPreference;
import hibernate.config.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Query;
import utils.Validators;

import java.util.List;

public class PreferenceDao {
    public OrmPreference getPreference(String studentId) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            Query query = session.createQuery("FROM OrmPreference s where s.studentId = :studentId");
            if (Validators.isEmpty(studentId)) {
                return null;
            } else {
                query.setParameter("studentId", studentId);
                List<OrmPreference> resultList = query.list();
                if (resultList != null && resultList.size() > 0) {
                    return resultList.get(0);
                } else {
                    return null;
                }
            }
        } finally {
            session.close();
        }
    }

    public List<OrmPreference> getPreferenceListFromStudentIds(List<String> studentIds) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            Query query = session.createQuery("FROM OrmPreference s where s.studentId in :studentIds");
            query.setParameterList("studentIds", studentIds);
            return query.list();
        } finally {
            session.close();
        }
    }
}
