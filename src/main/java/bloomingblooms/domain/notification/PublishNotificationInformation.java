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

  public static PublishNotificationInformation updateRole(
      PublishNotificationInformation publishData, Role role) {
    return PublishNotificationInformation.builder()
        .notificationKind(publishData.getNotificationKind())
        .notificationUrl(publishData.notificationUrl)
        .role(role)
        .build();
  }
}
