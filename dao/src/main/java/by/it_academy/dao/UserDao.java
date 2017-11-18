package by.it_academy.dao;

import by.it_academy.entities.User;

import java.sql.SQLException;
import java.util.List;

public interface UserDao extends DAO<User> {

    List<User> getAllActiveUsers() ;

    User getByLogin(String login) throws SQLException;


    boolean changePassword(long id, String password, String newPassword);

    boolean changeEmail(long id, String newEmail);

    boolean changeActive(long id, boolean active);

    boolean checkLogin(String login);
}
