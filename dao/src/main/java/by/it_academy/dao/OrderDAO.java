package by.it_academy.dao;

import by.it_academy.entities.Order;
import by.it_academy.dto.OrderDTO;

import java.sql.SQLException;
import java.util.List;

public interface OrderDAO extends DAO<Order> {

    boolean specifyTheReasonForFailure(Long id, String refusalReason) ;

    boolean indicateDamage(Long id, String damages) ;

    List<Order> getByUserId(Long id) ;

    List<Order> getAllNewOrders() ;

    boolean changeOrderStatus(Long id, String status) ;





    List<OrderDTO> getAllDTO();

    List<OrderDTO> getByUserIdDTO(Long id) ;

    List<OrderDTO> getAllNewOrdersDTO() ;



}
