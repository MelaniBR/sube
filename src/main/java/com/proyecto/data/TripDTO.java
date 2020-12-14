package com.proyecto.data;

import com.proyecto.entity.Trip;
import lombok.AllArgsConstructor;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class TripDTO {

    private int idSube;
    private BigDecimal price;
    private LocalDateTime date;

    public TripDTO(Trip trip) {

        idSube = trip.getSubeId();
        price = trip.getPrice();
        date = trip.getDate();

    }

}
