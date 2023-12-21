package bloomingblooms.domain.notification.question;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class InqueryResponseNotification {
    private Long userId;
    private String phoneNumber;
}
