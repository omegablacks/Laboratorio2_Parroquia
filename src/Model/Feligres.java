
package Model;

import java.util.Objects;


public class Feligres {
    
private String cedula;
private String nombre;
private String direccion;
private String telefono;
private double estrato;
private String estado;
private double diezmo;

    public Feligres() {
    }

    public Feligres(String cedula, String nombre, String direccion, String telefono, double estrato, String estado, double diezmo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.estrato = estrato;
        this.estado = estado;
        this.diezmo = diezmo;
    }

    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getEstrato() {
        return estrato;
    }
    public void setEstrato(double estrato) {
        this.estrato = estrato;
    }

    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getDiezmo() {
        return diezmo;
    }
    public void setDiezmo(double diezmo) {
        this.diezmo = diezmo;
    }

    @Override
    public String toString() {
        return "Feligres{" + "cedula=" + cedula + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + ", estrato=" + estrato + ", estado=" + estado + ", diezmo=" + diezmo + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        Feligres f = (Feligres) obj;
		
        if(this.getCedula().equals(f.getCedula()) && this.getNombre().equals(f.getNombre()) && this.getDireccion().equals(f.getDireccion()) && this.getTelefono().equals(f.getTelefono()) && 
                this.getEstrato()== f.getEstrato() && this.getEstado().equals(f.getEstado()) && this.getDiezmo()== f.getDiezmo() ) {
            return true;
        }
        return false;
    }
    
    

    public void asignarDiezmo(){
        if (estrato==1){
            diezmo=250000;
        }
        else if(estrato==2 || estrato==3){
            diezmo=500000;
        }
        else if(estrato>3){
            diezmo=1000000;
        }
        else{
            System.out.print("El estrato tiene que ser superior a 0");
        }
    }
    
    public void consultarDiezmo(String cedula){
        
    }


}
