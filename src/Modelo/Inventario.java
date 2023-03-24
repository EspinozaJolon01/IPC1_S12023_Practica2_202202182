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
public class Inventario extends Thread {

    JLabel JlConteoInventario;
    int numerosDePelotitas = 0;
    int nConteo = 0;

    JButton botones;
    ArrayList<JButton> boton;

    public Inventario(ArrayList<JButton> boton, JLabel JlConteoInventario) {
        this.boton = boton;
        this.JlConteoInventario = JlConteoInventario;
    }

    @Override
    public void run() {

        while (nConteo != 30) {
            try {

                for (int i = 0; i < 30; i++) {

                    boton.get(i).setBackground(Color.BLUE);
                    numerosDePelotitas++;
                    
                    nConteo++;
                    JlConteoInventario.setText(String.valueOf(numerosDePelotitas));
                    sleep(1000);

                }

            } catch (InterruptedException ex) {
                Logger.getLogger(HiloInicio.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
