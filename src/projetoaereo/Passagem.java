
package projetoaereo;

import java.util.Date;

public class Passagem {
    
    private float valor_real;
    private float valor_ponto;
    private Programacao programacao;

    public Passagem(float valor_real, float valor_ponto) {
        this.valor_real = valor_real;
        this.valor_ponto = valor_ponto;

    }
    
     public float getValor_real() {
        return valor_real;
    }

    public void setValor_real(float valor_real) {
        this.valor_real = valor_real;
    }

    public float getValor_ponto() {
        return valor_ponto;
    }

    public void setValor_ponto(float valor_ponto) {
        this.valor_ponto = valor_ponto;
    }

}
