package bloomingblooms.domain.notification;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class QuestionRegisterNotification {
  private Long userId;
  private Role role;
}
