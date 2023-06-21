
package pjbanco;

import java.util.ArrayList;

public class Cliente 
{
    private ArrayList<Cuenta> misCuentas;

    private String nombre,apellidos,telefono,direccion,cedula;

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    public ArrayList<Cuenta> getMisCuentas() {
        return misCuentas;
    }

    public void setMisCuentas(ArrayList<Cuenta> misCuentas) {
        this.misCuentas = misCuentas;
    }

    public Cliente() 
    {
        misCuentas = new ArrayList<Cuenta>();
    }
    
    public void addCuenta(Cuenta c)
    {
        misCuentas.add(c);
    }

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public String getTelefono() 
    {
        return telefono;
    }

    public void setTelefono(String telefono) 
    {
        this.telefono = telefono;
    }

    public String getDireccion() 
    {
        return direccion;
    }

    public void setDireccion(String direccion) 
    {
        this.direccion = direccion;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

  
}
