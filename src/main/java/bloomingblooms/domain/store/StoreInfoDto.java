package bloomingblooms.domain.store;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StoreInfoDto {
    private Long storeId;
    private String storeCode;
    private String storeName;
    private String detailInfo;
    private String storeThumbnailInfo;
    private Double averageRating;
    private String phoneNumber;
    private String accountNumber;
    private String bank;
}
