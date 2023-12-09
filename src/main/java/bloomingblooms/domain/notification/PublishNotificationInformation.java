package bloomingblooms.domain.notification;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class PublishNotificationInformation {
  private NotificationKind notificationKind;
  private String message;
  private String notificationUrl;
}
