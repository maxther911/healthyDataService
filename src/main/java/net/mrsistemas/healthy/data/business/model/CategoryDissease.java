package net.mrsistemas.healthy.data.business.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class CategoryDissease {
    @Getter @Setter
    private String code;
    @Getter @Setter
    private String description;
    @Getter @Setter
    private Type disseaseType;


}
