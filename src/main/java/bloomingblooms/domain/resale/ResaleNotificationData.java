package bloomingblooms.domain.resale;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class ResaleNotificationData {
  private Long userId;
  private String phoneNumber;
  private String userName;
}
