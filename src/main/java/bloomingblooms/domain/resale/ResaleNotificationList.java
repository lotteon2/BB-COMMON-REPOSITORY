package bloomingblooms.domain.resale;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import java.util.List;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class ResaleNotificationList {
  private List<ResaleNotificationData> resaleNotificationData;
  private String message;
}
