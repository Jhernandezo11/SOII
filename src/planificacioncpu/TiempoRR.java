package planificacioncpu;

public class TiempoRR {
    int tIni, tFin, tEnt, tRes;
    String proceso;

    public TiempoRR(int tIni, int tFin, String proceso, int tEnt, int tRes) {
        this.tIni = tIni;
        this.tFin = tFin;
        this.proceso = proceso;
        this.tEnt = tEnt;
        this.tRes = tRes;
    }

    public int gettIni() {
        return tIni;
    }

    public void settIni(int tIni) {
        this.tIni = tIni;
    }

    public int gettFin() {
        return tFin;
    }

    public void settFin(int tFin) {
        this.tFin = tFin;
    }

    public String getProceso() {
        return proceso;
    }

    public void setProceso(String proceso) {
        this.proceso = proceso;
    }
    
}
