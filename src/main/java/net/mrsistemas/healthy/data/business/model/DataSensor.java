package net.mrsistemas.healthy.data.business.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class DataSensor implements Serializable {

    @Getter @Setter
    private User patient;

    @Getter @Setter
    private String id;

    @Getter @Setter
    private long sensor_id;

    @Getter @Setter
    private List<Quantity> quantities;

    @Getter @Setter
    private Type type;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Getter
    private LocalDateTime date = LocalDateTime.now();

}
