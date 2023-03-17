package Principal;

import java.util.ArrayList;

public class LineaTelefonica {
    private ArrayList<Integer> numeroLlamadasRealizadas;
    private ArrayList<Integer> costoLlamada;

    public LineaTelefonica() {
        this.numeroLlamadasRealizadas = new ArrayList<>();
        this.costoLlamada = new ArrayList<>();
    }

    public ArrayList<Integer> getNumeroLlamadasRealizadas() {
        return numeroLlamadasRealizadas;
    }

    public void registrarLlamada(int duracion) {
        this.numeroLlamadasRealizadas.add(duracion);
    }

    public void añadirCostoLlamada(int costo){
        this.costoLlamada.add(costo);
    }

    public void reiniciar(){
        this.costoLlamada.clear();
        this.numeroLlamadasRealizadas.clear();
    }
    @Override
    public String toString() {
        return "LineaTelefonica{" +
                "numeroLlamadasRealizadas=" + numeroLlamadasRealizadas +
                ", costoLlamada=" + costoLlamada +
                '}';
    }
}
