package bloomingblooms.domain.notification;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NotificationData<T> {
  @JsonProperty private T whoToNotify;
  private PublishNotificationInformation publishInformation;

  /**
   * notification publisher
   *
   * @param data 알림 받을 대상
   * @param publishInformation notification information
   * @return NotificationData
   * @param <T> Object or List<Object>
   */
  public static <T> NotificationData<T> notifyData(
      T data, PublishNotificationInformation publishInformation) {
    return NotificationData.<T>builder()
        .whoToNotify(data)
        .publishInformation(publishInformation)
        .build();
  }

  /**
   * notification data Void
   *
   * @param publishInformation notification information
   * @return NotificationData
   * @param <T> Void
   */
  public static <T> NotificationData<T> notifyData(
      PublishNotificationInformation publishInformation) {
    return NotificationData.<T>builder().publishInformation(publishInformation).build();
  }
}
