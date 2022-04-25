package br.com.fiap.abctechservice.repository;

import br.com.fiap.abctechservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    @Query(value = "SELECT * FROM orders o WHERE o.operator_id = ?1",
            nativeQuery = true)
    public List<Order> findByOperatorId(Long id);
}
