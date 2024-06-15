package rw.ac.rca.OnlineShop.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "customers")
public class Customer{
    private String firstName;
    private String phone;
    @OneToOne
    private User profile;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long customer_id;

    public void setCustomer_id(Long customerId) {
        this.customer_id = customerId;
    }

    public Long getCustomer_id() {
        return customer_id;
    }
}
