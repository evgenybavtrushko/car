package by.it_academy.services;

import by.it_academy.entities.Car;

import java.util.List;

public interface ICarService extends IService<Car> {
     List<Car> getAllActiveCar();


    boolean changeToInActive(long id);
    boolean changeToActive(long id);
    Car create(String carName, double pricePerDay, String image);
    Car get(Long id);
    void delete(Long id);
    List<Car> getAll();
}
