package bloomingblooms.domain.notification;

import lombok.Getter;

@Getter
public enum NotificationURL {
  QUESTION("/manage"),
  INQUERY("/mypage"),
  RESALE("products/detail/"),
  ORDER_DELIVERY("/order"),
  ORDER_SCHEDULE("/schedule"),
  ORDER_CANCEL_DELIVERY("/order"),

  ORDER_CANCEL_SCHEDULE("/schedule"),
  NEWCOMER("/"),
  SETTLEMENT("/settlement"),
  DELIVERY("/mypage"),

  OUT_OF_STOCK(""),
  INVALID_COUPON(""),
  ORDER_FAIL(""),
  ORDER_SUCCESS("/mypage"),

  LOW_STOCK("/stock");
  private final String url;

  NotificationURL(String url) {
    this.url = url;
  }
}
