package bloomingblooms.domain.delivery;

import bloomingblooms.domain.order.OrderInfo;
import bloomingblooms.domain.order.OrderInfoByStore;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DeliveryInsertDto {
  private String ordererName;
  private String ordererPhoneNumber;
  private String ordererEmail;
  private String recipientName;
  private String recipientPhoneNumber;
  private String zipcode;
  private String roadName;
  private String addressDetail;
  private String request;
  private Long deliveryCost;

  public static List<DeliveryInsertDto> toDto(OrderInfo orderInfo) {

    // 가게 개수 만큼 배송 정보 생성
    List<OrderInfoByStore> orderInfoByStores = orderInfo.getOrderInfoByStores();

    List<DeliveryInsertDto> list = new ArrayList<>();
    for (int i = 0; i < orderInfoByStores.size(); i++) {
      DeliveryInsertDto dto =
          DeliveryInsertDto.builder()
              .ordererName(orderInfo.getOrdererName())
              .ordererPhoneNumber(orderInfo.getOrdererPhoneNumber())
              .ordererEmail(orderInfo.getOrdererEmail())
              .recipientName(orderInfo.getRecipientName())
              .recipientPhoneNumber(orderInfo.getRecipientPhone())
              .zipcode(orderInfo.getDeliveryZipcode())
              .roadName(orderInfo.getDeliveryRoadName())
              .addressDetail(orderInfo.getDeliveryAddressDetail())
              .request(orderInfo.getDeliveryRequest())
              .deliveryCost(orderInfoByStores.get(i).getDeliveryCost())
              .build();
      list.add(dto);
    }

    return list;
  }
}
