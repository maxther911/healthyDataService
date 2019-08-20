package net.mrsistemas.healthy.data.business.model;

import com.mongodb.lang.NonNull;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "users")
public class User {

    @Transient
    public static final String SEQUENCE_NAME = "users_sequence";

    @Id
    @NonNull
    @Getter
    @Setter
    private long id;

    @Getter
    @Setter
    private DataUser data;

}
