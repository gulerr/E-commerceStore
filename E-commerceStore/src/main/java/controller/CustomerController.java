package controller;


import dto.request.CreateCustomerRequest;
import dto.request.UpdateCustomerRequest;
import dto.response.CustomerResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import service.inter.CustomerServiceInter;


@RestController
@RequestMapping(value="example", method= RequestMethod.POST)
@RequiredArgsConstructor
public class CustomerController {
private final CustomerServiceInter customerServiceInter;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.ACCEPTED)
    private void create(@RequestBody CreateCustomerRequest createCustomerRequest){
    customerServiceInter.createCustomer(createCustomerRequest);
    }

    @GetMapping("/read")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public CustomerResponse readAllcustomers(){
    return customerServiceInter.getAllCustomer();
    }

    @PatchMapping("/update/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void update(@PathVariable Long id, @RequestBody UpdateCustomerRequest updateCustomerRequest){
    customerServiceInter.updateCustomer(id, updateCustomerRequest);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void delete(@PathVariable Long id){
        customerServiceInter.deleteCustomer(id);
    }
    }
