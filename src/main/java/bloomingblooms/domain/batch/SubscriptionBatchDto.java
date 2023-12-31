package bloomingblooms.domain.batch;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SubscriptionBatchDto {
  private String cid;
  private String sid;
  private String partnerOrderId;
  private String partnerUserId;
  private Long quantity;
  private Long totalAmount;
}
