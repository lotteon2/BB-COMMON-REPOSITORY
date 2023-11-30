package bloomingblooms.message;

import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class CreateStoreMangerMessage {
  private String email;
  private String businessNumberImage;
  private String name;

}
