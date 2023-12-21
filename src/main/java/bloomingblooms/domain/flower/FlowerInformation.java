package bloomingblooms.domain.flower;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class FlowerInformation {
  private Long flowerId;
  private String flowerName;
}
