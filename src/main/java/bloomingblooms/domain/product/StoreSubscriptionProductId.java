package bloomingblooms.domain.product;

import kr.bb.product.domain.product.entity.Product;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class StoreSubscriptionProductId {
  private String subscriptionProductId;

  public static StoreSubscriptionProductId getData(Product subscriptionProductByStoreId) {
    return StoreSubscriptionProductId.builder()
        .subscriptionProductId(subscriptionProductByStoreId.getProductId())
        .build();
  }
}
