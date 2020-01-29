package marylove.models;

public class InstitucionEducativa {

    private int inst_codigo;
    private String inst_nombre;
    private String inst_telefono;
    private String inst_tipo;
    private int dir_codigo;

    public InstitucionEducativa() {
    }

    public InstitucionEducativa(int inst_codigo, String inst_nombre, String inst_telefono, String inst_tipo, int dir_codigo) {
        this.inst_codigo = inst_codigo;
        this.inst_nombre = inst_nombre;
        this.inst_telefono = inst_telefono;
        this.inst_tipo = inst_tipo;
        this.dir_codigo = dir_codigo;
    }

    public int getInst_codigo() {
        return inst_codigo;
    }

    public void setInst_codigo(int inst_codigo) {
        this.inst_codigo = inst_codigo;
    }

    public String getInst_nombre() {
        return inst_nombre;
    }

    public void setInst_nombre(String inst_nombre) {
        this.inst_nombre = inst_nombre;
    }

    public String getInst_telefono() {
        return inst_telefono;
    }

    public void setInst_telefono(String inst_telefono) {
        this.inst_telefono = inst_telefono;
    }

    public String getInst_tipo() {
        return inst_tipo;
    }

    public void setInst_tipo(String inst_tipo) {
        this.inst_tipo = inst_tipo;
    }

    public int getDir_codigo() {
        return dir_codigo;
    }

    public void setDir_codigo(int dir_codigo) {
        this.dir_codigo = dir_codigo;
    }

    
}
