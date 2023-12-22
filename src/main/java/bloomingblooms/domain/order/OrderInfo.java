package bloomingblooms.domain.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderInfo {
  private String tempOrderId;
  private Long userId;
  private String itemName;
  private Long sumOfAllQuantity;
  private List<OrderInfoByStore> orderInfoByStores;
  private Long sumOfActualAmount;

  @JsonProperty(value = "subscriptionPay")
  private boolean isSubscriptionPay;

  private String ordererName;
  private String ordererPhoneNumber;
  private String ordererEmail;
  private String recipientName;
  private String deliveryZipcode;
  private String deliveryRoadName;
  private String deliveryAddressDetail;
  private String recipientPhone;
  private String deliveryRequest;
  private String tid;
  private String pgToken;
  private String orderType;
}
