package TrabajoIntegrador.src;
public class Partido {
    private Equipo equipoLocal;
    private Equipo equipoVisitante;
    private int golesLocal;
    private int golesVisitante;

    public Partido(Equipo equipoLocal, Equipo equipoVisitante, int golesLocal, int golesVisitante) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
    }

    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public ResultadoEnum getResultado(Equipo equipo) {
        if (equipo == equipoLocal) {
            if (golesLocal > golesVisitante) {
                return ResultadoEnum.VICTORIA;
            } else if (golesLocal < golesVisitante) {
                return ResultadoEnum.DERROTA;
            } else {
                return ResultadoEnum.EMPATE;
            }
        } else if (equipo == equipoVisitante) {
            if (golesVisitante > golesLocal) {
                return ResultadoEnum.VICTORIA;
            } else if (golesVisitante < golesLocal) {
                return ResultadoEnum.DERROTA;
            } else {
                return ResultadoEnum.EMPATE;
            }
        } else {
            throw new IllegalArgumentException("El equipo no participó en este partido");
        }
    }
}