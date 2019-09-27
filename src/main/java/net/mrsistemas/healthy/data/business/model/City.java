package net.mrsistemas.healthy.data.business.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
public class City {
    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private String code;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private Country country;

    @Getter
    @Setter
    private Location location;
}
