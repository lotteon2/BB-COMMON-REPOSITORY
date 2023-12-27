package bloomingblooms.domain.notification.delivery;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class DeliveryNotification {
  private Long userId;
  private String phoneNumber;
  private DeliveryStatus deliveryStatus;
}
