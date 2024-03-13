import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        String A = leitor.nextLine(); // Se tiver um espaço ele não pega os outros itens
        String B = leitor.nextLine(); // Pega toda a linha de string independente se tem ou não espaços.
        int C = leitor.nextInt(); // Ler int
        System.out.println("Hello, World!" + A);
    }
}
