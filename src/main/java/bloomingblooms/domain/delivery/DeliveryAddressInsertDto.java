package bloomingblooms.domain.delivery;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DeliveryAddressInsertDto {
  private Long deliveryAddressId;
  private Long userId;
  private String recipientName;
  private String zipcode;
  private String roadName;
  private String addressDetail;
  private String phoneNumber;
}
