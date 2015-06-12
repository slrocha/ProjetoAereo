
package projetoaereo;

import java.util.Date;


public class Voo {
   
    private String city_orig;
    private String city_dest;
    private int identificacao;
    private Passagem[] passagem = new Passagem[100]; //100 passagens para cada voo


    public Voo(String city_orig, String city_dest, int identificacao) {
        this.city_orig = city_orig;
        this.city_dest = city_dest;
        this.identificacao = identificacao;
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
}
