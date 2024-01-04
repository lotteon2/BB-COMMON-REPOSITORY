package bloomingblooms.domain.order;

import lombok.Getter;

@Getter
public enum OrderMethod {
  CART("카트"),
  DIRECT("바로 구매");

  private final String orderMethod;

  OrderMethod(String orderMethod) {
    this.orderMethod = orderMethod;
  }
}
