/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t1.caso;
/**
 *
 * @author UCA40425
 */
import java.util.Scanner;

public class T1Caso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);

        controlador control = new controlador();

        String respuesta = "si";

        while (respuesta.equalsIgnoreCase("si")) {

            try {
                alumno nuevoalumno = new alumno();

                boolean valido = true;

                System.out.println("REGISTRO DEL ALUMNO");

                System.out.print("Ingrese nombres completos: ");
                String nombre = scan.nextLine();

                if (nombre.trim().isEmpty()) {
                    System.out.println("El nombre no puede estar vacío.");
                    valido = false;
                } else {
                    nuevoalumno.setNombre(nombre);
                }

                System.out.print("Ingrese tipo de documento: ");
                String tip_doc = scan.nextLine();

                if (tip_doc.trim().isEmpty()) {
                    System.out.println("El tipo de documento no puede estar vacío.");
                    valido = false;
                } else {
                    nuevoalumno.setTip_doc(tip_doc);
                }

                System.out.print("Ingrese número de documento: ");
                String num_doc = scan.nextLine();

                if (num_doc.trim().isEmpty()) {
                    System.out.println("El número de documento no puede estar vacío.");
                    valido = false;
                } else {
                    nuevoalumno.setNum_doc(num_doc);
                }

                System.out.print("Ingrese tipo de beca: ");
                String tip_beca = scan.nextLine();

                if (tip_beca.trim().isEmpty()) {
                    System.out.println("El tipo de beca no puede estar vacío.");
                    valido = false;
                } else {
                    nuevoalumno.setTip_beca(tip_beca);
                }

                System.out.print("Ingrese dirección: ");
                String direccion = scan.nextLine();

                if (direccion.trim().isEmpty()) {
                    System.out.println("La dirección no puede estar vacía.");
                    valido = false;
                } else {
                    nuevoalumno.setDireccion(direccion);
                }

                System.out.print("Ingrese teléfono: ");
                String telefono = scan.nextLine();

                if (telefono.trim().isEmpty()) {
                    System.out.println("El teléfono no puede estar vacío.");
                    valido = false;
                } else {
                    nuevoalumno.setTelefono(telefono);
                }

                System.out.print("Ingrese código de estudiante: ");
                String cod_estudiante = scan.nextLine();

                if (cod_estudiante.trim().isEmpty()) {
                    System.out.println("El código de estudiante no puede estar vacío.");
                    valido = false;
                } else {
                    nuevoalumno.setCod_estudiante(cod_estudiante);
                }

                System.out.print("Ingrese notas: ");
                String notas = scan.nextLine();

                if (notas.trim().isEmpty()) {
                    System.out.println("Las notas no pueden estar vacías.");
                    valido = false;
                } else {
                    nuevoalumno.setNotas(notas);
                }

                if (valido) {
                    control.agregar(nuevoalumno);
                    System.out.println("Alumno registrado correctamente.");
                } else {
                    System.out.println("No se registró el alumno.");
                }

            } catch (Exception e) {

                System.out.println("ERROR: " + e.getMessage());
            }

            System.out.print("¿Desea ingresar otro alumno? (si/no): ");
            respuesta = scan.nextLine();
        }

        System.out.println("LISTA DE ALUMNOS");

        control.listar();

        scan.close();
    }
}
