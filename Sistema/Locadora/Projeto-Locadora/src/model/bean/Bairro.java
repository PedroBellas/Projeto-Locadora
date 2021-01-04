package model.bean;

/**
 *
 * @author Bellas
 */
public class Bairro {
    
    private int codigo;
    private String nome;
    private Cidade cidade;
    
//<editor-fold defaultstate="collapsed" desc="Contrutres">
    
    public Bairro(String nome, Cidade cidade) {
        this.nome = nome;
        this.cidade = cidade;
    }

    public Bairro(int codigo, String nome, Cidade cidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.cidade = cidade;
    }
    
    public Bairro() {
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
    
    public Cidade getCidade() {
        return cidade;
    }
    
    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
    
//</editor-fold>
    
}
