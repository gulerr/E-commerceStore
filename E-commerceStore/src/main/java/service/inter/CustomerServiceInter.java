package service.inter;

import dto.request.CreateCustomerRequest;
import dto.request.UpdateCustomerRequest;
import dto.response.CustomerResponse;
import org.springframework.stereotype.Service;

        @Service
        public interface CustomerServiceInter {
        void createCustomer (CreateCustomerRequest createCustomerRequest);
        CustomerResponse getAllCustomer ();
        void updateCustomer (Long id, UpdateCustomerRequest updateCustomerRequest);
        void deleteCustomer(Long id);
}
