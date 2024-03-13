package modelo;

import javax.swing.JOptionPane;

public class Contato {
    private String tipo;
    private int numero;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int novoNumero) {
        this.numero = novoNumero;
    }

    public void dadosDoContato() {
        JOptionPane.showMessageDialog(null, "Tipo: "+this.numero+"\nNúmero: "+this.numero);
    }
}
