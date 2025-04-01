
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 31158
 */

public class Cuenta {
    String tipo;
    Float monto;
    ArrayList<mov> movimientos;
    
  
    public Cuenta(String tipo, Float monto ) {
        this.tipo=tipo;
        this.monto=monto;
        this.movimientos = new ArrayList<>();
    }
    
    
    
    public Cuenta() {
        movimientos=new ArrayList<mov>();
    }

    public void addmov(mov m){
        movimientos.add(m);
    
    }
    
    
    public ArrayList<mov> getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(ArrayList<mov> movimientos) {
        this.movimientos = movimientos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Float getMonto() {
        return monto;
    }

    public void setMonto(Float monto) {
        this.monto = monto;
    }
    
    
}
