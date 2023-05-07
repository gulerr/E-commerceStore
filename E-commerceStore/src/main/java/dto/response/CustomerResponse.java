package dto.response;

import dto.CustomerDto;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class CustomerResponse {
public List<CustomerDto> customerDtoList;
}
