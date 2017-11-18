package by.it_academy.entities;

import by.it_academy.enums.ClientType;
import by.it_academy.enums.OrderStatus;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "USER_PROFILE")
public class OrderProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "STATUS", length = 15, unique = true, nullable = false)
    private String status = OrderStatus.NEW.getType();

    @Override
    public String toString() {
        return "OrderProfile [id=" + id + ",  type=" + status + "]";
    }
}
