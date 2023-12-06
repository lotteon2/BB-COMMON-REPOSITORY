package bloomingblooms.domain.notification;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class NotificationData<T> {
  private T whoToNotify;
  private String message;

  public static <T> NotificationData<T> notifyData(T data, String message) {
    return NotificationData.<T>builder().whoToNotify(data).message(message).build();
  }
}
