package spring.jpa.repository;

import org.springframework.data.repository.CrudRepository;
import spring.jpa.entity.Customer;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);

    Customer findById(long id);
}
