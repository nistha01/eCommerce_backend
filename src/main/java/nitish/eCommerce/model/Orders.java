package nitish.eCommerce.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Orders {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer quantity;


    @OneToMany
    @JoinColumn(name="fk_order")
    private List<Product> product;
    @ManyToOne
    @JoinColumn(name="fk_order")
    private User user;



    @ManyToMany
    @JoinTable(name = "add_address_m_m", joinColumns = @JoinColumn(name = "fk_add") , inverseJoinColumns = @JoinColumn(name = "fk_orders"))
    private List<Address> address;


}
