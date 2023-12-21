package bloomingblooms.domain.notification.order;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class SettlementNotification {
  // TODO: 정산 알림 가게 id를 어떻게 받을지 정의 필요
  private Long storeId;
}
