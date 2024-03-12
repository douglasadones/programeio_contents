public class Televisao {
    private int getVolume = 50;
    private int canal = 10;
    private boolean ligada = false;

    public int getCanal() {
        return this.canal;
    };

    public int getVolume() {
        return this.getVolume;
    }

    public void setVolume(int novoVolume) {
        this.getVolume = novoVolume;
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
