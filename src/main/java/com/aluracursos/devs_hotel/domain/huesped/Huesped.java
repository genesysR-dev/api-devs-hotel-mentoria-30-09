package com.aluracursos.devs_hotel.domain.huesped;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="huesped")
@Entity(name="Huesped")
public class Huesped {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombreCompleto;
    private String email;
    private String telefono;

    public Huesped(DatosHuesped huesped) {
        this.nombreCompleto = huesped.nombreCompleto();
        this.email = huesped.email();
        this.telefono = huesped.telefono();
    }
}

