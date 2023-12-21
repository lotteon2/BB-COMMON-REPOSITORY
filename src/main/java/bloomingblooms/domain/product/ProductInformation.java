package bloomingblooms.domain.product;

import java.util.List;
import java.util.stream.Collectors;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ProductInformation {
  private String productId;
  private String productName;
  private String productThumbnail;
}
