package dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import entity.User;

@Repository
public interface UserDao {
	User selectUser(User user);
	void addUser(User user);
	void updateUser(User user);
	List<User> allUsers();
}
