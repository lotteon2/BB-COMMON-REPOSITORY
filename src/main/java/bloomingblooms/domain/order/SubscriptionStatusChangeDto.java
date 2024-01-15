package bloomingblooms.domain.order;

import bloomingblooms.domain.card.CardStatus;
import bloomingblooms.domain.review.ReviewStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SubscriptionStatusChangeDto {
    private String orderId;
    private String subscriptionStatus;
    private ReviewStatus reviewStatus;
}
