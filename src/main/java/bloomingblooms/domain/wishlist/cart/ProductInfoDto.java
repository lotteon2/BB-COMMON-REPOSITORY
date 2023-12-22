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
	private Long productId;
	private String productName;
	private Integer quantity;
	private String productThumbnailImage;
	private Long price;

}
