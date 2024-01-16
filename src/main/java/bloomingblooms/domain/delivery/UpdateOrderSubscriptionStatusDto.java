package bloomingblooms.domain.delivery;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UpdateOrderSubscriptionStatusDto {
    private List<Long> deliveryIds;
}
