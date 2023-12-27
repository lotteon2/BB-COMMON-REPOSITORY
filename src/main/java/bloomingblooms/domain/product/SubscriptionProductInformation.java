package bloomingblooms.domain.product;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class SubscriptionProductInformation {
  private String productThumbnail;
  private String productName;
  private Long unitPrice;
  private Long storeId;

}
