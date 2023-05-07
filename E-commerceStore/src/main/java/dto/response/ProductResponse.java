package dto.response;

import dto.ProductDto;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class ProductResponse {
public List<ProductDto> productDtoList;
}
