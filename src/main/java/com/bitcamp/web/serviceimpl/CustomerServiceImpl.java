package com.bitcamp.web.serviceimpl;

import java.util.List;

import com.bitcamp.web.common.util.PageProxy;
import com.bitcamp.web.domain.CustomerDTO;
import com.bitcamp.web.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * CustomerServiceImpl
 */
@Service 
public class CustomerServiceImpl implements CustomerService {
   

    @Override
    public void addCustomer(CustomerDTO customer) {
        

    }

    @Override
    public List<CustomerDTO> findCustomers(PageProxy pxy) {

        return null;
    }

    @Override
    public List<CustomerDTO> findCustomersByOption(CustomerDTO option) {
        return null;
    }

    @Override
    public CustomerDTO findCustomerByCustomerId(String customerId) {
        return null;
    }

    // @Override
    // public void updateCustomer(CustomerDTO customer) {
    //     customerMapper.updateCustomer(customer);
    // }
    @Override
    public int updateCustomer(CustomerDTO customer) {
      
        return 0;
    }

    @Override
    public void deleteCustomer(CustomerDTO customer) {
      
    }

    @Override
    public int countAll() {
        return 0;
    }

    @Override
    public CustomerDTO login(CustomerDTO customer) {      

        return null; 
    }    
}