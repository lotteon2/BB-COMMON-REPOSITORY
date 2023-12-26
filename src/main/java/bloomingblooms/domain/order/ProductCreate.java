package bloomingblooms.domain.order;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ProductCreate {
  private String productId;
  private String productName;
  private Long quantity;
  private Long price;
  private String productThumbnailImage;

  @JsonIgnore
  public long getSumOfEachProduct() {
    return this.price * this.quantity;
  }
}
