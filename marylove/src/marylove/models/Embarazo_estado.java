/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marylove.models;

/**
 *
 * @author Asus
 */
public class Embarazo_estado {
   private int embarazo_id;
   private int victima_codigo;
   private boolean embarazo_planificado;
   private String embarazo_reaccion_padre;
   private String embarazo_reaccion_madre;

    public Embarazo_estado(int embarazo_id, int victima_codigo, boolean embarazo_planificado, String embarazo_reaccion_padre, String embarazo_reaccion_madre) {
        this.embarazo_id = embarazo_id;
        this.victima_codigo = victima_codigo;
        this.embarazo_planificado = embarazo_planificado;
        this.embarazo_reaccion_padre = embarazo_reaccion_padre;
        this.embarazo_reaccion_madre = embarazo_reaccion_madre;
    }

    public Embarazo_estado() {
    }

    public Embarazo_estado(int victima_codigo, boolean embarazo_planificado, String embarazo_reaccion_padre, String embarazo_reaccion_madre) {
        this.victima_codigo = victima_codigo;
        this.embarazo_planificado = embarazo_planificado;
        this.embarazo_reaccion_padre = embarazo_reaccion_padre;
        this.embarazo_reaccion_madre = embarazo_reaccion_madre;
    }

    public int getEmbarazo_id() {
        return embarazo_id;
    }

    public void setEmbarazo_id(int embarazo_id) {
        this.embarazo_id = embarazo_id;
    }

    public int getVictima_codigo() {
        return victima_codigo;
    }

    public void setVictima_codigo(int victima_codigo) {
        this.victima_codigo = victima_codigo;
    }

    public boolean isEmbarazo_planificado() {
        return embarazo_planificado;
    }

    public void setEmbarazo_planificado(boolean embarazo_planificado) {
        this.embarazo_planificado = embarazo_planificado;
    }

    public String getEmbarazo_reaccion_padre() {
        return embarazo_reaccion_padre;
    }

    public void setEmbarazo_reaccion_padre(String embarazo_reaccion_padre) {
        this.embarazo_reaccion_padre = embarazo_reaccion_padre;
    }

    public String getEmbarazo_reaccion_madre() {
        return embarazo_reaccion_madre;
    }

    public void setEmbarazo_reaccion_madre(String embarazo_reaccion_madre) {
        this.embarazo_reaccion_madre = embarazo_reaccion_madre;
    }
   
   
}