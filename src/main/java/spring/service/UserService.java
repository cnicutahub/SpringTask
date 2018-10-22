package spring.service;

import model.UserEntity;

import java.util.List;

public interface UserService {
    void add(UserEntity userEntity);

    List<UserEntity> listUsers();
}