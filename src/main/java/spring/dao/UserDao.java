package spring.dao;

import model.UserEntity;

import java.util.List;

public interface UserDao {
    void add(UserEntity user);
    List<UserEntity> listUsers();
}