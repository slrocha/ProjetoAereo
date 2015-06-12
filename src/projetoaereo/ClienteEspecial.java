
package projetoaereo;
import java.util.Date;

public class ClienteEspecial extends Cliente {

   private Cartao cartao;

  public ClienteEspecial(String nome, String cpf, Date dtNasc, Cartao cartao) {
       super(nome, cpf, dtNasc);
       this.cartao = cartao;
     
    }

    public Cartao getCartao() {
        return cartao;
    }

    public void setCartao(Cartao cartao) {
        this.cartao = cartao;
    }

}
