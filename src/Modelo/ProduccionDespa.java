/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.awt.Color;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author Usuario
 */
public class ProduccionDespa extends Thread {

    JLabel jLTiempoProduccion;
    JLabel JlConteoInventario;
    JLabel JLRepeticiones;
    int numerosDePelotitas = 30;
    int nConteo = 0;

    ArrayList<JButton> buton;
    FrmMenuInicial menu = new FrmMenuInicial();

    public ProduccionDespa(ArrayList<JButton> buton, JLabel jLTiempoProduccion, JLabel JlConteoInventario, JLabel JLRepeticiones) {
        this.buton = buton;
        this.jLTiempoProduccion = jLTiempoProduccion;
        this.JlConteoInventario = JlConteoInventario;
        this.JLRepeticiones = JLRepeticiones;
    }

    @Override
    public void run() {

        //      while (nConteo != 30) {
        try {

            for (int i = 0; i < 30; i++) {

                buton.get(i).setBackground(Color.WHITE);
                nConteo++;
                numerosDePelotitas--;
                jLTiempoProduccion.setText(String.valueOf(numerosDePelotitas));

                if (Integer.parseInt(JlConteoInventario.getText()) != 0 && Integer.parseInt(JLRepeticiones.getText()) != 0) {
                    sleep(Integer.parseInt(menu.registros.get(1).getTiempo()) * 1000 + Integer.parseInt(menu.registros.get(0).getTiempo()) * 1000 + 1000);
                } else if (Integer.parseInt(JlConteoInventario.getText()) != 0) {
                    sleep(Integer.parseInt(menu.registros.get(1).getTiempo()) * 1000 + Integer.parseInt(menu.registros.get(0).getTiempo()) * 1000);
                } else {
                    sleep(Integer.parseInt(menu.registros.get(1).getTiempo()) * 1000);
                }

                System.out.println("ProducF" + Integer.parseInt(menu.registros.get(1).getTiempo()) * 1000 + Integer.parseInt(menu.registros.get(0).getTiempo()) * 1000 + 1000);
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(ProduccionDespa.class.getName()).log(Level.SEVERE, null, ex);
        }

        //   }
    }

}
