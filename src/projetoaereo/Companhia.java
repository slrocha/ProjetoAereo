
package projetoaereo;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;

public class Companhia {
   
    private String Nome;

    public static final String PROP_NOME = "Nome";

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        String oldNome = this.Nome;
        this.Nome = Nome;
        propertyChangeSupport.firePropertyChange(PROP_NOME, oldNome, Nome);
    }

    private transient final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

    private String CNPJ;

    public static final String PROP_CNPJ = "CNPJ";

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        String oldCNPJ = this.CNPJ;
        this.CNPJ = CNPJ;
        propertyChangeSupport.firePropertyChange(PROP_CNPJ, oldCNPJ, CNPJ);
    }

}
