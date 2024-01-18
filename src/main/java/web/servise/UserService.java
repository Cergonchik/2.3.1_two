package web.servise;

import org.springframework.stereotype.Component;
import web.model.User;

import java.util.List;


public interface UserService {
    public List<User> getAllUsers();
    public void addUser(User user);
    public void deleteUser(Long userId);
    public void updateUser(User user);
    public User getUser(Long userId);
}
