package bloomingblooms.domain.order;

import bloomingblooms.domain.notification.order.OrderType;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ValidatePolicyDto {
    private List<ValidatePriceDto> validatePriceDtos;
    private OrderType orderType;
}
