package net.mrsistemas.healthy.data.business.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class Diagnostic {

    @Getter
    @Setter
    private LocalDate fecha = LocalDate.now();
    @Getter
    @Setter
    private List<Disease> diseases;

    @Getter
    @Setter
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<DataSensor> measurements;
    @Getter
    @Setter
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<FisicalData> data;

}
