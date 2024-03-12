import javax.swing.JOptionPane;

public class ControleRemoto {
    Televisao tv;
    ControleRemoto(Televisao tv){
        this.tv = tv;
    }

    public void ligarDesligarTv(){
        this.tv.setStatusTv();
    }

    public void aumentarVolume() {
        if (this.tv.getVolume() < 100) {
            this.tv.setVolume(this.tv.getVolume() + 1);
        } else {
            JOptionPane.showMessageDialog(null, "Volume Máximo");
        }
    }

    public void diminuirVolume() {
        if (this.tv.getVolume() != 0) {
            this.tv.setVolume(this.tv.getVolume()-1);
        } else {
            JOptionPane.showMessageDialog(null, "Tv Mutada");
        }
    }

    public void proximoCanal() {
        this.tv.setCanal(this.tv.getCanal()+1);
    }

    public void canalAnterior() {
        this.tv.setCanal(this.tv.getCanal()-1);
    }

    public void novoCanal(int novoCanal) {
        if (this.tv.getCanal() != novoCanal) {
            this.tv.setCanal(novoCanal);
        } else {
            JOptionPane.showMessageDialog(null, "Canal atual");
        }
    }

    public void informacoesDaTv() {
        String estatos = (this.tv.getStatusTv() == true )? "Ligada" : "Desligada";
        String informacoes = "Status da Tv: "+estatos+"\nCanal atual: "+this.tv.getCanal()+"\nVolume atual: "+this.tv.getVolume();
        JOptionPane.showMessageDialog(null,informacoes);
    }
}