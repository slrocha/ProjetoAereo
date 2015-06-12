
package projetoaereo;

import java.util.Date;

public class Cliente {
    private String nome;
    private String cpf;
    private Date dtNasc;

    
    public Cliente(String nome, String cpf, Date dtNasc) {
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

    public Date getDtNasc() {
        return dtNasc;
    }

    public void setDtNasc(Date dtNasc) {
        this.dtNasc = dtNasc;
    }
    
}
