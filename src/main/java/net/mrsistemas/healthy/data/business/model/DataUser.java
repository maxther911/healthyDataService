package net.mrsistemas.healthy.data.business.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class DataUser{

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
    @JsonProperty(value = "phone")
    private String telPrincipal;

    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    @JsonFormat(pattern = "dd-MM-yyyy")
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @Getter @Setter
    private LocalDate birthDate;

    @Getter
    private Long edad;

    @Getter @Setter
    private BigDecimal IMC;

    @JsonProperty("birth_city")
    private City city;

    @Getter @Setter
    private String photo;

    @Getter @Setter
    private DataUser contact;

}
