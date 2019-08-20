package net.mrsistemas.healthy.data.business.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class FisicalData {
    @Getter @Setter
    private Type type;
    @Getter @Setter
    private List<Quantity> measurements;

}
