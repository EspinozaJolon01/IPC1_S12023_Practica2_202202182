/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class RegistroDao {

    private String registro;
    private String tiempo;
    private String costo;

    public RegistroDao(String registro, String tiempo, String costo) {
        this.registro = registro;
        this.tiempo = tiempo;
        this.costo = costo;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "registroDao{" + "registro=" + registro + ", tiempo=" + tiempo + ", costo=" + costo + '}';
    }

}
