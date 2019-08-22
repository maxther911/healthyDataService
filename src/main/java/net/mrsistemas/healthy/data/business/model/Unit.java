package net.mrsistemas.healthy.data.business.model;

import io.swagger.annotations.ApiParam;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class Unit {

    @Getter @Setter
    @ApiParam(required = true, name = "codigo", type = "String")
    private String code;

    @Getter @Setter
    private String description;
}
