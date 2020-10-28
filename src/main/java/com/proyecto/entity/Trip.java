package com.proyecto.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "trip")
public class Trip {
    @Id
    @Column(name = "id_sube")
    private int idSube;
    @Column(name = "price")
    private BigDecimal price;
    @Column(name = "date")
    private LocalDateTime date ;

    public int getSubeId() {
        return idSube;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Trip(BigDecimal price, LocalDateTime date) {
        this.price = price;
        this.date = date ;
    }

    public Trip() {

    }
}
