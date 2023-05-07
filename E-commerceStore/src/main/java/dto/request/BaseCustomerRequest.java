package dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseCustomerRequest {
String customername;
String customersurname;
int customerage;
String customeremail;
String customeraddress;

}
