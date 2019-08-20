package net.mrsistemas.healthy.data.business.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class DataSensor {
    @Getter @Setter
    private long id;
    @Getter @Setter
    private long sensor_id;
    @Getter @Setter
    private List<Quantity> quantities;
    @Getter @Setter
    private Type type;

}
