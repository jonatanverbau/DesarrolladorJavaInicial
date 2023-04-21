package Pronosticos;

public class Partido {
Equipo equipoLocal;
Equipo equipoVisitante;
int golesLocal;
int golesVisitante;
Enum resultado;

    public Partido() {
    }

    public String getEquipoLocal() {
        return equipoLocal.getNombre();
    }

    public String getEquipoVisitante() {
        return equipoVisitante.getNombre();
    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public void setGolesLocal(int golesLocal){
        this.golesLocal = golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public void setGolesVisitante(int golesVisitante){
        this.golesVisitante = golesVisitante;
    }

    public Enum resultado(Equipo rEquipo) {
        if (golesLocal == golesVisitante) {
                resultado = ResultadoEnum.EMPATE;
            } else if (golesLocal < golesVisitante) {
                resultado = ResultadoEnum.DERROTA;
            } else if (golesLocal > golesVisitante){
                resultado = ResultadoEnum.VICTORIA;
            } 
        return resultado;
    }
}