package model.bean;

/**
 *
 * @author Bellas
 */
public class Cidade {
    
    private int codigo;
    private String nome;

//<editor-fold defaultstate="collapsed" desc="Contrutores">

    public Cidade(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }
       
    public Cidade(String nome) {
        this.nome = nome;
    }
    
    public Cidade() {
    }
    
    
//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="Metodos de acesso">
    
    public int getCodigo() {
        return codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
//</editor-fold>
    
    
    
}
