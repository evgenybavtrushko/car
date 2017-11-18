package by.it_academy.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ORDERS")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private double total;
    @CreationTimestamp
    private LocalDateTime createdDate;
    @Column
    private Date rentalStartDate;
    @Column
    private int period;
    @Column
    private String refusalReason;
    @Column
    private String damages;

    @ManyToOne
    private OrderProfile status;

    @ManyToOne
    private User user;

    @ManyToOne
    private Car car;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;

        Order order = (Order) o;

        if (id != null ? !id.equals(order.id) : order.id != null) return false;
        if (refusalReason != null ? !refusalReason.equals(order.refusalReason) : order.refusalReason != null) return false;
        return damages != null ? damages.equals(order.damages) : order.damages == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Order : id: " + id + " damages: " + damages + " refusalReason: " + refusalReason + " createdDate: " +createdDate;
    }
}
