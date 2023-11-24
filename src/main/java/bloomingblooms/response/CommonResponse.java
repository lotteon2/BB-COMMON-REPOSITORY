package bloomingblooms.response;

import bloomingblooms.errors.ErrorCode;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CommonResponse<T> {
  private T data;
  private String message;
  private String errorCode;
  private Result result;

  public static <T> CommonResponse<T> success(T data, String message) {
    return CommonResponse.<T>builder().result(Result.SUCCESS).data(data).message(message).build();
  }

  public static <T> CommonResponse<T> success(T data) {
    return success(data, null);
  }

  public static CommonResponse fail(String message, String errorCode) {
    return CommonResponse.builder()
        .result(Result.FAIL)
        .message(message)
        .errorCode(errorCode)
        .build();
  }

  public static CommonResponse fail(ErrorCode errorCode) {
    return CommonResponse.builder()
        .result(Result.FAIL)
        .message(errorCode.getMessage())
        .errorCode(errorCode.name())
        .build();
  }

  private enum Result {
    SUCCESS,
    FAIL
  }
}
