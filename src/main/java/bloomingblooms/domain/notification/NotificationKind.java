package bloomingblooms.domain.notification;

import lombok.Getter;

@Getter
public enum NotificationKind {
  DELIVERY("배송이 시작되었습니다."),
  RESALE("상품이 재입고 되었습니다."),
  QUESTION("문의가 등록되었습니다."),
  INQUERY("문의에 답변이 등록되었습니다."),
  SHOPPINGMALL("신규 배송 주문이 접수 되었습니다."),
  PICKUP("신규 픽업 주문이 접수 되었습니다."),
  SUBSCRIBE("신규 구독 주문이 접수 되었습니다."),
  SETTLEMENT("지난달 정산이 완료 되었습니다."),
  NEWCOMER("신규 회원 인증이 요청되었습니다."),
  ORDERCANCEL("취소된 주문이 존재합니다."),

  OUT_OF_STOCK("주문 실패: 재고 부족"),
  INVALID_COUPON("주문 실패: 쿠폰 만료"),
  ORDER_FAIL("주문 처리중 문제가 발생 했습니다."),
  ORDER_SUCCESS("주문이 완료 되었습니다."),
  ORDER("");

  private final String message;

  NotificationKind(String kind) {
    this.message = kind;
  }
}
