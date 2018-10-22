package spring.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import model.UserEntity;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class UserDaoImp implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void add(UserEntity user) {
        sessionFactory.getCurrentSession().save(user);
    }

    @Override
    public List<UserEntity> listUsers() {
        @SuppressWarnings("unchecked")
        TypedQuery<UserEntity> query=sessionFactory.getCurrentSession().createQuery("from UserEntity");
        return query.getResultList();
    }

}