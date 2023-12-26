package bloomingblooms.domain.product;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class IsProductPriceValid {
  private String productId;
  private Long price;

  public static IsProductPriceValid toDto(String productId, Long price) {
    return IsProductPriceValid.builder().productId(productId).price(price).build();
  }
}
