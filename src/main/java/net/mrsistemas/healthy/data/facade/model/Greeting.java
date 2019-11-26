package net.mrsistemas.healthy.data.facade.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
public class Greeting {

    @Getter
    @Setter
    private long id;

    @Getter @Setter
    private String content;

}
