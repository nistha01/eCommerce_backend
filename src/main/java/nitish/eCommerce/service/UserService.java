package nitish.eCommerce.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import nitish.eCommerce.model.User;
import nitish.eCommerce.repo.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Service
public class UserService {
    @Autowired
    IUserRepo iUserRepo;

    public String addUser(User user) {
        iUserRepo.save(user);
        return "user added";
    }

    public User getUserById(Integer id) {
       return iUserRepo.findById(id).orElse(null);
    }
}
