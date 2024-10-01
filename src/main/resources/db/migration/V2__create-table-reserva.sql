CREATE TABLE reserva (
       id BIGINT AUTO_INCREMENT PRIMARY KEY,
       fecha_check_in DATE NOT NULL,
       fecha_check_out DATE NOT NULL,
       valor VARCHAR(20),
       forma_de_pago VARCHAR(100),
       huesped_id BIGINT NOT NULL,
       CONSTRAINT fk_huesped FOREIGN KEY (huesped_id) REFERENCES huesped(id)
   );