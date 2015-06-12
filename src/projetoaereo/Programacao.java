
package projetoaereo;
import java.util.Date;

public class Programacao {

    private Date date_chegada;
    private Date date_saida;
    private String hora_chegada;
    private String hora_saida;

    public Programacao(Date date_chegada, Date date_saida, String hora_chegada, String hora_saida) {
        this.date_chegada = date_chegada;
        this.date_saida = date_saida;
        this.hora_chegada = hora_chegada;
        this.hora_saida = hora_saida;
    }

    public Date getDate_chegada() {
        return date_chegada;
    }

    public void setDate_chegada(Date date_chegada) {
        this.date_chegada = date_chegada;
    }

    public Date getDate_saida() {
        return date_saida;
    }

    public void setDate_saida(Date date_saida) {
        this.date_saida = date_saida;
    }

    public String getHora_chegada() {
        return hora_chegada;
    }

    public void setHora_chegada(String hora_chegada) {
        this.hora_chegada = hora_chegada;
    }

    public String getHora_saida() {
        return hora_saida;
    }

    public void setHora_saida(String hora_saida) {
        this.hora_saida = hora_saida;
    }
   

}
