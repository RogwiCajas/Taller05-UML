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
public class Secretaria extends Persona{
    protected Doctor doc;
    public Secretaria(String usuario, String clave, String nombre, String cedula, String direccion, Date fechaNac,Doctor doc) {
        super(usuario, clave, nombre, cedula, direccion, fechaNac);
        this.doc = doc;
    }
    
    public void verficarCita(){
    
    }
    
    public void agendarCita(){
    
    }

    public Doctor getDoc() {
        return doc;
    }

    public void setDoc(Doctor doc) {
        this.doc = doc;
    }


    
}
