package cesur.examen.core.worker;

import cesur.examen.core.common.JDBCUtils;
import lombok.extern.java.Log;

import java.time.LocalDate;
import java.util.Date;

/**
 * EXAMEN DE ACCESO A DATOS
 * Diciembre 2023
 *
 * Nombre del alumno: Jorge Alarcón Navarro
 * Fecha: 11/12/2023
 *
 *  No se permite escribir en consola desde las clases DAO, Service y Utils usando System.out.
 *  En su lugar, usa log.info(), log.warning() y log.severe() para mostrar información interna
 *  o para seguir la traza de ejecución.
 */
/**
 *  Services classes offers methods to our main application, and can
 *  use multiple methods from DAOs and Entities.
 *  It's a layer between Data Access Layer and Aplication Layer (where
 *  Main app and controllers lives)
 *  It helps to encapsulate multiple opperations with DAOs that can be
 *  reused in application layer.
 */

/**
 * Métodos de servicio de Worker.
 */
@Log
public class WorkerService {
    /*
    RenovateWorker() set "from" date of the worker with this dni to today's date.
    Remember Date().
    Returns the new updated worker, null if fails or dni doesn't exist.
    */

    /**
     * Renueva la fecha de un Worker.
     * @param dni
     * @return El Worker actualizado.
     */
    public static Worker renovateWorker(String dni){
        Worker out = null;
        /* Make implementation here ...  */
        WorkerDAO workerDAO = new WorkerDAO();

        Worker trabajadorActualizar = workerDAO.getWorkerByDNI(dni);

        Date fecha = new Date();

        trabajadorActualizar.setFrom( fecha );

        out = workerDAO.update(trabajadorActualizar);

        return out;
    }
}

