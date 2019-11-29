package net.mrsistemas.healthy.data.business.model;

import com.mongodb.lang.NonNull;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.math.BigDecimal;

@Document(collection = "AppType")
public class AppType {

    @Getter @Setter
    private String code;
    @Getter @Setter
    private Type category;
    @Getter @Setter
    private String description;
    // Importancia del dato para ser tenido en cuenta
    @Min(0)
    @Max(100)
    @Getter @Setter
    private BigDecimal diffusion;

}
