package net.mrsistemas.healthy.data.business.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class Disease {
    @Getter @Setter
    private String code;
    @Getter @Setter
    private Type type;
    @Getter @Setter
    private CategoryDissease category;

}
