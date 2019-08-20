package net.mrsistemas.healthy.data.business.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class Diagnostic {
    @Getter @Setter
    private LocalDate fecha;
    @Getter @Setter
    private List<Disease> disease;
    @Getter @Setter
    private List<DataSensor> measurements;
    @Getter @Setter
    private List<FisicalData> data;

}
