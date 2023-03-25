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
    JLabel JLTiempoProduccion;
    JLabel JLRepeticiones;
    int numerosDePelotitas = 0;
    int nConteo = 0;

    JButton botones;

    ArrayList<JButton> boton;
    FrmMenuInicial menu = new FrmMenuInicial();

    public Produccion(ArrayList<JButton> boton, JLabel jLTiempoProduccions, int nConteo) {
        this.boton = boton;
        this.JLTiempoProduccion = jLTiempoProduccions;

        this.nConteo = nConteo;
    }

    @Override
    public void run() {

        try {

            sleep(Integer.parseInt(menu.registros.get(0).getTiempo()) * 1000);
            contadores.contador2 = contadores.contador2 + 1;
            JLTiempoProduccion.setText(String.valueOf(contadores.contador2));
            boton.get(nConteo).setBackground(Color.PINK);
            sleep(Integer.parseInt(menu.registros.get(1).getTiempo()) * 1000);
            contadores.contador2 = contadores.contador2 - 1;
            JLTiempoProduccion.setText(String.valueOf(contadores.contador2));
            boton.get(nConteo).setBackground(Color.WHITE);

        } catch (InterruptedException ex) {
            Logger.getLogger(HiloInicio.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
