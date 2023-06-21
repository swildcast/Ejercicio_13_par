
package pjbanco;

import java.util.ArrayList;


public class Cuenta 
{
    private String tipoCuenta,numeroCuenta;
    private double montoInicial;
    ArrayList<Movimiento> misMovimientos;
    
    public Cuenta() 
    {
        misMovimientos = new ArrayList<Movimiento>();
    }
    public void addMovimiento(Movimiento m)
    {
        misMovimientos.add(m);
    }
            
            
    public Cuenta(String tipoCuenta, double montoInicial, ArrayList<Movimiento> misMovimientos) {
        this.tipoCuenta = tipoCuenta;
        this.montoInicial = montoInicial;
        this.misMovimientos = misMovimientos;
    }

    public ArrayList<Movimiento> getMisMovimientos() {
        return misMovimientos;
    }

    public void setMisMovimientos(ArrayList<Movimiento> misMovimientos) {
        this.misMovimientos = misMovimientos;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public double getMontoInicial() {
        return montoInicial;
    }

    public void setMontoInicial(double montoInicial) {
        this.montoInicial = montoInicial;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    
}
