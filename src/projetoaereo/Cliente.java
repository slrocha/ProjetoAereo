
package projetoaereo;


public class Cliente {
    private String nome;
    private String cpf;
    private String dtNasc;

    public Cliente() {
        
    }
      
    public Cliente(String nome, String cpf, String dtNasc) {
        this.nome = nome;
        this.cpf = cpf;
        this.dtNasc = dtNasc;
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

    public String getDtNasc() {
        return dtNasc;
    }

    public void setDtNasc(String dtNasc) {
        this.dtNasc = dtNasc;
    }
    
}
