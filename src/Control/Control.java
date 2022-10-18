/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Model.Feligres;
import Model.Iglesia;
import Vista.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javafx.fxml.FXML;


public class Control implements ActionListener{
    private Vista vista;
    private Feligres f;
    private Iglesia i;

    public Control(Vista vista, Feligres f, Iglesia i) {
        this.vista = vista;
        this.f = f;
        this.i = i;
        ActionListener(this);
    }
    
    void jbGuardar(ActionEvent e) {
    	f.setCedula(vista.txtCedula.getText());
        f.setNombre(vista.txtNombre.getText());
        f.setDireccion(vista.txtDireccion.getText());
        f.setTelefono(vista.txtTelefono.getText());
        f.setEstrato(vista.txtEstrato.getText());
        f.setEstado(vista.txtEstado.getText());
        f= new Feligres(f.getCedula(), f.getNombre(), f.getDireccion(), f.getTelefono(), f.getEstrato(), f.getEstado());
        i.agregarFeligres(f);
        System.out.println("----------");
    }
    
    /*@FXML
    void jbBuscar(ActionEvent e) {
    	Feligres feli= i.buscarFeligres(vista.txtCedula.getText());
            vista.txtNombre.setText(feli.getNombre());
            vista.txtTelefono.setText(feli.getTelefono());
            vista.txtEstrato.setText(feli.getEstrato());
            vista.txtEstado.setText(feli.getEstado());
            vista.txtDireccion.setText(feli.getDireccion());
    }*/

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Guardar")){
        f.setCedula(vista.txtCedula.getText());
        f.setNombre(vista.txtNombre.getText());
        f.setDireccion(vista.txtDireccion.getText());
        f.setTelefono(vista.txtTelefono.getText());
        f.setEstrato(vista.txtEstrato.getText());
        f.setEstado(vista.txtEstado.getText());
        Feligres fe= new Feligres(f.getCedula(), f.getNombre(), f.getDireccion(), f.getTelefono(), f.getEstrato(), f.getEstado());
        i.agregarFeligres(fe);
        System.out.println("Guardado");
        }
        if(e.getActionCommand().equals("Buscar")){
            Feligres feli= i.buscarFeligres(vista.txtCedula.getText());
            vista.txtNombre.setText(feli.getNombre());
            vista.txtTelefono.setText(feli.getTelefono());
            vista.txtEstrato.setText(feli.getEstrato());
            vista.txtEstado.setText(feli.getEstado());
            vista.txtDireccion.setText(feli.getDireccion());
            
        }
        if(e.getActionCommand().equals("Consultar")){
            Feligres feli= i.buscarFeligres(vista.txtCedula1.getText());
            String diezmo= String.valueOf(feli.getDiezmo());
            vista.txtValorDiesmo.setText(diezmo);
            
        }
        if(e.getActionCommand().equals("Pagar")){
            Feligres feli=i.buscarFeligres(vista.txtCedula1.getText());
            vista.jTextArea1.setText(feli.pagarDiezmo());
        }
        if(e.getActionCommand().equals("Totalizar")){
            vista.jTextArea1.setText(f.totalizar(vista.txtCedula1.getText()));
        }
        if(e.getActionCommand().equals("Eliminar")){
            i.eliminarFeligres(vista.txtCedula.getText());
        }
        if(e.getActionCommand().equals("Actualizar")){
            Feligres feli= i.buscarFeligres(vista.txtCedula.getText());
            String cedula=vista.txtCedula.getText();
            String nombre=vista.txtNombre.getText();
            String direccion=vista.txtDireccion.getText();
            String telefono=vista.txtTelefono.getText();
            String estrato=vista.txtEstrato.getText();
            String estado=vista.txtEstado.getText();
            feli.actualizarDatos(cedula, nombre, direccion, telefono, estrato, estado);
            
        }
    }
      

    private void ActionListener(Control control) {
        vista.jbGuardar.addActionListener(control);
        vista.jbBuscar.addActionListener(control);
        vista.jbConsultar.addActionListener(control);
        vista.jbTotalizar.addActionListener(control);
        vista.jbPagar.addActionListener(control);
        vista.jbEliminar.addActionListener(control);
        vista.jbActualizar.addActionListener(control);
    } 
}
