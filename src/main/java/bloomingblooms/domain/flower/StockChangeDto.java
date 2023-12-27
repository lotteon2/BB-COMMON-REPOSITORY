package bloomingblooms.domain.flower;

import java.util.List;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class StockChangeDto {
    private Long storeId;
    private List<StockDto> stockDtos;
    private String phoneNumber;
}
