package com.aluracursos.devs_hotel.domain.reserva;

import com.aluracursos.devs_hotel.domain.huesped.DatosHuesped;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;


public record DatosRegistroReserva(
        @NotNull
        LocalDate fechaCheckIn,
        @NotNull
        LocalDate fechaCheckOut,
        @NotBlank
        String valor,
        @NotNull
        FormaDePago formaDePago,
        @NotNull
        @Valid
        DatosHuesped huesped
) {
}
