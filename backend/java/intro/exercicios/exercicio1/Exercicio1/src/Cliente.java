import java.time.LocalDateTime;
import javax.swing.JOptionPane;

public class Cliente {
    String nome;
    int cpf;
    int telefone;
    String sexo;
    int anoDeNascimento;
    int idade;

    Cliente(String nome, int cpf, int telefone, String sexo, int nascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.sexo = sexo;
        this.anoDeNascimento = nascimento;
        LocalDateTime anoAtual = LocalDateTime.now();
        this.idade = anoAtual.getYear() - this.anoDeNascimento;
    }

    public void mostrarDados() {
        JOptionPane.showMessageDialog(null, "Nome: " + this.nome + "\nSexo: " + this.sexo + "\nCPF: " + this.cpf + "\nTelefone: " + this.telefone + "\nAno de Nascimento: " + anoDeNascimento);
    }

    public void idadeAtual() {
        JOptionPane.showMessageDialog(null, "Idade Atual: " + idade + " Ano(s)");
    }

    public void maiorDeIdade() {
        String mensagem;
        if (this.idade < 18) {
            mensagem = "Cliente Menor de Idade";
        } else {
            mensagem = "Cliente Maior de Idade";
        }
        JOptionPane.showMessageDialog(null, mensagem);
    }

}
