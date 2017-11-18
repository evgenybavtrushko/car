package by.it_academy.services;

public interface IService <T> {
    T add(T t);
    T update(T t);
    T get(Long id);
    void delete(Long id);
}
