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
    FrmMenuInicial menu = new FrmMenuInicial();

    public Inventario(ArrayList<JButton> boton, JLabel JlConteoInventario, int nConteo) {
        this.boton = boton;
        this.JlConteoInventario = JlConteoInventario;
        this.nConteo = nConteo;
    }

    @Override
    public void run() {

        try {
            sleep(1000);
            contadores.contador1 = contadores.contador1 + 1;
            JlConteoInventario.setText(String.valueOf(contadores.contador1));
            boton.get(nConteo).setBackground(Color.BLUE);
            sleep(Integer.parseInt(menu.registros.get(0).getTiempo()) * 1000);
            contadores.contador1 = contadores.contador1 - 1;
            JlConteoInventario.setText(String.valueOf(contadores.contador1));
            boton.get(nConteo).setBackground(Color.WHITE);

        } catch (Exception e) {
        }
    }
}
