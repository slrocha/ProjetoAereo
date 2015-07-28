
package projetoaereo;

import java.util.ArrayList;

public class Companhia {
    private String nome;
    private String cnpj;
    private final ArrayList<Aeronave> aeronave = new ArrayList<>();

    public Companhia(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
}
