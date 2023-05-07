package util;

import dto.CustomerDto;
import entity.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerDtoConverter {
  public CustomerDto converter(Customer customer) {
    CustomerDto customerDto = CustomerDto.builder()
            .customername(customer.getCustomername())
            .customersurname(customer.getCustomersurname())
            .customerage(customer.getCustomerage())
            .customeremail(customer.getCustomeremail())
            .customeraddress(customer.getCustomeraddress())
            .build();
             return customerDto;

  }
}
