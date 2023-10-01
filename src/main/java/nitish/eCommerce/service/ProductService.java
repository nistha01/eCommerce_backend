package nitish.eCommerce.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import nitish.eCommerce.model.Product;
import nitish.eCommerce.repo.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Service
public class ProductService {
    @Autowired
    IProductRepo iProductRepo;

    public String addProduct(Product product) {
        iProductRepo.save(product);
        return "product added";
    }

    public List<Product> getAllProduct() {
        return iProductRepo.findAll();
    }

    public String deleteProductById(Integer id) {
        Product pr=iProductRepo.findById(id).orElse(null);
        if(pr!=null){
        iProductRepo.deleteById(id);
        return "product deleted";
        }
        return "invalid Id";


    }
}
