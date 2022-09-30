
package Model;


public class Feligres {
    
private String cedula;
private String nombre;
private String direccion;
private String telefono;
private byte estrato;
private String estado;
private double diezmo;

    public Feligres() {
    }

    public Feligres(String cedula, String nombre, String direccion, String telefono, byte estrato, String estado, double diezmo) {
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

    public byte getEstrato() {
        return estrato;
    }
    public void setEstrato(byte estrato) {
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




}
