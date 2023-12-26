package bloomingblooms.domain.flower;

import lombok.*;

@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class StockDto {
    private Long flowerId;
    private Long stock;
}
