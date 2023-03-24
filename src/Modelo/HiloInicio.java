/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Usuario
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.*;

public class HiloInicio extends Thread {

    JLabel pruibe;
    JButton btnHilo1;
    JLabel JLRepeticiones;
    int contador = 0;
    int vecesRepetidas = 30;

    public HiloInicio(JButton btnHilo1, JLabel btnRpes) {
        this.btnHilo1 = btnHilo1;
        this.JLRepeticiones = btnRpes;
    }

    @Override
    public void run() {
        while (contador != 30) {

            contador++;
            try {

                vecesRepetidas--;
                JLRepeticiones.setText(String.valueOf(vecesRepetidas));
                if (contador % 2 != 0) {
                    btnHilo1.setBackground(Color.RED);

                } else {
                    btnHilo1.setBackground(Color.WHITE);
                }
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloInicio.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
