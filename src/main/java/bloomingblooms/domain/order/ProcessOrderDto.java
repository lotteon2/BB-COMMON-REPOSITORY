package bloomingblooms.domain.order;

import java.util.List;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProcessOrderDto {
  private String orderId;
  private String orderType;
  private List<Long> couponIds;
  private Map<String, Long> products; // productId: quantity
  private Long userId;
  private String phoneNumber;
}
