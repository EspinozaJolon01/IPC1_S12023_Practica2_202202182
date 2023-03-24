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

    JLabel JlConteoInventario;
    int numerosDePelotitas = 0;
    int nConteo = 0;

    JButton botones;
    ArrayList<JButton> boton;
    FrmMenuInicial menu = new FrmMenuInicial();

    public Empaquetado(ArrayList<JButton> boton, JLabel JlConteoInventario) {
        this.boton = boton;
        this.JlConteoInventario = JlConteoInventario;
    }

    @Override
    public void run() {
        //   while (nConteo != 30) {

        try {

            for (int i = 0; i < 30; i++) {

                boton.get(i).setBackground(Color.ORANGE);
                numerosDePelotitas++;
                nConteo++;
                JlConteoInventario.setText(String.valueOf(numerosDePelotitas));
                sleep(Integer.parseInt(menu.registros.get(1).getTiempo()) * 1000 + Integer.parseInt(menu.registros.get(0).getTiempo()) * 1000 + 1000);
                System.out.println("empaI" + Integer.parseInt(menu.registros.get(1).getTiempo()) * 1000 + Integer.parseInt(menu.registros.get(0).getTiempo()) * 1000 + 1000);
            }

        } catch (InterruptedException ex) {
            Logger.getLogger(HiloInicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        //  }

    }
}
