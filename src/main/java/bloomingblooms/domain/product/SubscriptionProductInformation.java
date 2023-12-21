package bloomingblooms.domain.product;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class SubscriptionProductInformation {
  private String productThumbnail;
  private String productName;
  private Long unitPrice;
  private Long storeId;

}
