
import java.util.ArrayList;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Franklin Garcia
 */
public class Paciente extends Persona {
    private ArrayList enfermedades=new ArrayList();
    private Date fecha_ingreso; 
    private Date fecha_alta;
    private String tipo_sangre;
    private String causa_visita; 
    private ArrayList alergias=new ArrayList(); 
    private ArrayList órganos=new ArrayList();

    public Paciente() {
        super();
    }

    public Paciente(Date fecha_ingreso, Date fecha_alta, String tipo_sangre, String causa_visita, String nombre, int edad, int ID, double altura, double peso, String sexo) {
        super(nombre, edad, ID, altura, peso, sexo);
        this.fecha_ingreso = fecha_ingreso;
        this.fecha_alta = fecha_alta;
        this.tipo_sangre = tipo_sangre;
        this.causa_visita = causa_visita;
    }

    public ArrayList getEnfermedades() {
        return enfermedades;
    }

    public void setEnfermedades(ArrayList enfermedades) {
        this.enfermedades = enfermedades;
    }

    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public Date getFecha_alta() {
        return fecha_alta;
    }

    public void setFecha_alta(Date fecha_alta) {
        this.fecha_alta = fecha_alta;
    }

    public String getTipo_sangre() {
        return tipo_sangre;
    }

    public void setTipo_sangre(String tipo_sangre) {
        this.tipo_sangre = tipo_sangre;
    }

    public String getCausa_visita() {
        return causa_visita;
    }

    public void setCausa_visita(String causa_visita) {
        this.causa_visita = causa_visita;
    }

    public ArrayList getAlergias() {
        return alergias;
    }

    public void setAlergias(ArrayList alergias) {
        this.alergias = alergias;
    }

    public ArrayList getÓrganos() {
        return órganos;
    }

    public void setÓrganos(ArrayList órganos) {
        this.órganos = órganos;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
