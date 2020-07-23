package spring.jpa.repository;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;
import spring.jpa.entity.Customer;

@RunWith(SpringRunner.class)
@DataJpaTest
public class CustomerRepositoryTest {


    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private CustomerRepository customerRepository;

    @Test
    public void whenFindById_thenReturnCustomer() {
        //Given
        Customer customer = Customer.of(1L, "fname", "lname");

        customerRepository.save(customer);

        //when
        Customer c = customerRepository.findById(1L);

        //then
        Assert.assertNotNull(c);
    }

}
