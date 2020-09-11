package hibernate.dao;

import hibernate.OrmStudentInfo;
import hibernate.config.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;

public class StudentInfoDao {
    public List<OrmStudentInfo> getStudentInfos(List<String> studentIds) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            Query query = session.createQuery("FROM OrmStudentInfo s where s.studentId in :studentIds");
            query.setParameterList("studentIds", studentIds);
            return query.list();
        } finally {
            session.close();
        }
    }
}
