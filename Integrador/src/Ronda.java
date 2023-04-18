package TrabajoIntegrador.src;

import java.util.ArrayList;
import java.util.List;

public class Ronda {
    private List<Partido> partidos;

    public Ronda() {
        this.partidos = new ArrayList<>();
    }

    public void agregarPartido(Partido partido) {
        this.partidos.add(partido);
    }

    public List<Partido> getPartidos() {
        return partidos;
    }
}