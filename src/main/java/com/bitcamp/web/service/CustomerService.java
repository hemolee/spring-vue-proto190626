package com.bitcamp.web.service;

import java.util.List;

import com.bitcamp.web.common.util.PageProxy;
import com.bitcamp.web.domain.CustomerDTO;

import org.springframework.stereotype.Component;

/**
 * CustomerService
 * 
 * 
 */
@Component  //@component 있어야 값이 안없어지고 저장할 수 있음...
public interface CustomerService {
    public void addCustomer(CustomerDTO customer);
    public List<CustomerDTO> findCustomers(PageProxy pxy);
    public List<CustomerDTO> findCustomersByOption(CustomerDTO option);
    public CustomerDTO findCustomerByCustomerId(String customerId);
    //public void updateCustomer(CustomerDTO customer);
    public int updateCustomer(CustomerDTO customer);
    public void deleteCustomer(CustomerDTO customer);
	public int countAll();
    public CustomerDTO login(CustomerDTO customer);    
}