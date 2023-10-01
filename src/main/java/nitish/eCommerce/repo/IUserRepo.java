package nitish.eCommerce.repo;

import nitish.eCommerce.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepo extends JpaRepository<User,Integer> {

}
