package bloomingblooms.domain.notification.newcomer;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class NewcomerNotification {
  private Long userId;
}
