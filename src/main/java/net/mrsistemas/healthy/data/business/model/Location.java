package net.mrsistemas.healthy.data.business.model;

import com.mongodb.lang.NonNull;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

public class Location {
    @NonNull @Getter @Setter
    private BigDecimal latitud;
    @NonNull @Getter @Setter
    private BigDecimal longitude;
    @NonNull @Getter @Setter
    private BigDecimal altitud;
    @NonNull @Getter @Setter
    private BigDecimal temperatura;
}
