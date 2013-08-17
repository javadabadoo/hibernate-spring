package doo.daba.java.pruebas.hibernate.dao;

import doo.daba.java.pruebas.hibernate.entity.User;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Gerardo Aquino
 * Date: 16/08/13
 */
public interface UserDao {

    User getUserById(int id);

}
