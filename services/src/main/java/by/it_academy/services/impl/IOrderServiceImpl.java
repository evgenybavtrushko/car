package by.it_academy.services.impl;

import by.it_academy.dao.OrderDAO;
import by.it_academy.dao.UserDao;
import by.it_academy.entities.Order;
import by.it_academy.dto.OrderDTO;
import by.it_academy.services.IOrderService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

public class IOrderServiceImpl extends BaseService<Order> implements IOrderService {
    private static final Logger LOG = Logger.getLogger(IOrderServiceImpl.class);

    @Autowired
    OrderDAO orderDAO;






    @Override
    public boolean specifyTheReasonForFailure(long id, String refusalReason) {
        return false;
    }

    @Override
    public boolean indicateDamage(long id, String damages) {
        return false;
    }

    @Override
    public List<Order> getByUserId(long id) {
        return null;
    }

    @Override
    public List<Order> getAllNewOrders() {
        return null;
    }

    @Override
    public boolean changeOrderStatus(long id, String status) {
        return false;
    }

    @Override
    public Order create(long userId, long carId, Date rental_start_date, int period) {
        return null;
    }

    @Override
    public Order get(long id) {
        return null;
    }

    @Override
    public int delete(long id) {
        return 0;
    }

    @Override
    public List<Order> getAll() {
        return null;
    }

    @Override
    public List<OrderDTO> getAllDTO() {
        return null;
    }

    @Override
    public List<OrderDTO> getAllNewOrdersDTO() {
        return null;
    }

    @Override
    public List<OrderDTO> getByUserIdDTO(long id) {
        return null;
    }


   /* public List<OrderDTO> getAllDTO() {
        try {
            LOG.info("IOrderServiceImpl.getAllDTO()");
            startTransaction();
            List<OrderDTO> list = orderDAO.getAllDTO();
            commit();
            return list;
        } catch (SQLException e) {
            rollback();
            throw new ServiceException("Error getting List<Order> getAllDTO");
        }
    }

    public List<OrderDTO> getAllNewOrdersDTO() {
        try {
            LOG.info("IOrderServiceImpl.getAllNewOrdersDTO()");
            startTransaction();
            List<OrderDTO> list = orderDAO.getAllNewOrdersDTO();
            commit();
            return list;
        } catch (SQLException e) {
            rollback();
            throw new ServiceException("Error getting List<Order> getAllNewOrdersDTO");
        }
    }

    public List<OrderDTO> getByUserIdDTO(long id) {
        try {
            LOG.info("IOrderServiceImpl.getByUserIdDTO()");
            startTransaction();
            List<OrderDTO> list = orderDAO.getByUserIdDTO(id);
            commit();
            return list;
        } catch (SQLException e) {
            rollback();
            throw new ServiceException("Error getting List<Order> getByUserIdDTO");
        }
    }


    @Override
    public boolean specifyTheReasonForFailure(long id, String refusalReason) {
        try {
            LOG.info("IOrderServiceImpl.specifyTheReasonForFailure()");
            startTransaction();
            orderDAO.specifyTheReasonForFailure(id, refusalReason);
            commit();
            return true;
        } catch (SQLException e) {
            rollback();
            throw new ServiceException("Error specify The Reason For Failure");
        }
    }
    @Override
    public boolean indicateDamage(long id, String damages) {
        try {
            LOG.info("IOrderServiceImpl.indicateDamage()");
            startTransaction();
            orderDAO.indicateDamage(id, damages);
            commit();
            return true;
        } catch (SQLException e) {
            rollback();
            throw new ServiceException("Error indicate Damage");
        }
    }

    @Override
    public List<Order> getByUserId(long id) {
        try {
            LOG.info("IOrderServiceImpl.getByUserId()");
            startTransaction();
            List<Order> list = orderDAO.getByUserId(id);
            commit();
            return list;
        } catch (SQLException e) {
            rollback();
            throw new ServiceException("Error getting List<Order> getByUserId");
        }
    }

    @Override
    public List<Order> getAllNewOrders() {
        try {
            LOG.info("IOrderServiceImpl.getAllNewOrders()");
            startTransaction();
            List<Order> list = orderDAO.getAllNewOrders();
            commit();
            return list;
        } catch (SQLException e) {
            rollback();
            throw new ServiceException("Error getting List<Order> getAllNewOrders");
        }
    }

    @Override
    public boolean changeOrderStatus(long id, String status) {
        try {
            LOG.info("IOrderServiceImpl.changeOrderStatus()");
            startTransaction();
            orderDAO.changeOrderStatus(id, status);

            commit();
            return true;
        } catch (SQLException e) {
            rollback();
            throw new ServiceException("Error changeOrderStatus");
        }
    }

    @Override
    public Order create(long userId, long carId, Date rental_start_date, int period) {
        Order order = new Order();
        try {
            LOG.info("IOrderServiceImpl.create()");
            startTransaction();
            order.setUserId(userId);
            Car car = carDAO.get(carId);
            order.setCarId(carId);
            order.setRentalStartDate(rental_start_date);
            order.setPeriod(period);
            order.setTotal(car.getPricePerDay() * period);
            System.out.println(order);
            order = orderDAO.save(order);
            commit();
            return order;
        } catch (SQLException e) {
            rollback();
            throw new ServiceException("Error create Order");
        }
    }
    @Override
    public Order get(long id) {
        try {
            LOG.info("IOrderServiceImpl.get()");
            startTransaction();
            Order order = orderDAO.get(id);
            commit();
            return order;
        } catch (SQLException e) {
            rollback();
            throw new ServiceException("Error get Order id: " + id);
        }
    }

    @Override
    public int delete(long id) {
        try {
            LOG.info("IOrderServiceImpl.delete()");
            startTransaction();
            int x = orderDAO.delete(id);
            commit();
            return x;
        } catch (SQLException e) {
            rollback();
            throw new ServiceException("Error delete Order id: " + id);
        }
    }

    @Override
    public List<Order> getAll() {
        try {
            LOG.info("IOrderServiceImpl.getAll()");
            startTransaction();
            List<Order> list = orderDAO.getAll();
            commit();
            return list;
        } catch (SQLException e) {
            rollback();
            throw new ServiceException("Error getting List<Order> getAll");
        }
    }


    public static IOrderService getInstance() {
        IOrderService orderService = INSTANCE;
        if (orderService == null) {
            synchronized (IOrderServiceImpl.class) {
                orderService = INSTANCE;
                if (orderService == null) {
                    INSTANCE = orderService = new IOrderServiceImpl();
                }
            }
        }

        return orderService;*/
}
