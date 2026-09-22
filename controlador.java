/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t1.caso;

/**
 *
 * @author UCA40425
 */
import java.util.ArrayList;

public class controlador {

    ArrayList<alumno> listaalumnos = new ArrayList();

    public void listar() {
        System.out.println("La lista es: ");

        for (int i = 0; i < listaalumnos.size(); i++) {
            listaalumnos.get(i).verDatos();
        }
    }

    public void agregar(alumno nuevoalumno) {
        listaalumnos.add(nuevoalumno);
    }
}
