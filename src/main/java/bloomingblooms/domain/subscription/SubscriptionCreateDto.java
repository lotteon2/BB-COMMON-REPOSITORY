package bloomingblooms.domain.subscription;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SubscriptionCreateDto {
    private String subscriptionId;
    private Long userId;
    private Long storeId;
    private String productId;
    private Integer quantity;
    private String ordererName;
    private String ordererPhoneNumber;
    private String ordererEmail;
    private String recipientName;
    private String recipientPhoneNumber;
    private String storeName;
    private String zipcode;
    private String roadName;
    private String addressDetail;
    private LocalDateTime paymentDateTime;
    private LocalDate nextDeliveryDate;
    private LocalDate nextPaymentDate;
    private Long totalOrderPrice;
    private Long totalDiscountPrice;
    private Long deliveryPrice;
    private Long actualPrice;
    private String reviewStatus;
    private String deliveryRequest;
    private String productThumbnail;
    private String productName;
    private Long unitPrice;

}
