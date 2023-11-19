package bloomingblooms.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class SuccessResponse<T> {
  private String code;
  private String message;

  @JsonInclude(value = JsonInclude.Include.NON_EMPTY)
  private T data;
}
