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
 * @author walte
 */
public class Receta {
    protected Date fecha;
    protected PlanNutricional plan;
    protected ArrayList<Medicamento> med;

    public Receta(Date fecha) {
        this.fecha = fecha;
    }

    public Receta(Date fecha, PlanNutricional plan) {
        this.fecha = fecha;
        this.plan = plan;
    }

    public Receta(Date fecha, PlanNutricional plan, ArrayList<Medicamento> med) {
        this.fecha = fecha;
        this.plan = plan;
        this.med = med;
    }

    public Receta(Date fecha, ArrayList<Medicamento> med) {
        this.fecha = fecha;
        this.med = med;
    }
    

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public PlanNutricional getPlan() {
        return plan;
    }

    public void setPlan(PlanNutricional plan) {
        this.plan = plan;
    }

    public ArrayList<Medicamento> getMed() {
        return med;
    }

    public void setMed(ArrayList<Medicamento> med) {
        this.med = med;
    }
    
    
    
}
