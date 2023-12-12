package bloomingblooms.domain.notification;

import lombok.Getter;

@Getter
public enum NotificationKind {
  Delivery("배송이 시작되었습니다."),
  RESTORE("상품이 재입고 되었습니다."),
  QUESTION("문의에 답변이 등록되었습니다."),
  NEW_ORDER("신규 주문이 생성되었습니다."),
  SETTLEMENT("지난달 정산이 완료 되었습니다."),
  LOW_STOCK("재고가 부족한 꽃이 존재합니다."),
  NEWCOMER("신규 회원 인증이 요청되었습니다.");
  private final String message;

  NotificationKind(String kind) {
    this.message = kind;
  }
}
