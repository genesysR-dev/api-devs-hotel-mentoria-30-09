package com.aluracursos.devs_hotel.controller;

import com.aluracursos.devs_hotel.domain.reserva.DatosRegistroReserva;
import com.aluracursos.devs_hotel.domain.reserva.Reserva;
import com.aluracursos.devs_hotel.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/reservas")
@RestController
public class ReservaController {
    @Autowired
    private ReservaRepository reservaRepository;

    @PostMapping
    public void registrarReserva(@RequestBody DatosRegistroReserva datosRegistroReserva){
        reservaRepository.save(new Reserva(datosRegistroReserva));


        // CÓDIGO QUE VALIDA SI EL HUESPED YA ESTÁ REGISTRADO EN LA BASE DE DATOS
        //ATENCIÓN: PARA QUE ESTE CÓDIGO FUNCIONE SE NECESITA CREAR UNA INTERFAZ REPOSITORY
        //PARA HUESPED JUNTO CON EL MÉTODO findByEmail, NO OLVIDES HACER LA INYECCIÓN DE DEPENDENCIAS
        //DE LA INTERFACE HUESPED REPOSITORY AQUÍ EN EL CONTROLLER
        //DatosHuesped datosHuesped = datosRegistroReserva.huesped();

        // Buscar al huésped en la base de datos por su email
        //Huesped huesped = huespedRepository.findByEmail(datosHuesped.email())
                //.orElseGet(() -> {
                    // Si no existe, crear un nuevo Huesped usando el constructor que acepta el DTO
                   // return huespedRepository.save(new Huesped(datosHuesped));
              //  });

        // Guardar la reserva
        //reservaRepository.save(new Reserva(datosRegistroReserva));
    }
}
