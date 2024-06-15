package rw.ac.rca.OnlineShop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import rw.ac.rca.OnlineShop.models.Customer;

public interface ICustomerRepository extends JpaRepository<Customer, Integer> {
}
