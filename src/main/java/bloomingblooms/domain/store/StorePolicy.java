package bloomingblooms.domain.store;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class StorePolicy {
  @Builder.Default private String storeName = "가게명";
  @Builder.Default private Long deliveryCost = 0L;
  @Builder.Default private Long freeDeliveryMinCost = 0L;
}
