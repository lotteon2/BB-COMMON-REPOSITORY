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
public class IsProductPriceValid {
  private String productId;
  private Long price;

  public static IsProductPriceValid toDto(String productId, Long price) {
    return IsProductPriceValid.builder().productId(productId).price(price).build();
  }
}
