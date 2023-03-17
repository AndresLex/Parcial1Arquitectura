package Principal;

public class Distancia extends LineaTelefonica{
    private int valorMinutoDis;

    public Distancia() {
        this.valorMinutoDis = 1200;
    }

    public int getValorMinutoDis() {
        return valorMinutoDis;
    }

    public void setValorMinutoDis(int valorMinutoDis) {
        this.valorMinutoDis = valorMinutoDis;
    }

    @Override
    public String toString() {
        return "Distancia{" +
                "valorMinutoDis=" + valorMinutoDis +
                '}'+super.toString();
    }
}
