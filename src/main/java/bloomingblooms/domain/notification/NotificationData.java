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

  public static <T> NotificationData<T> notifyData(
      T data, PublishNotificationInformation publishInformation) {
    return NotificationData.<T>builder()
        .whoToNotify(data)
        .publishInformation(publishInformation)
        .build();
  }
}
