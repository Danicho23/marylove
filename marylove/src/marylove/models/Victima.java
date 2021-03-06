package marylove.models;
public class Victima extends Persona{
    private int victima_codigo;
    private int persona_codigo;
    private boolean victima_estado;

    public Victima(int victima_codigo, int persona_codigo, boolean victima_estado) {
        this.victima_codigo = victima_codigo;
        this.persona_codigo = persona_codigo;
        this.victima_estado = victima_estado;
    }

    public Victima(int persona_codigo, boolean victima_estado) {
        this.persona_codigo = persona_codigo;
        this.victima_estado = victima_estado;
    }
    

  
    public Victima() {
    }

    public boolean isVictima_estado() {
        return victima_estado;
    }

    public void setVictima_estado(boolean victima_estado) {
        this.victima_estado = victima_estado;
    }

    public int getPersona_codigo() {
        return persona_codigo;
    }

    public void setPersona_codigo(int persona_codigo) {
        this.persona_codigo = persona_codigo;
    }
    
    public int getVictima_codigo() {
        return victima_codigo;
    }

    public void setVictima_codigo(int victima_codigo) {
        this.victima_codigo = victima_codigo;
    }


    
}
