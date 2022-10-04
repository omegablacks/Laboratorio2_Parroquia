/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.Vista;
/**
 *
 * @author kevin
 */

/**
 *
 * @author estudiante
 */
public class Control {

    Vista vista = new Vista();

    ActionListener al = new ActionListener() {
        public void actionPerformed() {
            System.out.println("Hola");
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    };

}
