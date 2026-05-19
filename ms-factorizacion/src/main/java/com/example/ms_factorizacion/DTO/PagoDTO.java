package com.example.ms_factorizacion.DTO;

import lombok.Data;

@Data
public class PagoDTO {
    
    private Long id;
    private Long usuarioId;
    private Long juegoId;

    private int total;
    private String metodoPago; 

}
