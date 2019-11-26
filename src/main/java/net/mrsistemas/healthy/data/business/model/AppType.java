package net.mrsistemas.healthy.data.business.model;

import com.mongodb.lang.NonNull;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.math.BigDecimal;

public class AppType {

    @Getter @Setter
    private String code;
    @Getter @Setter
    private Type category;
    @Getter @Setter
    private String desc;
    // Importancia del dato para ser tenido en cuenta
    @Min(0)
    @Max(100)
    private BigDecimal diffusion;

}
