package bloomingblooms.domain.wishlist.likes;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class LikedStoreInfoResponse {

  private Long storeId;
  private String storeName;
  private String storeThumbnail;
  private String detailInfo;
  private Float averageRating;
}
