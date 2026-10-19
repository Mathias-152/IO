package edu.arch.shop.customer.repository;

import edu.arch.shop.order.entity.Order;
import edu.arch.shop.customer.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
