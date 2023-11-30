package bloomingblooms.message;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class SocialUserSignUpDto {
  private Long socialId;
  private String nickname;
  private String email;
}
