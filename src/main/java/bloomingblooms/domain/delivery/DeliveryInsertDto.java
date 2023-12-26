package bloomingblooms.domain.delivery;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DeliveryInsertDto {
  private String ordererName;
  private String ordererPhoneNumber;
  private String ordererEmail;
  private String recipientName;
  private String recipientPhoneNumber;
  private String zipcode;
  private String roadName;
  private String addressDetail;
  private String request;
  private Long deliveryCost;
}
