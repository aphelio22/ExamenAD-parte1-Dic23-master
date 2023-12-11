package cesur.examen.core.worker;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * EXAMEN DE ACCESO A DATOS
 * Diciembre 2023
 *
 * Nombre del alumno: Jorge Alarcón Navarro
 * Fecha: 11/12/2023
 */

/**
 * Clase Worker.
 */
@Data
public class Worker implements Serializable {

    /**
     * Id de Worker.
     */
    private Long id;

    /**
     * Nombre de Worker.
     */
    private String name;

    /**
     * DNI de Worker.
     */
    private String dni;

    /**
     * Fecha desde de Worker.
     */
    private Date from;

}
