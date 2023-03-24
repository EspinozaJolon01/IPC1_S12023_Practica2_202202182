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

    JLabel jLTiempoInventarioProduc;
    int numerosDePelotitas = 30;
    int nConteo = 0;

    ArrayList<JButton> buton;
    FrmMenuInicial menu = new FrmMenuInicial();

    public ProduccionDespa(ArrayList<JButton> buton, JLabel jLTiempoInventarioProduc) {
        this.buton = buton;
        this.jLTiempoInventarioProduc = jLTiempoInventarioProduc;
    }

    @Override
    public void run() {

  //      while (nConteo != 30) {

            try {

                for (int i = 0; i < 30; i++) {

                    buton.get(i).setBackground(Color.WHITE);
                    nConteo++;
                    numerosDePelotitas--;
                    jLTiempoInventarioProduc.setText(String.valueOf(numerosDePelotitas));
                    sleep(Integer.parseInt(menu.registros.get(1).getTiempo()) * 1000 + Integer.parseInt(menu.registros.get(0).getTiempo()) * 1000 + 1000);
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(ProduccionDespa.class.getName()).log(Level.SEVERE, null, ex);
            }

     //   }

    }

}
