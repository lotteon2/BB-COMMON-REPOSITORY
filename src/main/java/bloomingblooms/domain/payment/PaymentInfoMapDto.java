package bloomingblooms.domain.payment;

import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaymentInfoMapDto {
    Map<String, PaymentInfoDto> paymentInfoDtoMap;
}
