package model.bean;

/**
 *
 * @author Bellas
 */
public class Residencia {
    
    private int codigo;
    private String numero;
    private String complemento;
    private Endereco endereco;
    
//<editor-fold defaultstate="collapsed" desc="Construtores">
    
    public Residencia() {
    }
    
    public Residencia(String numero, String complemento, Endereco endereco) {
        this.numero = numero;
        this.complemento = complemento;
        this.endereco = endereco;
    }
    
    public Residencia(int codigo, String numero, String complemento, Endereco endereco) {
        this.codigo = codigo;
        this.numero = numero;
        this.complemento = complemento;
        this.endereco = endereco;
    }
    
//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="Metodos de acesso">
    
    public int getCodigo() {
        return codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public String getNumero() {
        return numero;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public String getComplemento() {
        return complemento;
    }
    
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    
    public Endereco getEndereco() {
        return endereco;
    }
    
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
//</editor-fold>
    
}
