/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 31158
 */
public class prestamocl {
    Double numero_cuenta;
    Double cedula;
    String nombre;
    Double  ingresos_men;
    Double monto_pedir;

    public prestamocl(Double numero_cuenta, Double cedula, String nombre, Double ingresos_men, Double monto_pedir) {
        this.numero_cuenta = numero_cuenta;
        this.cedula = cedula;
        this.nombre = nombre;
        this.ingresos_men = ingresos_men;
        this.monto_pedir = monto_pedir;
    }

    public Double getNumero_cuenta() {
        return numero_cuenta;
    }

    public void setNumero_cuenta(Double numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }

    public Double getCedula() {
        return cedula;
    }

    public void setCedula(Double cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getIngresos_men() {
        return ingresos_men;
    }

    public void setIngresos_men(Double ingresos_men) {
        this.ingresos_men = ingresos_men;
    }

    public Double getMonto_pedir() {
        return monto_pedir;
    }

    public void setMonto_pedir(Double monto_pedir) {
        this.monto_pedir = monto_pedir;
    }
    
    
    
    
}
