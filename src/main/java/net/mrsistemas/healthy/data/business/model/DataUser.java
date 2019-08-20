package net.mrsistemas.healthy.data.business.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DataUser {
    @Id
    @Getter
    @Setter
    private long id;
    @Getter @Setter
    private String dni;
    @Getter @Setter
    private String nombres;
    @Getter @Setter
    private String apellidos;
    @Getter @Setter
    private String ciudad;
    @Getter @Setter
    private String direccion;
    @Getter @Setter
    private String email;
    @Getter @Setter
    private String movil;
    @Getter @Setter
    private String pais;

    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    @JsonFormat(pattern = "YYYY-MM-dd")
    @Getter @Setter
    private LocalDate fNacimiento;
    @Getter @Setter
    private Long edad;
    @Getter @Setter
    private BigDecimal IMC;
}
