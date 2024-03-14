import cinema.Filme;
import cinema.LocacaoFilmes;

public class App {
    public static void main(String[] args) throws Exception {
        LocacaoFilmes teste = new LocacaoFilmes();
        Filme filme1 = new Filme();
        filme1.setNome("Filme 1");
        filme1.setPreco(123123);

        Filme filme2 = new Filme();
        filme1.setNome("Filme 2");
        filme1.setPreco(123123);

        teste.setLancamentos(filme1);
        teste.setLancamentos(filme2);

        teste.getLancamentos();
    }
}
