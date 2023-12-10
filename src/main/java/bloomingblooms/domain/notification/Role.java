package bloomingblooms.domain.notification;

import lombok.Getter;

@Getter
public enum Role {
  CUSTOMER("customer"),
  MANAGER("manager"),
  ADMIN("admin");
  private final String role;

  Role(String role) {
    this.role = role;
  }
}
