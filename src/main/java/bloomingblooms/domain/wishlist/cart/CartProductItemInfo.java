package bloomingblooms.domain.wishlist.cart;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public class CartProductItemInfo {

  private Long storeId;
  private String storeName;
  private int deliveryCost;
  private int freeDeliveryMinCost;
  private List<ProductInfoDto> productInfoList;

}

