package bloomingblooms.errors;

public class DomainException extends BaseException {

  public DomainException(String service, ErrorCode errorCode) {
    super(String.format("%s service is not available", service), errorCode);
  }
}
