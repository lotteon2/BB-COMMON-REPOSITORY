package bloomingblooms.domain.wishlist.cart;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class ProductInfoDto {
	private String productId;
	private String productName;
	private Long quantity;
	private String productThumbnailImage;
	private Long price;

}
