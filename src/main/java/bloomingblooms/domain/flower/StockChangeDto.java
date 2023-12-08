package bloomingblooms.domain.flower;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StockChangeDto {
    private Long storeId;
    private Long flowerId;
    private Long stock;
}
