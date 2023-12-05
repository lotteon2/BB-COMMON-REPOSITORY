package bloomingblooms.dto.command;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class SoftDeleteSocialUseCommand {
  private Long socialId;
}
