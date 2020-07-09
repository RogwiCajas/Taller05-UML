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
public class Administrador extends Persona {
    
    public Administrador(String usuario, String clave, String nombre, String cedula, String direccion, Date fechaNac) {
        super(usuario, clave, nombre, cedula, direccion, fechaNac);
    }
    
    public Persona asignarRol(Persona p){
        return p;
    }
    
    public void RegistraUsuario(){
        
    }
    
}
