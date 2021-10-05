package one.digitalinnovation.personapi.dto.request;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinnovation.personapi.enums.AddressType;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("Address")
public class AddressDTO {

    private Long id;

    @NotEmpty
    @Size(min = 2, max = 100)
    private String city;

    @NotEmpty
    @Size(min = 2, max = 100)
    private String country;

    @NotEmpty
    private String postCode;

    @NotEmpty
    private String streetName;

    @NotEmpty
    @Size(min = 2, max = 10)
    private String streetNumber;

    @Enumerated(EnumType.STRING)
    private AddressType type;



}
