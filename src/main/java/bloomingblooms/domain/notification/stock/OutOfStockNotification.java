package bloomingblooms.domain.notification.stock;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class OutOfStockNotification {
    private Long storeId;
}
