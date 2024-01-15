package bloomingblooms.domain.delivery;

import bloomingblooms.domain.notification.delivery.DeliveryStatus;
import bloomingblooms.domain.notification.order.OrderType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UpdateOrderStatusDto {
  private String orderId;  // orderDeliveryId, orderSubscriptionId
  private OrderType orderType;
  private String phoneNumber;
  private DeliveryStatus deliveryStatus;
}
