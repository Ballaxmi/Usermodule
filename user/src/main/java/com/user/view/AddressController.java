package com.user.view;





import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.model.Address;
import com.user.service.AddressService;
@RestController
public class  AddressController{
@Autowired
AddressService AddressService;

 @RequestMapping({ "/", "/address" })
public List<Address> getAddressData() {
return AddressService.getAddressData();
}
}