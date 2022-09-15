package co.utp.misiontic.g12e1.proyectomodisteria.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
    private Integer id;
    private String lastName;
    private String firstName;
    private String eMail;
    private String telefono;
}
