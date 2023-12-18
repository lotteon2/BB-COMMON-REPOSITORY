package bloomingblooms.domain.product;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductInfoDto {
    private String productThumbnail;
    private String productName;
    private Long unitPrice;
    private Long storeId;
}
