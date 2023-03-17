package Principal;

public class Celular extends LineaTelefonica{
    private int valorMinutoCel;

    public Celular() {
        this.valorMinutoCel = 850;
    }

    public int getValorMinutoCel() {
        return valorMinutoCel;
    }

    public void setValorMinutoCel(int valorMinutoCel) {
        this.valorMinutoCel = valorMinutoCel;
    }

    @Override
    public String toString() {
        return "Celular{" +
                "valorMinutoCel=" + valorMinutoCel +
                '}'+super.toString();
    }
}
