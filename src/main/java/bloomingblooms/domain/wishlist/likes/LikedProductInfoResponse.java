package bloomingblooms.domain.wishlist.likes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class LikedProductInfoResponse {
  private String productId;
  private String productName;
  private String productSummary;
  private String productThumbnail;
  private Long productPrice;
  private Float averageRating;

}
