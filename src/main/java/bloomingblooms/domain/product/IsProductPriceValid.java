package bloomingblooms.domain.product;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class IsProductPriceValid {
  private String productId;
  private Long price;
}
