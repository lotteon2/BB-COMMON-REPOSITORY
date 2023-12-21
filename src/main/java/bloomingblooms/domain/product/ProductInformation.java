package bloomingblooms.domain.product;

import java.util.List;
import java.util.stream.Collectors;
import kr.bb.product.domain.product.entity.Product;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ProductInformation {
  private String productId;
  private String productName;
  private String productThumbnail;

  public static List<ProductInformation> getData(List<Product> productByProductIds) {
    return productByProductIds.stream()
        .map(
            item ->
                ProductInformation.builder()
                    .productId(item.getProductId())
                    .productName(item.getProductName())
                    .productThumbnail(item.getProductThumbnail())
                    .build())
        .collect(Collectors.toList());
  }
}
