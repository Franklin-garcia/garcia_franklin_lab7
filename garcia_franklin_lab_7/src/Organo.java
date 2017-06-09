
import java.awt.Color;
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
public class Organo {
   private static final long SerialVersionUID=665L;
   private Color color;
   private ArrayList características=new ArrayList();
   private int nivel_efectividad; 
   private int nivel_potenciado;   
   private int nivel_prueba;

    public Organo() {
    }

    public Organo(Color color, int nivel_efectividad, int nivel_potenciado, int nivel_prueba) {
        this.color = color;
        this.nivel_efectividad = nivel_efectividad;
        this.nivel_potenciado = nivel_potenciado;
        this.nivel_prueba = nivel_prueba;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public ArrayList getCaracterísticas() {
        return características;
    }

    public void setCaracterísticas(ArrayList características) {
        this.características = características;
    }

    public int getNivel_efectividad() {
        return nivel_efectividad;
    }

    public void setNivel_efectividad(int nivel_efectividad) {
        this.nivel_efectividad = nivel_efectividad;
    }

    public int getNivel_potenciado() {
        return nivel_potenciado;
    }

    public void setNivel_potenciado(int nivel_potenciado) {
        this.nivel_potenciado = nivel_potenciado;
    }

    public int getNivel_prueba() {
        return nivel_prueba;
    }

    public void setNivel_prueba(int nivel_prueba) {
        this.nivel_prueba = nivel_prueba;
    }

    @Override
    public String toString() {
        return ""+nivel_efectividad;
    }
   
}
