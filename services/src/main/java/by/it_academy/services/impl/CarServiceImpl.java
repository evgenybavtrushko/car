package by.it_academy.services.impl;

import by.it_academy.dao.CarDAO;
import by.it_academy.entities.Car;
import by.it_academy.services.ICarService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
@Transactional
public class CarServiceImpl extends BaseService<Car> implements ICarService {
    private static final Logger LOG = Logger.getLogger(CarServiceImpl.class);

    @Autowired
    CarDAO carDAO;

    @Override
    public List<Car> getAllActiveCar() {
        LOG.info("CarServiceImpl.getAllActiveCar()");
        List<Car> list = carDAO.getAllActiveCar();
        return list;
    }

    @Override
    public boolean changeToInActive(long id) {
        return false;
    }

    @Override
    public boolean changeToActive(long id) {
        return false;
    }

    @Override
    public Car create(String carName, double pricePerDay, String image) {
        return null;
    }

    @Override
    public Car get(Long id) {
        LOG.info("CarServiceImpl.get()");
        Car car = carDAO.get(id);
        return car;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Car> getAll() {
        return null;
    }












   /* @Override
    public boolean changeToInActive(long id) {
        try {
            LOG.info("CarServiceImpl.changeToInActive()");

            carDAO.changeToInActive(id);

            return true;
        } catch (SQLException e) {

            throw new ServiceException("Error change To InActive");
        }
    }

    @Override
    public boolean changeToActive(long id) {
        try {
            LOG.info("CarServiceImpl.changeToActive()");

            carDAO.changeToActive(id);

            return true;
        } catch (SQLException e) {

            throw new ServiceException("Error change To Active");
        }
    }

    @Override
    public Car create(String carName, double pricePerDay, String image) {
        Car car = new Car();
        try {
            LOG.info("CarServiceImpl.save()");

            car.setCarName(carName);
            car.setPricePerDay(pricePerDay);
            car.setImage(image);
            carDAO.save(car);

            return car;
        } catch (SQLException e) {

            throw new ServiceException("Error create Car");
        }
    }


    @Override
    public Car get(long id) {
        try {
            LOG.info("CarServiceImpl.get()");

            Car car = carDAO.get(id);

            return car;
        } catch (SQLException e) {

            throw new ServiceException("Error getting Car by id: " + id);
        }
    }

    @Override
    public int delete(long id) {
        try {
            LOG.info("CarServiceImpl.delete()");

            int x = carDAO.delete(id);

            return x;
        } catch (SQLException e) {

            throw new ServiceException("Error deleting Car id: " + id);
        }
    }

    @Override
    public List<Car> getAll() {
        try {
            LOG.info("CarServiceImpl.getAll()");

            List<Car> list = carDAO.getAll();

            return list;
        } catch (SQLException e) {

            throw new ServiceException("Error getting  List<Car> getAll");
        }
    }*/

}
