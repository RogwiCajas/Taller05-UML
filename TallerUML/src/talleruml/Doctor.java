/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talleruml;

import java.util.Date;

/**
 *
 * @author walte
 */
public class Doctor extends Persona {
    protected int RegDoctor;
    protected String especialidad;
    AreaMedica area;

    public Doctor(String usuario, String clave, String nombre, String cedula, String direccion, Date fechaNac,int reg,String especialidad,AreaMedica area) {
        super(usuario, clave, nombre, cedula, direccion, fechaNac);
        this.RegDoctor = reg;
        this.especialidad = especialidad;
        this.area = area;
    }
    
    public void recetar(){
        
    }
    public void agregarPLanNut(){
    
    }
    
    public void imprimirReceta(){
    
    }
    
    public void registraSecretaria(){
        
    }

}
