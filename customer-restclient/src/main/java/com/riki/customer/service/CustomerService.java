package com.riki.customer.service;

import com.riki.customer.dto.CustomerDto;

import java.util.List;

public interface CustomerService {

    List<CustomerDto> findAllCustomers();
}
