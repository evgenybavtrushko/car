package by.it_academy.entities;

import by.it_academy.enums.ClientType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name="USER_PROFILE")
public class UserProfile {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name="TYPE", length=15, unique=true, nullable=false)
    private String type = ClientType.USER.getType();

    @Override
    public String toString() {
        return "PersonProfile [id=" + id + ",  type=" + type	+ "]";
    }
}

