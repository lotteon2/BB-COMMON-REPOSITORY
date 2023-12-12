package bloomingblooms.domain.notification.delivery;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class DeliveryNotification {
  private Long userId;
  private String phoneNumber;
}
