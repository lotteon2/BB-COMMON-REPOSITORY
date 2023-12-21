package bloomingblooms.domain.product;

import kr.bb.product.domain.product.entity.Product;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ProductThumbnail {
  private String productThumbnail;

  public static ProductThumbnail getData(Product byProductId) {
    return ProductThumbnail.builder().productThumbnail(byProductId.getProductThumbnail()).build();
  }
}
