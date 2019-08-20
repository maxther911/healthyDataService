package net.mrsistemas.healthy.data.facade.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
public class Greeting {

    @Getter @Setter
    private final long id;
    @Getter @Setter
    private final String content;



}
