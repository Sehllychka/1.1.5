package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    private final UserDao userDaoHiber = new UserDaoHibernateImpl();
    public void createUsersTable() {
        userDaoHiber.createUsersTable();
    }

    public void dropUsersTable() {
        userDaoHiber.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {
        userDaoHiber.saveUser(name, lastName, age);
    }

    public void removeUserById(long id) {
        userDaoHiber.removeUserById(id);
    }

    public List<User> getAllUsers() {
        List <User> list = userDaoHiber.getAllUsers();
        list.forEach(System.out::println);
        return list;
    }
    public void cleanUsersTable() {
        userDaoHiber.cleanUsersTable();
    }
}