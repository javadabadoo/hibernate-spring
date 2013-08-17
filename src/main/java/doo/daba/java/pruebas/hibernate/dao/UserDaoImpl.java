package doo.daba.java.pruebas.hibernate.dao;

import doo.daba.java.pruebas.hibernate.entity.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Gerardo Aquino
 * Date: 16/08/13
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;

	@Value("${user.select.byId}")
	private String selectById;



    @Override
    public User getUserById(int id) {
        Session session = sessionFactory.openSession();
        Query query = session.createQuery(this.selectById).setParameter("id", id);

        return (User) query.uniqueResult();
    }
}
