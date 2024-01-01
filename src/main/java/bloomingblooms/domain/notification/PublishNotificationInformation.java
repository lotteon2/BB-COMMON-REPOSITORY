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
  private String content;
  private Role role;

  /**
   * create PublishNotificationInformation with url, kind, role
   *
   * @param notificationURL redirect url
   * @param notificationKind notification kind
   * @param role notification receiver Role
   * @return PublishNotificationInformation
   */
  public static PublishNotificationInformation makePublishNotificationInformation(
      NotificationURL notificationURL, NotificationKind notificationKind, Role role) {
    return PublishNotificationInformation.builder()
        .notificationUrl(notificationURL.getUrl())
        .notificationKind(notificationKind)
        .role(role)
        .build();
  }

  /**
   * create PublishNotificationInformation with url, kind, role, content
   *
   * @param notificationURL notification url
   * @param notificationKind notification kind
   * @param role notification receiver Role
   * @param content notification content
   * @return PublishNotificationInformation
   */
  public static PublishNotificationInformation makePublishNotificationInformation(
      NotificationURL notificationURL,
      NotificationKind notificationKind,
      Role role,
      String content) {
    return PublishNotificationInformation.builder()
        .notificationUrl(notificationURL.getUrl())
        .notificationKind(notificationKind)
        .role(role)
        .content(content)
        .build();
  }

  /**
   * update PublishNotificationInformation with role
   *
   * @param publishData PublishNotificationInformation
   * @param role notification receiver Role
   * @return PublishNotificationInformation
   */
  public static PublishNotificationInformation updateRole(
      PublishNotificationInformation publishData, Role role) {
    return PublishNotificationInformation.builder()
        .notificationKind(publishData.getNotificationKind())
        .notificationUrl(publishData.notificationUrl)
        .content(publishData.getContent())
        .role(role)
        .build();
  }

  /**
   * create PublishNotificationInformation with url, kind, content
   *
   * @param url notification url
   * @param kind notification kind
   * @param content notification content
   * @return
   */
  public static PublishNotificationInformation getData(
      NotificationURL url, NotificationKind kind, String content) {
    return PublishNotificationInformation.builder()
        .notificationKind(kind)
        .notificationUrl(url.getUrl())
        .content(content)
        .build();
  }

  /**
   * create PublishNotificationInformation with url, kind
   *
   * @param url notification url
   * @param kind notification kind
   * @return PublishNotificationInformation
   */
  public static PublishNotificationInformation getData(NotificationURL url, NotificationKind kind) {
    return PublishNotificationInformation.builder()
        .notificationKind(kind)
        .notificationUrl(url.getUrl())
        .build();
  }
}
