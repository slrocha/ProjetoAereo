
package projetoaereo;


public class Voo {
   
    private String city_orig;
    private String city_dest;
    private int identificacao;
    private float valor_real;
    private float valor_ponto;
    private String date_chegada;
    private String date_saida;

    public Voo(String city_orig, String city_dest, int identificacao, float valor_real, float valor_ponto) {
        this.city_orig = city_orig;
        this.city_dest = city_dest;
        this.identificacao = identificacao;
        this.valor_real = valor_real;
        this.valor_ponto = valor_ponto;
        this.date_chegada = date_chegada;
        this.date_saida = date_saida;
    }

    public String getCity_orig() {
        return city_orig;
    }

    public void setCity_orig(String city_orig) {
        this.city_orig = city_orig;
    }

    public String getCity_dest() {
        return city_dest;
    }

    public void setCity_dest(String city_dest) {
        this.city_dest = city_dest;
    }

    public int getIdentificacao() {
        return identificacao;
    }
    
    public void setIdentificacao(int identificacao) {
        this.identificacao = identificacao;
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

    public String getDate_chegada() {
        return date_chegada;
    }

    public void setDate_chegada(String date_chegada) {
        this.date_chegada = date_chegada;
    }

    public String getDate_saida() {
        return date_saida;
    }

    public void setDate_saida(String date_saida) {
        this.date_saida = date_saida;
    }
       
}
