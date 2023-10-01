package nitish.eCommerce.controller;

import nitish.eCommerce.model.Product;
import nitish.eCommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;
    @PostMapping("product")
    public String addProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }
    @GetMapping("products")
    public List<Product> getAllProducts(){
        return productService.getAllProduct();
    }
    public String deleteProductById(Integer id){
        return productService.deleteProductById(id);
    }
}
