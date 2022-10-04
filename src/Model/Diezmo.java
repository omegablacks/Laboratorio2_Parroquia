/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author kevin
 */
public class Diezmo{
    private String codigo;
    protected int valor;
    private String anio;

    public Diezmo() {
    }

    public Diezmo(String codigo, int valor, String anio) {
        this.codigo = codigo;
        this.valor = valor;
        this.anio = anio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public int TotalDiezmo(){
        int TotalDiezmo=0;
        TotalDiezmo=TotalDiezmo+this.valor;
        return TotalDiezmo;
    }    
            
}
