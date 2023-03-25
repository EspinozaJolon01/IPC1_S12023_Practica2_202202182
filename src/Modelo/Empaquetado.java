/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.awt.Color;
import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author Usuario
 */
public class Empaquetado extends Thread {

    JLabel JLEmpaqueteConteo;
    int numerosDePelotitas = 0;
    int nConteo = 0;

    JButton botones;
    ArrayList<JButton> boton;
    FrmMenuInicial menu = new FrmMenuInicial();

    public Empaquetado(ArrayList<JButton> boton, JLabel jLEmpaqueteConteo, int nConteo) {
        this.boton = boton;
        this.JLEmpaqueteConteo = jLEmpaqueteConteo;
        this.nConteo = nConteo;
    }

    @Override
    public void run() {

        try {

            sleep(Integer.parseInt(menu.registros.get(1).getTiempo()) * 1000 + Integer.parseInt(menu.registros.get(0).getTiempo()) * 1000);
            contadores.contador3 = contadores.contador3 + 1;
            JLEmpaqueteConteo.setText(String.valueOf(contadores.contador3));
            boton.get(nConteo).setBackground(Color.ORANGE);
            sleep(Integer.parseInt(menu.registros.get(2).getTiempo()) * 1000);
            contadores.contador3 = contadores.contador3 - 1;
            JLEmpaqueteConteo.setText(String.valueOf(contadores.contador3));
            boton.get(nConteo).setBackground(Color.WHITE);

        } catch (InterruptedException ex) {
            Logger.getLogger(HiloInicio.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
