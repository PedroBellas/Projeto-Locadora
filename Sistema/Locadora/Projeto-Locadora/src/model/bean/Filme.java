package model.bean;

/**
 *
 * @author Bellas
 */
public class Filme {
    
    private int codigo;
    private String nome;
    private String descricao;
    private String data;
    private Usuario usuario;
    
//<editor-fold defaultstate="collapsed" desc="Construtores">
    
    public Filme() {
    }
    
    public Filme(String nome, Usuario usuario) {
        this.nome = nome;
        this.usuario = usuario;
    }
    
    public Filme(String nome, String descricao, String data, Usuario usuario) {
        this.nome = nome;
        this.descricao = descricao;
        this.data = data;
        this.usuario = usuario;
    }
    
    public Filme(int codigo, String nome, String descricao, String data, Usuario usuario) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.data = data;
        this.usuario = usuario;
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
    
    public String getDescricao() {
        return descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public String getData() {
        return data;
    }
    
    public void setData(String data) {
        this.data = data;
    }
    
    public Usuario getUsuario() {
        return usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
//</editor-fold>
    
}
