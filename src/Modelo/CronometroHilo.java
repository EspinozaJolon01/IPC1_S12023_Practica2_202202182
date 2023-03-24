/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class CronometroHilo extends Observable implements Runnable {

    javax.swing.JLabel jbTiempo;
    private int horas, minutos, segundos;
    private boolean isRunning = true;

    public CronometroHilo(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public void stop() {
        isRunning = false;
    }

    public boolean isRunning() {
        return isRunning;
    }

    @Override
    public void run() {

        String tiempo;

        while (isRunning) {

            tiempo = "";
            if (horas < 10) {
                tiempo += "0" + horas;
            } else {
                tiempo += horas;
            }

            tiempo += ":";

            if (minutos < 10) {
                tiempo += "0" + minutos;
            } else {
                tiempo += minutos;
            }

            tiempo += ":";

            if (segundos < 10) {
                tiempo += "0" + segundos;
            } else {
                tiempo += segundos;
            }
            this.setChanged();
            this.notifyObservers(tiempo);
            this.clearChanged();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(CronometroHilo.class.getName()).log(Level.SEVERE, null, ex);
            }
            segundos++;

            if (segundos == 60) {
                minutos++;
                segundos = 0;
                if (minutos == 60) {
                    minutos = 0;
                    horas++;
                    if (horas == 24) {
                        horas = 0;
                    }
                }
            }

        }
    }

}
