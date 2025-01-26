//package com.dbms.datakart.mapper;
//
//import com.dbms.datakart.dto.CustomerDTO;
//import com.dbms.datakart.entity.Customer;
//import com.dbms.datakart.entity.Order;
//
//import java.util.stream.Collectors;
//
//public class CustomerMapper {
//
//
//    public static Customer mapToCustomer(CustomerDTO customerDTO) {
//        Customer customer = new Customer(
//                customerDTO.getCustomerId(),
//                customerDTO.getCustomerName(),
//                customerDTO.getCustomerEmail(),
//                customerDTO.getCustomerPhone(),
//                customerDTO.getCustomerAddress(),
//                null
//
//        );
//        return customer;
//    }
//
//    public static CustomerDTO mapToCustomerDTO(Customer customer) {
//        CustomerDTO customerDTO = new CustomerDTO();
//        customerDTO.setCustomerId(customer.getCustomerId());
//        customerDTO.setCustomerName(customer.getCustomerName());
//        customerDTO.setCustomerEmail(customer.getCustomerEmail());
//        customerDTO.setCustomerPhone(customer.getCustomerPhone());
//        customerDTO.setCustomerAddress(customer.getCustomerAddress());
//        customerDTO.setOrderId(java.util.Optional.of(customer.getOrders().stream()
//                .map(Order::getOrderId)
//                .collect(Collectors.toList())));
//        return customerDTO;
//    }
//}
