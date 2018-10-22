package spring.service;

import model.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.dao.UserDao;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserDao userDao;

    @Transactional
    @Override
    public void add(UserEntity user) {
        userDao.add(user);
    }

    @Transactional(readOnly = true)
    @Override
    public List<UserEntity> listUsers() {
        return userDao.listUsers();
    }

}