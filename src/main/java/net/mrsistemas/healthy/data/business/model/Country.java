package net.mrsistemas.healthy.data.business.model;

import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Country {

    @Getter @Setter
    private Long id;

    @Getter @Setter
    private String code;

    @Getter @Setter
    private String name;
}
