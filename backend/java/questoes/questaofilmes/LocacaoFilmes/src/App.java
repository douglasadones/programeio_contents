import cinema.Filme;
import cinema.LocacaoFilmes;

public class App {
    public static void main(String[] args) throws Exception {
        LocacaoFilmes locacaoOnline = new LocacaoFilmes();

        Filme filme1 = new Filme("Oppenheimer");

        Filme filme2 = new Filme("Kung Fu Panda 4");

        Filme filme3 = new Filme("Divertida Mente 2");

        Filme filme4 = new Filme("Robôs");

        Filme filme5 = new Filme("Aladdin");

        Filme filme6 = new Filme("Mulan");

        Filme filme7 = new Filme("O Iluminado");

        Filme filme8 = new Filme("Tempos Modernos");

        Filme filme9 = new Filme("Laranja Mecânica");

        Filme filme10 = new Filme("O Mágico de Oz");

        locacaoOnline.setLancamentos(filme1);
        locacaoOnline.setLancamentos(filme2);
        locacaoOnline.setLancamentos(filme3);

        locacaoOnline.setInfantil(filme4);
        locacaoOnline.setInfantil(filme5);
        locacaoOnline.setInfantil(filme6);

        locacaoOnline.setPromocao(filme7);
        locacaoOnline.setPromocao(filme8);
        locacaoOnline.setPromocao(filme9);
        locacaoOnline.setPromocao(filme10);
        
        locacaoOnline.getLancamentos();
        locacaoOnline.getInfantil();
        locacaoOnline.getPromocao();
    }
}
