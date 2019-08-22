package net.mrsistemas.healthy.data.business.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

public class Quantity {

    @Getter
    @Setter
    private Type group;

    @Getter
    @Setter
    private Type type;

    @Getter
    @Setter
    private Unit measurement;

    @Getter
    @Setter
    private BigDecimal value;

}
