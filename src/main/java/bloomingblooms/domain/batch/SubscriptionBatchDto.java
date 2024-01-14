package bloomingblooms.domain.batch;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SubscriptionBatchDto {
  private String orderSubscriptionId;
  private Long userId;
}
