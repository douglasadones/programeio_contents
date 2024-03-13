import cinema.Filme;
import cinema.LocacaoFilmes;

public class App {
    public static void main(String[] args) throws Exception {
        LocacaoFilmes teste = new LocacaoFilmes();
        Filme tese2 = new Filme();
        tese2.setNome("qasdasd");
        tese2.setPreco(123123);

        teste.setLancamentos(tese2);
        teste.getLancamentos();
    }
}
