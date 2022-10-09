/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Control.Control;
import Vista.Vista;

/**
 *
 * @author kevin
 */

public class Principal {
    public static void main(String[] args) {
        Vista vista= new Vista();
        Feligres f= new Feligres();
        Iglesia i= new Iglesia();
        Control control = new  Control(vista, f, i);
        vista.setVisible(true);
    }
    
}
