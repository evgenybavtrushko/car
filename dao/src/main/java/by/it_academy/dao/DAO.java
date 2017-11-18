package by.it_academy.dao;

public interface DAO<T> {

    T add(T t);

    T update(T t);

    T get(Long id);

    void delete(Long id);


}
