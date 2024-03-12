public class App {
    public static void main(String[] args) throws Exception {
        Televisao tv1 = new Televisao();
        ControleRemoto controle = new ControleRemoto(tv1);

        controle.informacoesDaTv();

        controle.ligarDesligarTv();

        controle.aumentarVolume();
        controle.proximoCanal();
        controle.informacoesDaTv();

        // Loop para deixar a tv com volume no 0
        do {
            controle.diminuirVolume();
        } while (tv1.getVolume() !=0);

        // tento diminuir mais o volume
        controle.diminuirVolume();

        controle.informacoesDaTv();

        controle.novoCanal(77);
        controle.informacoesDaTv();

        controle.ligarDesligarTv();

        controle.informacoesDaTv();
    }
}
