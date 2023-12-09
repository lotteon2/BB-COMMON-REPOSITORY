package bloomingblooms.domain.notification;

import lombok.Getter;

@Getter
public enum NotificationKind {
  Delivery("배송 알림"),
  RESTORE("재입고 알림"),
  QUESTION("문의 답변 알림"),
  NEW_ORDER("신규 주문 알림"),
  SETTLEMENT("정산 알림"),
  LOW_STOCK("재고 부족 알림");
  private final String kind;

  NotificationKind(String kind) {
    this.kind = kind;
  }
}
