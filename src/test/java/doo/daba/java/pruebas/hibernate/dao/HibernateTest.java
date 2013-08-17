package doo.daba.java.pruebas.hibernate.dao;

import doo.daba.java.pruebas.hibernate.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created with IntelliJ IDEA.
 * User: Gerardo Aquino
 * Date: 16/08/13
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath:spring-context.xml"
})
public class HibernateTest {


    @Autowired
    UserDao userDao;



    @Test
    public void testUserDao() {
        User user = this.userDao.getUserById(1);
	    assert user != null;
    }


}
