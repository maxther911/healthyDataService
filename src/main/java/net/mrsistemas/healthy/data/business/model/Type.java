package net.mrsistemas.healthy.data.business.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
public class Type {

    @Getter @Setter
    private long code;

    @Getter @Setter
    private String description;

}
