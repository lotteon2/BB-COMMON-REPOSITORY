package bloomingblooms.domain.payment;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class KakaopayApproveRequestDto {
  private Long userId;
  private String orderId;
  private String orderType;
  private String itemName;
  private int quantity;
  private int totalAmount;
  private int taxFreeAMount;
  private boolean isSubscriptionPay;
  private String cid;
  private String tid;
  private String pgToken;
  private Long deliveryId;  // nullable
}
