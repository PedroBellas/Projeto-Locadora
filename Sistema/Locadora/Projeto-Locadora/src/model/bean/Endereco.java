package model.bean;

/**
 *
 * @author Bellas
 */
public class Endereco {
    
    private int codigo;
    private String nome;
    private String cep;
    private Bairro bairro;
    
//<editor-fold defaultstate="collapsed" desc="Contrutores">

    public Endereco(int codigo, String nome, String cep, Bairro bairro) {
        this.codigo = codigo;
        this.nome = nome;
        this.cep = cep;
        this.bairro = bairro;
    }
    
    public Endereco(String nome, String cep, Bairro bairro) {
        this.nome = nome;
        this.cep = cep;
        this.bairro = bairro;
    }
    
    public Endereco() {
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

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }
    
//</editor-fold>
    
}
