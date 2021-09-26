package one.digitalinnovation.personapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum AddressType {

    HOME("Home"),
    BILLING("Billing"),
    SHIPPING("Shipping"),
    BUSINESS ("Business");

    private final String description;
}
