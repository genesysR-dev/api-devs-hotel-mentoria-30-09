package com.aluracursos.devs_hotel.domain.reserva;

import com.aluracursos.devs_hotel.domain.huesped.Huesped;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Table(name="reserva")
@Entity(name="Reserva")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JsonFormat(pattern="yyyy-MM-dd", timezone = "GMT-3")
    private LocalDate fechaCheckIn;
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT-3")
    private LocalDate fechaCheckOut;
    private String valor;
    @Enumerated(EnumType.STRING)
    private FormaDePago formaDePago;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "huesped_id", nullable = false)
    private Huesped huesped;

    public Reserva(DatosRegistroReserva datosRegistroReserva) {
        this.fechaCheckIn = datosRegistroReserva.fechaCheckIn();
        this.fechaCheckOut = datosRegistroReserva.fechaCheckOut();
        this.valor = datosRegistroReserva.valor();
        this.formaDePago = datosRegistroReserva.formaDePago();
        this.huesped = new Huesped(datosRegistroReserva.huesped());
    }
}
