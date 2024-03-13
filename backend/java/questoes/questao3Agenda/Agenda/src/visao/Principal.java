package visao;

import modelo.Agenda;
import modelo.Contato;

public class Principal {
    public static void main(String[] args) throws Exception {
        Agenda novaAgente = new Agenda();
        Contato contato = new Contato();
        contato.setNumero(123132123);
        contato.setTipo("telefone");
        novaAgente.setContato(contato);
        novaAgente.dadosDaAgenda();
    }
}
