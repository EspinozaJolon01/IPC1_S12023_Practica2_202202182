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
public class InventarioDesapa extends Thread {

    JLabel JlConteoInventarioEnInventario;
    JLabel JLRepeticiones;

    int numerosDePelotitas = 30;
    int nConteo = 0;

    JButton botones;

    ArrayList<JButton> boton;
    FrmMenuInicial menu = new FrmMenuInicial();

    public InventarioDesapa(ArrayList<JButton> boton, JLabel JlConteoInventarioEnInventario, JLabel JLRepeticiones) {
        this.boton = boton;
        this.JlConteoInventarioEnInventario = JlConteoInventarioEnInventario;
        this.JLRepeticiones = JLRepeticiones;
    }

    @Override
    public void run() {
        //     while (contadores.contador1 != 30) {

        try {
            sleep(1000);

            for (int i = 0; i < 30; i++) {
                sleep(Integer.parseInt(menu.registros.get(0).getTiempo()) * 1000);
                boton.get(i).setBackground(Color.WHITE);
                numerosDePelotitas--;
                nConteo--;

                JlConteoInventarioEnInventario.setText(String.valueOf(numerosDePelotitas));

                //    if (Integer.parseInt(JLRepeticiones.getText()) != 0) {
                //      sleep(Integer.parseInt(menu.registros.get(0).getTiempo()) * 1000 );
                //     } else {
                //  }
                System.out.println("Inve" + Integer.parseInt(menu.registros.get(0).getTiempo()) * 1000 + 1000);
            }

        } catch (InterruptedException ex) {
            Logger.getLogger(HiloInicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        //       }

    }

}
