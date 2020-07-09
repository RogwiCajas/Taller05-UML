/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talleruml;

import java.util.ArrayList;

/**
 *
 * @author cajas
 */
public class Paciente extends Persona{
    protected String email;
    protected HistoriaClinica historiaClinica;//0 1
    protected Cita cita;//0 1
    protected ArrayList<Receta> recetas;//0 o n
    
    public boolean solicitarCita(){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
