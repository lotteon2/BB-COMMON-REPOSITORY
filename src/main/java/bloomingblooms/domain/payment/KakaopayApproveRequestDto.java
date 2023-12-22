package bloomingblooms.domain.payment;

import bloomingblooms.domain.order.OrderInfo;
import lombok.AccessLevel;
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

  public static KakaopayApproveRequestDto toDto(OrderInfo orderInfo, String orderType) {
    return KakaopayApproveRequestDto.builder()
        .userId(orderInfo.getUserId())
        .orderId(orderInfo.getTempOrderId())
        .orderType(orderType)
        .itemName(orderInfo.getItemName())
        .quantity(Math.toIntExact(orderInfo.getSumOfAllQuantity()))
        .totalAmount(Math.toIntExact(orderInfo.getSumOfActualAmount()))
        .taxFreeAMount(0)
        .isSubscriptionPay(orderInfo.isSubscriptionPay())
        .tid(orderInfo.getTid())
        .pgToken(orderInfo.getPgToken())
        .build();
  }
}
