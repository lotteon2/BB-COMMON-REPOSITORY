package bloomingblooms.domain.delivery;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DeliveryInfoDto {
  private String ordererName;
  private String ordererPhone;
  private String ordererEmail;
  private String recipientName;
  private String recipientPhone;
  private String zipcode;
  private String roadName;
  private String addressDetail;
  private String deliveryRequest;
  private Long deliveryCost;
}
