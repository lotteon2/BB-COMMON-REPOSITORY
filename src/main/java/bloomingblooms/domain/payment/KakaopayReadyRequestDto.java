package bloomingblooms.domain.payment;

import bloomingblooms.domain.order.OrderInfoByStore;
import bloomingblooms.domain.order.ProductCreate;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class KakaopayReadyRequestDto {
  private String userId;
  private String orderId;
  private String orderType;
  private String itemName;
  private int quantity;
  private int totalAmount;
  private int taxFreeAMount;
  private boolean isSubscriptionPay;

  public static KakaopayReadyRequestDto toDto(
      Long userId,
      String tempOrderId,
      String orderType,
      List<OrderInfoByStore> orderInfoByStores,
      Long actualAmount,
      Boolean isSubscriptionPay) {
    String itemName = getItemName(orderInfoByStores);
    Long quantity = getQuantity(orderInfoByStores);

    return KakaopayReadyRequestDto.builder()
        .userId(String.valueOf(userId))
        .orderId(tempOrderId)
        .orderType(orderType)
        .itemName(itemName)
        .quantity(Math.toIntExact(quantity))
        .totalAmount(Math.toIntExact(actualAmount))
        .taxFreeAMount(0)
        .isSubscriptionPay(isSubscriptionPay)
        .build();
  }

  static String getItemName(List<OrderInfoByStore> orderInfoByStores) {
    int orderCnt = orderInfoByStores.size();
    if (orderCnt > 1) {
      return orderInfoByStores.get(0).getProducts().get(0).getProductName()
          + " 외 "
          + (orderCnt - 1)
          + "개";
    } else return orderInfoByStores.get(0).getProducts().get(0).getProductName();
  }

  static Long getQuantity(List<OrderInfoByStore> orderInfoByStores) {
    return orderInfoByStores.stream()
        .mapToLong(
            orderInfoByStore ->
                orderInfoByStore.getProducts().stream().mapToLong(ProductCreate::getQuantity).sum())
        .sum();
  }
}
