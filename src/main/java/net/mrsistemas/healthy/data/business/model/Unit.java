package net.mrsistemas.healthy.data.business.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class Unit {
    @Getter @Setter
    private String code;
    @Getter @Setter
    private String description;
}
