/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marylove.models;

/**
 *
 * @author Danny
 */
public class x_detalle_violencia {
    
    private int detalle_codigo;
    private int registroagresor_codigo;
    private int caracteristica_id;
    private String caracteristica_otra;

    public x_detalle_violencia() {
    }

    public x_detalle_violencia(int registroagresor_codigo, int caracteristica_id, String caracteristica_otra) {
        this.registroagresor_codigo = registroagresor_codigo;
        this.caracteristica_id = caracteristica_id;
        this.caracteristica_otra = caracteristica_otra;
    }
    


    public String getCaracteristica_otra() {
        return caracteristica_otra;
    }

    public void setCaracteristica_otra(String caracteristica_otra) {
        this.caracteristica_otra = caracteristica_otra;
    }
    
    public int getDetalle_codigo() {
        return detalle_codigo;
    }

    public void setDetalle_codigo(int detalle_codigo) {
        this.detalle_codigo = detalle_codigo;
    }

    public int getRegistroagresor_codigo() {
        return registroagresor_codigo;
    }

    public void setRegistroagresor_codigo(int registroagresor_codigo) {
        this.registroagresor_codigo = registroagresor_codigo;
    }

    public int getCaracteristica_id() {
        return caracteristica_id;
    }

    public void setCaracteristica_id(int caracteristica_id) {
        this.caracteristica_id = caracteristica_id;
    }
    
    
}
