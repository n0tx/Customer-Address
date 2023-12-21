package com.riki.customer.service.impl;

import com.riki.customer.dto.CustomerDto;
import com.riki.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Value("${api.url}")
    private String apiUrl;

    @Autowired
    RestTemplate restTemplate;

    @Override
    public List<CustomerDto> findAllCustomers() {
        return Arrays.stream(Objects.requireNonNull(restTemplate.getForObject(apiUrl + "/customer/list", CustomerDto[].class))).collect(Collectors.toList());
    }
}
