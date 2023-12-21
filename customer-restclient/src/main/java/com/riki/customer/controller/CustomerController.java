package com.riki.customer.controller;

import com.riki.customer.dto.CustomerDto;
import com.riki.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @GetMapping("/")
    public String findAllCustomers(Model model) {
        List<CustomerDto> customers = customerService.findAllCustomers();
        model.addAttribute("customers", customers);
        return "customer/customer-list";
    }
}
