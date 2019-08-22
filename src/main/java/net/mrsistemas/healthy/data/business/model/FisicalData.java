package net.mrsistemas.healthy.data.business.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@ApiModel(description = "Reporta la informacion de datos de componentes fisicos.")
public class FisicalData {
    @Getter
    @Setter
    private DataOrigin app;

    @Getter
    @Setter
    private User user;

    @Getter @Setter
    private Type type;

    @Getter @Setter
    private List<Quantity> measurements;

}
