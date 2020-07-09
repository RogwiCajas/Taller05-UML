/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talleruml;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author cajas
 */
public class Paciente extends Persona{
    protected String email;
    protected HistoriaClinica historiaClinica;//0 1
    protected Cita cita;//0 1
    protected ArrayList<Receta> recetas;//0 o n

    public Paciente(String usuario, String clave, String nombre, String cedula, String direccion, Date fechaNac,String email,HistoriaClinica historia,
            Cita cita,ArrayList<Receta> recetas) {
        super(usuario, clave, nombre, cedula, direccion, fechaNac);
        this.email = email;
        this.historiaClinica = historia;
        this.cita = cita;
        this.recetas = recetas;
    }
    
    public boolean solicitarCita(){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public HistoriaClinica getHistoriaClinica() {
        return historiaClinica;
    }

    public void setHistoriaClinica(HistoriaClinica historiaClinica) {
        this.historiaClinica = historiaClinica;
    }

    public Cita getCita() {
        return cita;
    }

    public void setCita(Cita cita) {
        this.cita = cita;
    }

    public ArrayList<Receta> getRecetas() {
        return recetas;
    }

    public void setRecetas(ArrayList<Receta> recetas) {
        this.recetas = recetas;
    }
    
    
    
    
    
}
