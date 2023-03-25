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
public class Salida extends Thread {

    JLabel JLSalidaConteo;
    int numerosDePelotitas = 0;
    int nConteo = 0;

    JButton botones;
    ArrayList<JButton> boton;
    FrmMenuInicial menu = new FrmMenuInicial();

    public Salida(ArrayList<JButton> boton, JLabel jLSalidaConteo, int nConteo) {
        this.boton = boton;
        this.JLSalidaConteo = jLSalidaConteo;
        this.nConteo = nConteo;
    }

    @Override
    public void run() {
        //  while (nConteo != 30) {

        try {

            sleep(Integer.parseInt(menu.registros.get(2).getTiempo()) * 1000 + Integer.parseInt(menu.registros.get(1).getTiempo()) * 1000 + Integer.parseInt(menu.registros.get(0).getTiempo()) * 1000);
            contadores.contador4 = contadores.contador4 + 1;
            JLSalidaConteo.setText(String.valueOf(contadores.contador4));
            boton.get(nConteo).setBackground(Color.yellow);
            sleep(Integer.parseInt(menu.registros.get(3).getTiempo()) * 1000);
            contadores.contador4 = contadores.contador4 - 1;
            JLSalidaConteo.setText(String.valueOf(contadores.contador4));
            boton.get(nConteo).setBackground(Color.WHITE);

        } catch (InterruptedException ex) {
            Logger.getLogger(HiloInicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        //  }

    }
}
