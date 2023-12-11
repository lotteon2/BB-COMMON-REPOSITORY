package bloomingblooms.domain.notification.neworder;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class NewOrderNotification {
  private String productName;
  private Long storeId;
  private OrderType orderType;
}

