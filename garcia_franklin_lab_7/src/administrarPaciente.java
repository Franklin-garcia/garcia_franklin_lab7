
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
public class administrarPaciente {
        private ArrayList<Paciente> listaPersonas = new ArrayList();
    private File archivo;

    public administrarPaciente(String Path) {
        archivo = new File(Path);
        this.listaPersonas = new ArrayList();
    }

    public ArrayList<Paciente> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(ArrayList<Paciente> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "Lista persoans" + listaPersonas;
    }

    //Mutador extra
    public void setPersona(Paciente P) {
        this.listaPersonas.add(P);
    }
    public void cargarArchivo() {
        try {
            listaPersonas = new ArrayList();
            Paciente temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Paciente) objeto.readObject()) != null) {
                        listaPersonas.add(temp);
                    }
                } catch (EOFException e) {
                }
                objeto.close();
                entrada.close();
            }//fin if
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Paciente t : listaPersonas) {
                bw.writeObject(t);
            }
        } catch (Exception e) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
            }
        }
    }
}
