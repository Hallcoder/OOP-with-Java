package rw.ac.rca.OnlineShop.services;

import rw.ac.rca.OnlineShop.models.User;

public interface IUserService {
  public User createUser(User user);
  public User getUserById(int id);
}
