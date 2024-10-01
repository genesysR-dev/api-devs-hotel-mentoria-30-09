package com.aluracursos.devs_hotel.repository;

import com.aluracursos.devs_hotel.domain.reserva.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservaRepository extends JpaRepository<Reserva,Long> {
}
