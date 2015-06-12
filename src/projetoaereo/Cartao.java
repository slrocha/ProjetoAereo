
package projetoaereo;


public class Cartao {

    private int id;
    private int num_pontos;

    public Cartao(int id, int num_pontos) {
        this.id = id;
        this.num_pontos = num_pontos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNum_pontos() {
        return num_pontos;
    }

    public void setNum_pontos(int num_pontos) {
        this.num_pontos = num_pontos;
    }
     
}
