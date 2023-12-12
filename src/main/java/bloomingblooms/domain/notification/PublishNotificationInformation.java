package bloomingblooms.domain.notification;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class PublishNotificationInformation {
  private NotificationKind notificationKind;
  private String notificationUrl;
  private Role role;

  public void setRole(Role role) {
    this.role = role;
  }
}
