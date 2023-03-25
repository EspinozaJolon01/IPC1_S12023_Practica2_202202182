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
public class EmpaqueteDesapa extends Thread {

    JLabel jLEmpaqueteTiem;
    int numerosDePelotitas = 30;
    int nConteo = 0;

    ArrayList<JButton> buton;
    FrmMenuInicial menu = new FrmMenuInicial();

    public EmpaqueteDesapa(ArrayList<JButton> buton, JLabel jLEmpaqueteTiem) {
        this.buton = buton;
        this.jLEmpaqueteTiem = jLEmpaqueteTiem;
    }

    @Override
    public void run() {

        //  while (nConteo != 30) {
        try {

            for (int i = 0; i < 30; i++) {
                sleep(Integer.parseInt(menu.registros.get(2).getTiempo()) * 1000);
                buton.get(i).setBackground(Color.WHITE);
                nConteo++;
                numerosDePelotitas--;
                jLEmpaqueteTiem.setText(String.valueOf(numerosDePelotitas));

               
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(ProduccionDespa.class.getName()).log(Level.SEVERE, null, ex);
        }

        //   }
    }

}
