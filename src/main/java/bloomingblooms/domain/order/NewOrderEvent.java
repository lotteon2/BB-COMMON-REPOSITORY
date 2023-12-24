package bloomingblooms.domain.order;

import bloomingblooms.domain.notification.order.OrderType;
import java.util.List;
import java.util.stream.Collectors;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class NewOrderEvent {
  private List<NewOrderEventItem> orders;

  public static List<ProductCount> getProductDataForUpdateSaleCount(NewOrderEvent newOrderEvent) {
    return newOrderEvent.getOrders().stream()
        .flatMap(item -> item.getProducts().stream())
        .map(
            productCount ->
                ProductCount.builder()
                    .productId(productCount.getProductId())
                    .quantity(productCount.getQuantity())
                    .build())
        .collect(Collectors.toList());
  }

  @Getter
  @Builder
  @NoArgsConstructor(access = AccessLevel.PROTECTED)
  @AllArgsConstructor
  public static class NewOrderEventItem {
    private Long orderId;
    private String productName;
    private Long storeId;
    private OrderType orderType;
    private List<NewOrderEvent.ProductCount> products;
  }

  @Getter
  @Builder
  @NoArgsConstructor(access = AccessLevel.PROTECTED)
  @AllArgsConstructor
  public static class ProductCount {
    private String productId;
    private Long quantity;
  }
}
