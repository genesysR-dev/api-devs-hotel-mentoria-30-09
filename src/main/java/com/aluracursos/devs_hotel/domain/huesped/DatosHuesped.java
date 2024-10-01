package com.aluracursos.devs_hotel.domain.huesped;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record DatosHuesped(
        @NotBlank
        String nombreCompleto,
        @NotBlank
        @Email
        String email,
        @NotBlank
        String telefono
) {

}
