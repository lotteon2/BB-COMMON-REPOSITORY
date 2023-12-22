package bloomingblooms.domain.wishlist.cart;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class CartProductItemInfo {

  private Long storeId;
  private String storeName;
  private int deliveryMinCost;
  private List<ProductInfoDto> productInfoList;

}

