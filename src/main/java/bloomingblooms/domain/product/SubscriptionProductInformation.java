package bloomingblooms.domain.product;

import kr.bb.product.domain.product.entity.Product;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class SubscriptionProductInformation {
  private String productThumbnail;
  private String productName;
  private Long unitPrice;
  private Long storeId;

  public static SubscriptionProductInformation getData(Product product) {
    return SubscriptionProductInformation.builder()
        .productName(product.getProductName())
        .productThumbnail(product.getProductThumbnail())
        .unitPrice(product.getProductPrice())
        .storeId(product.getStoreId())
        .build();
  }
}
