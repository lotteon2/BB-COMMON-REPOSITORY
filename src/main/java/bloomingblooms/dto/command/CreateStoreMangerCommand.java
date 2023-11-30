package bloomingblooms.dto.command;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class CreateStoreMangerCommand {
  private String email;
  private String businessNumberImage;
  private String name;

}
