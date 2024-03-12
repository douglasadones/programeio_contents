public class Televisao {
    private int volume = 50;
    private int canal = 10;
    private boolean ligada = false;

    public int getCanal() {
        return this.canal;
    }

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int novoVolume) {
        this.volume = novoVolume;
    }

    public void setCanal(int novoCanal) {
        this.canal = novoCanal;
    }

    public boolean getStatusTv(){
        return ligada;
    }

    public void setStatusTv() {
        this.ligada = !this.ligada;
    }
}
