package model.bean;

/**
 *
 * @author Bellas
 */
public class Usuario {
    
    private int codigo;
    private String nome;
    private String cpf;
    private String celular;
    private String ddd;
    private String email;
    private Residencia residencia;
    
//<editor-fold defaultstate="collapsed" desc="Construtores">
    
    public Usuario() {
    }

    public Usuario(String nome, String cpf, String celular, String ddd, String email, Residencia residencia) {
        this.nome = nome;
        this.cpf = cpf;
        this.celular = celular;
        this.ddd = ddd;
        this.email = email;
        this.residencia = residencia;
    }
    
    
    
    public Usuario(int codigo, String nome, String cpf, String celular, String ddd, String email, Residencia residencia) {
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.celular = celular;
        this.ddd = ddd;
        this.email = email;
        this.residencia = residencia;
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
    
    public String getCpf() {
        return cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String getCelular() {
        return celular;
    }
    
    public void setCelular(String celular) {
        this.celular = celular;
    }
    
    public String getDdd() {
        return ddd;
    }
    
    public void setDdd(String ddd) {
        this.ddd = ddd;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public Residencia getResidencia() {
        return residencia;
    }

    public void setResidencia(Residencia residencia) {
        this.residencia = residencia;
    }
    
//</editor-fold>
    
}
