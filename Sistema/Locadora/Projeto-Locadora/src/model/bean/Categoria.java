package model.bean;

/**
 *
 * @author Bellas
 */
public class Categoria {
    
    private int codigo;
    private String nome;
    
//<editor-fold defaultstate="collapsed" desc="Construtores">
    
    public Categoria() {
    }
    
    public Categoria(String nome) {
        this.nome = nome;
    }
    
    public Categoria(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
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
