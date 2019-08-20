package net.mrsistemas.healthy.data.business.model;

import lombok.Getter;
import lombok.Setter;

public class Training {
    @Getter @Setter
    private long code;
    @Getter @Setter
    private TrainingCategory Category;
    @Getter @Setter
    private Quantity quantity;
}
