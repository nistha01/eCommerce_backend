package nitish.eCommerce.controller;

import jakarta.persistence.criteria.Order;
import nitish.eCommerce.model.Orders;
import nitish.eCommerce.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;
    @PostMapping("orders")
    public String addOrder(@RequestBody Orders orders){
        return orderService.addOrder(orders);
    }
    @GetMapping("orders")
    public List<Orders> getAllOrders(){
        return orderService.getAllOrder();
    }
    @GetMapping("orders/id/{id}")
    public Orders getOrderByOrderId(@PathVariable Integer id){
        return orderService.getOrderByid(id);
    }
}
