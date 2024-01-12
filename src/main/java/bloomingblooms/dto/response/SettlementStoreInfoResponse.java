package bloomingblooms.dto.response;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public class SettlementStoreInfoResponse {
  private Long storeId;
  private String storeName;
  private String bankName;
  private String accountNumber;
  private String gugun;
  private String sido;
}
