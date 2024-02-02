/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import java.util.Optional;

/**
 *
 * @author Administrator
 */
public class UserApplication {
    private static Dao<User> userDao;
  public static void main(String[] args) {
              userDao = (Dao<User>) new UserDao();

 User user1 = getUser(0);
 System.out.println(user1);
 userDao.update(user1, new String[]{"Jake", "jake@domain.com"});

 User user2 = getUser(1);
 userDao.delete(user2);
 userDao.save(new User("Julie", "julie@domain.com"));
 // make a traversal in userDao.getAll() to display all users
 userDao.getAll().forEach(user -> System.out.println(user.getName()));
 }
 private static User getUser(long id) {
 Optional<User> user = userDao.get(id);

 return user.orElseGet(
 () -> new User("non-existing user", "no-email"));
 }
}