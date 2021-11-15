package com.user.service.impl;


	import java.util.List;

    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Service;

    import com.user.model.Address;
    import com.user.repo.AddressRepository;
    import com.user.service.AddressService;
    @Service
    public class AddressServiceImpl implements AddressService {
    @Autowired
    AddressRepository addressrepo;

     @Override
    public List<Address> getAddressData() {
    return addressrepo.findAll();

     }

    }