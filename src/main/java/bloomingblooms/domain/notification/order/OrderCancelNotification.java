package bloomingblooms.domain.notification.order;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class OrderCancelNotification {
    private Long storeId;
}
