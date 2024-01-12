package bloomingblooms.dto.command;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public class StoreSettlementDto {

  private Long storeId;
  private Long settlementAmount;

}