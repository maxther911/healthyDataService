package net.mrsistemas.healthy.data.business.model;

import com.mongodb.lang.NonNull;
import lombok.*;

import java.math.BigDecimal;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Location {

    @Getter @Setter
    @NonNull
    private Long id;
    @NonNull @Getter @Setter
    private BigDecimal latitude;
    @NonNull @Getter @Setter
    private BigDecimal longitude;
    @NonNull @Getter @Setter
    private BigDecimal altitude;
    @NonNull @Getter @Setter
    private BigDecimal temperature;
}
