package nitish.eCommerce.repo;

import nitish.eCommerce.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrderRepo extends JpaRepository<Orders,Integer> {
}
