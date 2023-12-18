package bloomingblooms.domain.subscription;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SubscriptionDateDto {
    private String subscriptionId;
    private LocalDate nextDeliveryDate;
    private LocalDate nextPaymentDate;
}

