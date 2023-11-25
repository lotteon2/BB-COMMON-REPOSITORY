package bloomingblooms.errors;

public class DomainException extends BaseException {

  public DomainException(String service) {
    super(String.format("%s service is not available", service), ErrorCode.SERVICE_NOT_AVAILABLE);
  }
}
