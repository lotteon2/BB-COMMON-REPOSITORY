package bloomingblooms.domain.notification.order;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class SettlementNotification {
  // TODO: 정산 알림 가게 id를 어떻게 받을지 정의 필요
  private Long storeId;
}
