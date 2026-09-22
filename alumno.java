/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t1.caso;

/**
 *
 * @author UCA40425
 */
public class alumno {

    private String nombre;
    private String tip_doc;
    private String num_doc;
    private String tip_beca;
    private String direccion;
    private String telefono;
    private String cod_estudiante;
    private String notas;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTip_doc() {
        return tip_doc;
    }

    public void setTip_doc(String tip_doc) {
        this.tip_doc = tip_doc;
    }

    public String getNum_doc() {
        return num_doc;
    }

    public void setNum_doc(String num_doc) {
        this.num_doc = num_doc;
    }

    public String getTip_beca() {
        return tip_beca;
    }

    public void setTip_beca(String tip_beca) {
        this.tip_beca = tip_beca;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCod_estudiante() {
        return cod_estudiante;
    }

    public void setCod_estudiante(String cod_estudiante) {
        this.cod_estudiante = cod_estudiante;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public void verDatos() {

        System.out.println(
                "Nombres completos: " + this.nombre
                + " Tipo_doc: " + this.tip_doc
                + " Nro_doc: " + this.num_doc
                + " Tipo de beca: " + this.tip_beca
                + " Direccion: " + this.direccion
                + " Telefono: " + this.telefono
                + " Codigo_est: " + this.cod_estudiante
                + " Notas: " + this.notas
        );
    }
}       

