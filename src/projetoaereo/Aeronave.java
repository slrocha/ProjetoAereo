
package projetoaereo; 


public class Aeronave {
     private String prefixo;
     private  int qntd_prim_clas;
     private int qntd_clas_econ;

    public Aeronave(String prefixo, int qntd_prim_clas, int qntd_clas_econ) {
        this.prefixo = prefixo;
        this.qntd_prim_clas = qntd_prim_clas;
        this.qntd_clas_econ = qntd_clas_econ;
    }

    public String getPrefixo() {
        return prefixo;
    }

    public int getQntd_clas_econ() {
        return qntd_clas_econ;
    }

    public int getQntd_prim_clas() {
        return qntd_prim_clas;
    }

    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }

    public void setQntd_clas_econ(int qntd_clas_econ) {
        this.qntd_clas_econ = qntd_clas_econ;
    }

    public void setQntd_prim_clas(int qntd_prim_clas) {
        this.qntd_prim_clas = qntd_prim_clas;
    }
     
           
    
}
