package bloomingblooms.domain.batch;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SubscriptionBatchDtoList {
    List<SubscriptionBatchDto> subscriptionBatchDtoList;
}
