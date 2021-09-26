package one.digitalinnovation.personapi.utils;

import one.digitalinnovation.personapi.dto.request.AddressDTO;
import one.digitalinnovation.personapi.entity.Address;
import one.digitalinnovation.personapi.enums.AddressType;

public class AddressUtils {

    private static final long ADDRESS_ID = 1L;

    private static String ADDRESS_CITY ="Smallville";
    private static String  ADDRESS_COUNTRY ="Alaska";
    private static String  ADDRESS_POSTCODE ="0000000";
    private static String  ADDRESS_STREETNAME = "evergreen terrace";
    private static String  ADDRESS_STREETNUMBER ="742";
    private static AddressType  ADDRESS_TYPE = AddressType.HOME;


    public static AddressDTO createFakeDTO() {
        return AddressDTO.builder()
                .city(ADDRESS_CITY)
                .country(ADDRESS_COUNTRY)
                .postCode(ADDRESS_POSTCODE)
                .streetName(ADDRESS_STREETNAME)
                .streetNumber(ADDRESS_STREETNUMBER)
                .type(ADDRESS_TYPE)
                .build();
    }

    public static Address createFakeEntity() {
        return Address.builder()
                .id(ADDRESS_ID)
                .city(ADDRESS_CITY)
                .country(ADDRESS_COUNTRY)
                .postCode(ADDRESS_POSTCODE)
                .streetName(ADDRESS_STREETNAME)
                .streetNumber(ADDRESS_STREETNUMBER)
                .type(ADDRESS_TYPE)
                .build();
    }
}
