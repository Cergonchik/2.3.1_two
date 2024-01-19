package web.dao;

import org.springframework.stereotype.Component;
import web.model.User;

import java.util.List;
@Component
public interface UserDao {
    public List<User> getAllUsers();
    public void addUser(User user);
    public void deleteUser(int userId);
    public void updateUser(int id, User user);
    public User getUser(int userId);

}
