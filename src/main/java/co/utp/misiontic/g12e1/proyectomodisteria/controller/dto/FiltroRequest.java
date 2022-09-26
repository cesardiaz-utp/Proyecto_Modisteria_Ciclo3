package co.utp.misiontic.g12e1.proyectomodisteria.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FiltroRequest {

    private boolean colegioa;
    private boolean colegiob;
    private boolean pantalon;
    private boolean camisa;
    private boolean otros;
    private boolean diario;
    private boolean fisica;

    
}
