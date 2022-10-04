
package Model;

public class Feligres{
    private String cedula;
    private String nombre;
    private String direccion;
    private String telefono;
    private int estrato;
    private String estado;
    private int valor;
    
    int totalDiezmo=0;
    int diezmoPagado=0;
    int deuda;
    int contador=0;

    public Feligres() {
    }

    public Feligres(String cedula, String nombre, String direccion, String telefono, int estrato, String estado, int valor) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.estrato = estrato;
        this.estado = estado;
        this.valor=valor;
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

    public int getEstrato() {
        return estrato;
    }

    public void setEstrato(int estrato) {
        this.estrato = estrato;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public void controlDiezmos(){
        if (estrato==1){
            valor=250000;
            System.out.println(valor);
        } else if (estrato==2 || estrato==3) {
            valor=500000;
            System.out.println(valor);

        } else if (estrato>3){
            valor=1000000; 
            System.out.println(valor);
        }else System.out.print("El Estrato Debe Ser Mayor A 0");
    }
    
    public int totalDiezmo(){
        totalDiezmo = totalDiezmo+ valor;
        return totalDiezmo;
    }
    
    public int totalDiezmoPagado(){
        totalDiezmo = totalDiezmo+ valor;
        return totalDiezmo;
    }
    
    public int totalDiezmoDeuda(){
        
        return deuda;
    }
    
}