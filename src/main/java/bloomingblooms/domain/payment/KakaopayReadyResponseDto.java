package bloomingblooms.domain.payment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class KakaopayReadyResponseDto {
  private String tid;

  @JsonProperty("next_redirect_pc_url")
  private String nextRedirectPcUrl;
}
