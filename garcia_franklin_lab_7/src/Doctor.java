
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Franklin Garcia
 */
public class Doctor extends Persona{
      private ArrayList especialidades=new ArrayList(); 
      private ArrayList pacientes=new ArrayList(); 
      private int años_doctor;
      private String horario;
      private ArrayList dias_trabajo=new ArrayList();

    public Doctor() {
        super();
    }

    public Doctor(int años_doctor, String horario, String nombre, int edad, int ID, double altura, double peso, String sexo) {
        super(nombre, edad, ID, altura, peso, sexo);
        this.años_doctor = años_doctor;
        this.horario = horario;
    }

    public ArrayList getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(ArrayList especialidades) {
        this.especialidades = especialidades;
    }

    public ArrayList getPacientes() {
        return pacientes;
    }

    public void setPacientes(ArrayList pacientes) {
        this.pacientes = pacientes;
    }

    public int getAños_doctor() {
        return años_doctor;
    }

    public void setAños_doctor(int años_doctor) {
        this.años_doctor = años_doctor;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public ArrayList getDias_trabajo() {
        return dias_trabajo;
    }

    public void setDias_trabajo(ArrayList dias_trabajo) {
        this.dias_trabajo = dias_trabajo;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
