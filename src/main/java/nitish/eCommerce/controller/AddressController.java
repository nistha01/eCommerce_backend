package nitish.eCommerce.controller;

import nitish.eCommerce.model.Address;
import nitish.eCommerce.repo.IAddressRepo;
import nitish.eCommerce.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;
    @PostMapping("address")
    public String addAddress(@RequestBody Address address){
        return addressService.addAddress(address);
    }
}
