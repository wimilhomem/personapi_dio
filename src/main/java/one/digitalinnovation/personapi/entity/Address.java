package one.digitalinnovation.personapi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinnovation.personapi.enums.AddressType;

import javax.persistence.*;
import javax.validation.constraints.Size;

//lombok para getters and setters
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private String country;

    @Column(nullable = false)
    private String postCode;

    @Column(nullable = false)
    private String streetName;

    @Column(nullable = false)
    @Size(min = 2, max = 10)
    private String streetNumber;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private AddressType type;



}
