package bloomingblooms.domain.wishlist.cart;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@Getter
@NoArgsConstructor
public class GetUserCartItemsResponse {
  List<CartProductItemInfo> cartProductItemInfoList;

}
