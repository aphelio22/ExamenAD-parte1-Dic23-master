package cesur.examen.core.common;

import cesur.examen.core.worker.Worker;
import cesur.examen.core.worker.WorkerDAO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * EXAMEN DE ACCESO A DATOS
 * Diciembre 2023
 *
 * Nombre del alumno: Jorge Alarcón Navarro
 * Fecha: 11/12/2023
 *
 * No se permite escribir en consola desde las clases DAO, Service y Utils usando System.out.
 * En su lugar, usa log.info(), log.warning() y log.severe() para mostrar información interna
 * o para seguir la traza de ejecución.
 */

/**
 * Métodos de utilidad para archivos.
 */
public class FileUtils {

    /**
     * Obtiene toda la lista de trabajadores y las saca a un '.csv'.
     * @param fileName
     * @param workers
     */
    public static void toCSV(String fileName, List<Worker> workers) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName))) {
            for (Worker trabajador : workers) {
                String dataLine = trabajador.getId() + "," +
                        trabajador.getName() + "," +
                        trabajador.getDni() + "," +
                        trabajador.getFrom();
                bufferedWriter.write(dataLine);
                bufferedWriter.newLine();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

