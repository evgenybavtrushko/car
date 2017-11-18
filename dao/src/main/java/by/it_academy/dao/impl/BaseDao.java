package by.it_academy.dao.impl;

import by.it_academy.dao.DAO;

import lombok.Getter;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Repository
@Transactional
public class BaseDao <T> implements DAO<T> {

    Class<T> clazz;

    @PersistenceContext
    @Getter
    private EntityManager entityManager;

    @Override
    public T add(T t) {
        entityManager.persist(t);
        return t;
    }
    @Override
    public T get(Long id) {
        return entityManager.find(clazz, id);
    }
    @Override
    public T update(T t) {
        entityManager.merge(t);
        return t;
    }
    @Override
    public void delete(Long id) {
        T t = entityManager.find(clazz, id);
        entityManager.remove(t);
    }
}
