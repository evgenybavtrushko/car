package by.it_academy.services.impl;

import by.it_academy.dao.DAO;
import by.it_academy.services.IService;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@NoArgsConstructor
@Service
@Transactional
public class BaseService<T> implements IService<T> {

    @Autowired
    private DAO<T> baseDao;

    @Override
    public T add(T t) {
        baseDao.add(t);
        return t;
    }

    @Override
    public T update(T t) {
        return baseDao.update(t);
    }

    @Override
    public T get(Long id) {
        return baseDao.get(id);
    }

    @Override
    public void delete(Long id) {
        baseDao.delete(id);
    }
}
