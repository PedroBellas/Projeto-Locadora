package model.bean;

/**
 *
 * @author miuti
 */
public class Categoria_filme {

    private Categoria categoria;
    private Filme filme;
    
//<editor-fold defaultstate="collapsed" desc="Construtores">
    
    public Categoria_filme() {
    }
    
    public Categoria_filme(Categoria categoria, Filme filme) {
        this.categoria = categoria;
        this.filme = filme;
    }
    
//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="Metodos de acesso">
    
    public Categoria getCategoria() {
        return categoria;
    }
    
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    public Filme getFilme() {
        return filme;
    }
    
    public void setFilme(Filme filme) {
        this.filme = filme;
    }
    
//</editor-fold>
    
}
