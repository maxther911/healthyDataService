package net.mrsistemas.healthy.data.business.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class DataUser {

    @Id
    @Getter
    @Setter
    private long id;

    @Getter @Setter
    private String dni;

    @Getter @Setter
    private String name;

    @Getter @Setter
    private String lastName;

    @Getter @Setter
    private String ciudad;

    @Getter @Setter
    private String address;

    @Getter @Setter
    private String email;

    @Getter @Setter
    private String cellphone;

    @Getter @Setter
    private String pais;

    @Getter @Setter
    @JsonProperty(value = "phone")
    private String telPrincipal;

    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    @JsonFormat(pattern = "YYYY-MM-dd")
    @Getter @Setter
    private LocalDate birthDate;

    @Getter
    private Long edad;

    @Getter @Setter
    private BigDecimal IMC;

}
