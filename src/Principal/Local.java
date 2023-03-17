package Principal;

public class Local extends LineaTelefonica{
    private int valorMinutoLoc;

    public Local() {
        this.valorMinutoLoc = 60;
    }

    public int getValorMinutoLoc() {
        return valorMinutoLoc;
    }

    public void setValorMinutoLoc(int valorMinutoLoc) {
        this.valorMinutoLoc = valorMinutoLoc;
    }

    @Override
    public String toString() {
        return "Local{" +
                "valorMinutoLoc=" + valorMinutoLoc +
                '}'+super.toString();
    }
}
