package bloomingblooms.domain.order;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ValidatePriceDto {
  private Long couponId;
  private Long couponAmount;
  private Long storeId;
  private Long deliveryCost;
  private Long actualAmount;
}
