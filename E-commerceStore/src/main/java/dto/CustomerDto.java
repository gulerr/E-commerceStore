package dto;

import entity.Customer;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CustomerDto {
String customername;
String customersurname;
int customerage;
String customeremail;
String customeraddress;

}
