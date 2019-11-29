package net.mrsistemas.healthy.data.business.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mongodb.client.model.Collation;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "disease")
public class Disease {

    //@Getter @Setter
    //private ObjectId id;
    @Getter @Setter
    private String _id;
    @Getter @Setter
    private String code;
    @Getter @Setter
    private Type type;
    @Getter @Setter
    private CategoryDissease category;
    @Getter @Setter
    private String name;
    @Getter @Setter
    @JsonIgnore
    private List ins;
    @Getter @Setter
    @JsonIgnore
    private List out;

}
