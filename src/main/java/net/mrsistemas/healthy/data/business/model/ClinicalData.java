package net.mrsistemas.healthy.data.business.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

public class ClinicalData {
    @Getter @Setter
    @ApiModelProperty(value = "Corresponds with the identifier of a contract. It should be a code that identifies univocally a contract", required = false)
    private User userDataRegister;
    @Getter @Setter
    @ApiModelProperty(value = "Corresponds with the identifier of a contract. It should be a code that identifies univocally a contract", required = false)
    private User patient;
    @Getter @Setter
    @ApiModelProperty(value = "Corresponds with the identifier of a contract. It should be a code that identifies univocally a contract", required = false)
    private Diagnostic diagnostic;
    @Getter
    @ApiModelProperty(value = "Corresponds with the identifier of a contract. It should be a code that identifies univocally a contract", required = false)
    private LocalDate date = LocalDate.now();

}
