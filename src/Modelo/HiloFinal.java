/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.awt.Color;
import java.awt.Menu;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class HiloFinal extends Thread {

    JLabel pruibe;
    JButton btnHilo1;
    JButton btnRegresar;
    JButton btnRepor;
    JLabel JLRepeticiones;
    int contador = 0;
    int vecesRepetidas = 0;
    //iniciarlizar el cronocmetro
    private CronometroHilo crono;

    FrmMenuInicial menu = new FrmMenuInicial();

    public HiloFinal(JButton btnHilo1, JLabel btnRpes, JButton btnRegresar, JButton btnRepor, CronometroHilo crono) {
        this.btnHilo1 = btnHilo1;
        this.JLRepeticiones = btnRpes;
        this.btnRegresar = btnRegresar;
        this.btnRepor = btnRepor;
        this.crono = crono;

    }

    @Override
    public void run() {

        while (contador != 30) {

            contador++;
            try {

                btnHilo1.setBackground(Color.RED);
                vecesRepetidas++;
                JLRepeticiones.setText(String.valueOf(vecesRepetidas));

                if (contador == 30) {
                    btnRegresar.setEnabled(true);
                    btnRepor.setEnabled(true);
                    crono.stop();
                    break;
                }
                sleep(Integer.parseInt(menu.registros.get(3).getTiempo()) * 1000 + Integer.parseInt(menu.registros.get(2).getTiempo()) * 1000 + Integer.parseInt(menu.registros.get(0).getTiempo()) * 1000 + Integer.parseInt(menu.registros.get(1).getTiempo()) * 1000 + 1000);

            } catch (InterruptedException ex) {
                Logger.getLogger(HiloInicio.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
