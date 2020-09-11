package hibernate.dao;

import hibernate.config.HibernateUtil;
import hibernate.OrmStudents;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;

public class StudentsDao {

    public OrmStudents getStudentById(String studentId) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            OrmStudents student = null;
            student = (OrmStudents) session.get(OrmStudents.class, studentId);
            return student;
        } finally {
            session.close();
        }
    }

    public List<OrmStudents> getAllStudentsById(List<String> studentIds) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            Query query = session.createQuery("FROM OrmStudents s where s.id in :studentIds");
            query.setParameterList("studentIds", studentIds);
            return query.list();
        } finally {
            session.close();
        }
    }
}
