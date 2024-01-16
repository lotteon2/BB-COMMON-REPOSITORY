package bloomingblooms.domain.pickup;

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
public class PickupCreateDto {
    private String pickupReservationId;
    private Long userId;
    private Long storeId;
    private String productId;
    private String ordererName;
    private String ordererPhoneNumber;
    private String ordererEmail;
    private Integer quantity;
    private LocalDate pickupDate;
    private String pickupTime;
    private Long totalOrderPrice;
    private Long totalDiscountPrice;
    private Long actualPrice;
    private LocalDateTime paymentDateTime;
    private String reservationStatus;
    private String reviewStatus;
    private String cardStatus;
    private String productThumbnail;
    private String productName;
    private Long unitPrice;
    private Long orderProductId;

}
