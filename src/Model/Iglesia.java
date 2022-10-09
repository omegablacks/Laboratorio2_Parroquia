/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author kevin
 */
public class Iglesia {

    private ArrayList<Feligres> feligres;

    public Iglesia() {
        feligres = new ArrayList<>();
    }

    public void agregarFeligres(Feligres f) {
        f.validarDiesmo();
        feligres.add(f);
    }

    public Feligres buscarFeligres(String cedula) {
        Feligres f = new Feligres();
        for (int i = 0; i < feligres.size(); i++) {
            if (feligres.get(i).getCedula().equals(cedula)) {
                f = feligres.get(i);
            }
        }
        return f;
    }

    public void eliminarFeligres(String cedula) {

        for (int i = 0; i < feligres.size(); i++) {
            if (feligres.get(i).getCedula().equals(cedula)) {
                feligres.remove(i);

            }
        }

    }

    public String imprimir() {
        StringBuffer sb = new StringBuffer("Feligreses: \n");
        for (int i = 0; i < feligres.size(); i++) {
            sb.append(feligres.get(i).toString() + "\n");
        }
        return sb.toString();
    }

}
