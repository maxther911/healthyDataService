package net.mrsistemas.healthy.data.business.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

public class Quantity {
    @Getter
    @Setter
    private long code;
    @Getter @Setter
    private Unit measurement;
    @Getter @Setter
    private BigDecimal value;

}
