package dto.response;

import dto.OrderProductDto;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class OrderProductResponse {
public List<OrderProductDto> orderProductDtoList;
}
