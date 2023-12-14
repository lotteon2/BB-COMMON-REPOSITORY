package bloomingblooms.domain.notification.delivery;

import lombok.Getter;

@Getter
public enum DeliveryStatus {
  PENDING("주문접수", 1),
  PROCESSING("배송시작", 2),
  COMPLETED("배송완료", 3),
  CANCELED("배송 취소", 4);

  private final String message;
  private final int order;

  DeliveryStatus(String message, int order) {
    this.message = message;
    this.order = order;
  }

  public static DeliveryStatus fromString(String status) {
    for (DeliveryStatus ds : values()) {
      if (ds.name().equalsIgnoreCase(status)) {
        return ds;
      }
    }
    throw new IllegalArgumentException("유효하지 않은 상태값 입니다: " + status);
  }
}
