package nitish.eCommerce.repo;

import nitish.eCommerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepo extends JpaRepository<Product,Integer> {
}
