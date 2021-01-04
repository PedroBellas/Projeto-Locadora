package model.bean;

/**
 *
 * @author Bellas
 */
public class Avalicao {
    
    private int codigo;
    private int nota;
    private boolean ativo;
    private String data;
    private Filme filme;
    private Usuario usuario;
    
//<editor-fold defaultstate="collapsed" desc="Construtores">
    
    public Avalicao() {
    }
    
    public Avalicao(int nota, boolean ativo, String data, Filme filme, Usuario usuario) {
        this.nota = nota;
        this.ativo = ativo;
        this.data = data;
        this.filme = filme;
        this.usuario = usuario;
    }
    
    public Avalicao(int codigo, int nota, boolean ativo, String data, Filme filme, Usuario usuario) {
        this.codigo = codigo;
        this.nota = nota;
        this.ativo = ativo;
        this.data = data;
        this.filme = filme;
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
    
    public int getNota() {
        return nota;
    }
    
    public void setNota(int nota) {
        this.nota = nota;
    }
    
    public boolean isAtivo() {
        return ativo;
    }
    
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    
    public String getData() {
        return data;
    }
    
    public void setData(String data) {
        this.data = data;
    }
    
    public Filme getFilme() {
        return filme;
    }
    
    public void setFilme(Filme filme) {
        this.filme = filme;
    }
    
    public Usuario getUsuario() {
        return usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
//</editor-fold>
    
}
