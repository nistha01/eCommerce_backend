package nitish.eCommerce.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import nitish.eCommerce.model.Orders;
import nitish.eCommerce.repo.IOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Service
public class OrderService {
    @Autowired
    IOrderRepo iOrderRepo;

    public String addOrder(Orders orders) {
        iOrderRepo.save(orders);
        return "Order on the way";
    }

    public List<Orders> getAllOrder() {
        return iOrderRepo.findAll();
    }

    public Orders getOrderByid(Integer id) {
       return iOrderRepo.findById(id).orElse(null);
    }
}
