package marylove.models;

/**
 *
 * @author icrv9
 */
public class Sueno_control_esfin {

    private int sucoes_id;
    private boolean duerme_toda_noche;
    private boolean miedo_dormir_solo;
    private String despertar_descripcion;
    private boolean pesadillas;
    private int edad_control_esfinter;
    private boolean ayuda_bano;
    private boolean moja_cama;
    private String periodo_ecopresis_descrip;
    private boolean periodo_ecopresis;
    private String como_es_sueno;
    private String acompanamiento_dormir;

    public Sueno_control_esfin() {
    }

    public Sueno_control_esfin(boolean duerme_toda_noche, boolean miedo_dormir_solo, String despertar_descripcion, boolean pesadillas, int edad_control_esfinter, boolean ayuda_bano, boolean moja_cama, String periodo_ecopresis_descrip, boolean periodo_ecopresis, String como_es_sueno, String acompanamiento_dormir) {
        this.duerme_toda_noche = duerme_toda_noche;
        this.miedo_dormir_solo = miedo_dormir_solo;
        this.despertar_descripcion = despertar_descripcion;
        this.pesadillas = pesadillas;
        this.edad_control_esfinter = edad_control_esfinter;
        this.ayuda_bano = ayuda_bano;
        this.moja_cama = moja_cama;
        this.periodo_ecopresis_descrip = periodo_ecopresis_descrip;
        this.periodo_ecopresis = periodo_ecopresis;
        this.como_es_sueno = como_es_sueno;
        this.acompanamiento_dormir = acompanamiento_dormir;
    }

    public Sueno_control_esfin(int sucoes_id, boolean duerme_toda_noche, boolean miedo_dormir_solo, String despertar_descripcion, boolean pesadillas, int edad_control_esfinter, boolean ayuda_bano, boolean moja_cama, String periodo_ecopresis_descrip, boolean periodo_ecopresis, String como_es_sueno, String acompanamiento_dormir) {
        this.sucoes_id = sucoes_id;
        this.duerme_toda_noche = duerme_toda_noche;
        this.miedo_dormir_solo = miedo_dormir_solo;
        this.despertar_descripcion = despertar_descripcion;
        this.pesadillas = pesadillas;
        this.edad_control_esfinter = edad_control_esfinter;
        this.ayuda_bano = ayuda_bano;
        this.moja_cama = moja_cama;
        this.periodo_ecopresis_descrip = periodo_ecopresis_descrip;
        this.periodo_ecopresis = periodo_ecopresis;
        this.como_es_sueno = como_es_sueno;
        this.acompanamiento_dormir = acompanamiento_dormir;
    }

    public int getSucoes_id() {
        return sucoes_id;
    }

    public void setSucoes_id(int sucoes_id) {
        this.sucoes_id = sucoes_id;
    }

    public boolean isDuerme_toda_noche() {
        return duerme_toda_noche;
    }

    public void setDuerme_toda_noche(boolean duerme_toda_noche) {
        this.duerme_toda_noche = duerme_toda_noche;
    }

    public boolean isMiedo_dormir_solo() {
        return miedo_dormir_solo;
    }

    public void setMiedo_dormir_solo(boolean miedo_dormir_solo) {
        this.miedo_dormir_solo = miedo_dormir_solo;
    }

    public String getDespertar_descripcion() {
        return despertar_descripcion;
    }

    public void setDespertar_descripcion(String despertar_descripcion) {
        this.despertar_descripcion = despertar_descripcion;
    }

    public boolean isPesadillas() {
        return pesadillas;
    }

    public void setPesadillas(boolean pesadillas) {
        this.pesadillas = pesadillas;
    }

    public int getEdad_control_esfinter() {
        return edad_control_esfinter;
    }

    public void setEdad_control_esfinter(int edad_control_esfinter) {
        this.edad_control_esfinter = edad_control_esfinter;
    }

    public boolean isAyuda_bano() {
        return ayuda_bano;
    }

    public void setAyuda_baño(boolean ayuda_baño) {
        this.ayuda_bano = ayuda_baño;
    }

    public boolean isMoja_cama() {
        return moja_cama;
    }

    public void setMoja_cama(boolean moja_cama) {
        this.moja_cama = moja_cama;
    }

    public String getPeriodo_ecopresis_descrip() {
        return periodo_ecopresis_descrip;
    }

    public void setPeriodo_ecopresis_descrip(String periodo_ecopresis_descrip) {
        this.periodo_ecopresis_descrip = periodo_ecopresis_descrip;
    }

    public boolean isPeriodo_ecopresis() {
        return periodo_ecopresis;
    }

    public void setPeriodo_ecopresis(boolean periodo_ecopresis) {
        this.periodo_ecopresis = periodo_ecopresis;
    }

    public String getComo_es_sueno() {
        return como_es_sueno;
    }

    public void setComo_es_sueno(String como_es_sueno) {
        this.como_es_sueno = como_es_sueno;
    }

    public String getAcompanamiento_dormir() {
        return acompanamiento_dormir;
    }

    public void setAcompanamiento_dormir(String acompanamiento_dormir) {
        this.acompanamiento_dormir = acompanamiento_dormir;
    }

}
