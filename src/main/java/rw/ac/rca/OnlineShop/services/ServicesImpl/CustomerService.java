package rw.ac.rca.OnlineShop.services.ServicesImpl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import rw.ac.rca.OnlineShop.models.Customer;
import rw.ac.rca.OnlineShop.repositories.ICustomerRepository;
import rw.ac.rca.OnlineShop.services.ICustomerService;

@AllArgsConstructor
@Service
public class CustomerService implements ICustomerService {
    private final ICustomerRepository customerRepository;
    @Override
    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
}
