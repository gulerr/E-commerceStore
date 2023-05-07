package service;


import dto.CustomerDto;
import dto.request.CreateCustomerRequest;
import dto.request.UpdateCustomerRequest;
import dto.response.CustomerResponse;
import entity.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import repository.CustomerRepository;
import service.inter.CustomerServiceInter;
import util.CustomerDtoConverter;

import java.util.List;
import java.util.stream.Collectors;


   @Service
   @RequiredArgsConstructor
   public class CustomerService implements CustomerServiceInter {
       private final CustomerRepository customerRepository;
       private final CustomerDtoConverter customerDtoConverter;
        @Override
        public void createCustomer(CreateCustomerRequest createCustomerRequest) {
        Customer createCustomer= Customer.builder()
                   .customername(createCustomerRequest.getCustomername())
                   .customersurname(createCustomerRequest.getCustomersurname())
                   .customerage(createCustomerRequest.getCustomerage())
                   .customeraddress(createCustomerRequest.getCustomeraddress())
                   .customeremail(createCustomerRequest.getCustomeremail())
                    .build();
        customerRepository.save(createCustomer);
        }

        @Override
        public CustomerResponse getAllCustomer() {
            List<CustomerDto> customerDtoList=customerRepository.findAll()
                    .stream()
                    .map(customerDtoConverter::converter)
                    .collect(Collectors.toList());
            return CustomerResponse.builder()
                    .customerDtoList(customerDtoList)
                    .build();
        }

        @Override
        public void updateCustomer(Long id, UpdateCustomerRequest updateCustomerRequest) {
           Customer updateCustomer=customerRepository.findById((long)id);
            updateCustomer.setCustomername(updateCustomerRequest.getCustomername());
            updateCustomer.setCustomersurname(updateCustomerRequest.getCustomersurname());
            updateCustomer.setCustomerage(updateCustomerRequest.getCustomerage());
            updateCustomer.setCustomeraddress(updateCustomerRequest.getCustomeraddress());
            updateCustomer.setCustomeremail(updateCustomerRequest.getCustomeremail());
            customerRepository.save(updateCustomer);
        }

         @Override
         public void deleteCustomer(Long id) {
           Customer deleteCustomer= customerRepository.findById((long)id);
           customerRepository.delete(deleteCustomer);
         }
}
