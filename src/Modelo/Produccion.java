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
public class Produccion extends Thread {

    JLabel JlConteoInventario;
    JLabel jLTiempoProduccion;
    JLabel JLRepeticiones;
    int numerosDePelotitas = 0;
    int nConteo = 0;

    JButton botones;

    ArrayList<JButton> boton;
    FrmMenuInicial menu = new FrmMenuInicial();

    public Produccion(ArrayList<JButton> boton, JLabel jLTiempoProduccion, JLabel JlConteoInventario, JLabel JLRepeticiones) {
        this.boton = boton;
        this.jLTiempoProduccion = jLTiempoProduccion;
        this.JlConteoInventario = JlConteoInventario;
        this.JLRepeticiones = JLRepeticiones;
    }

    @Override
    public void run() {
        //  while (nConteo != 30) {

        try {
            for (int i = 0; i < 30; i++) {

                boton.get(i).setBackground(Color.PINK);
                numerosDePelotitas++;
                nConteo++;

                if (Integer.parseInt(JlConteoInventario.getText()) != 0 && Integer.parseInt(JLRepeticiones.getText()) != 0) {
                    sleep(Integer.parseInt(menu.registros.get(0).getTiempo()) * 1000 + 1000);
                } else {
                    sleep(Integer.parseInt(menu.registros.get(0).getTiempo()) * 1000);
                }
                jLTiempoProduccion.setText(String.valueOf(numerosDePelotitas));

                System.out.println("produI" + Integer.parseInt(menu.registros.get(0).getTiempo()) * 1000 + 1000);
            }

        } catch (InterruptedException ex) {
            Logger.getLogger(HiloInicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        // }

    }

}
