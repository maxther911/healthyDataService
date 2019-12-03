package net.mrsistemas.healthy.data.business.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "disease")
public class Disease {

    //@Getter @Setter
    //private ObjectId id;
    @Getter
    @Setter
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String id;
    @Getter
    @Setter
    private String code;
    @Getter
    @Setter
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private Type type;
    @Getter
    @Setter
    private CategoryDissease category;
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    @JsonIgnore
    private List ins;
    @Getter
    @Setter
    @JsonIgnore
    private List out;
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @Getter
    @Setter
    private Long risk;

}
