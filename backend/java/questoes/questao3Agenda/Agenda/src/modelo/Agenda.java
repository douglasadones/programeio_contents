package modelo;

import javax.swing.JOptionPane;

public class Agenda {
    private Contato contato;

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato novoContato) {
        contato = novoContato;
    }

    public void dadosDaAgenda() {
        JOptionPane.showMessageDialog(null, "Tipo: "+this.contato.getTipo()+"\nNúmero: "+this.contato.getNumero());
    }
}
