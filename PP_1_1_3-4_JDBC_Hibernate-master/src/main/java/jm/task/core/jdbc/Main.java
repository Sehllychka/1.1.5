package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;

public class Main {
    public static void main(String[] args) {

        UserDao userDao = new UserDaoHibernateImpl();


/*        userDao.createUsersTable();

        userDao.saveUser("Jeka", "LastName1", (byte) 21);
        userDao.saveUser("Name2", "LastName2", (byte) 25);
        userDao.saveUser("Name3", "LastName3", (byte) 31);
        userDao.saveUser("Name4", "LastName4", (byte) 38);
        userDao.getAllUsers();*/

//        userDao.cleanUsersTable();

        System.out.println(userDao.getAllUsers());


 /*       userDao.removeUserById(1);
        userDao.dropUsersTable();


        userDao.removeUserById(1);
        userDao.getAllUsers();
        userDao.cleanUsersTable();
        userDao.dropUsersTable();
    */
    }
}