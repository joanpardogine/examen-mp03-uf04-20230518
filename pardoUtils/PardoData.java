package pardoUtils;

public class PardoData {
    int dia;
    int mes;
    int any;
    int hora;
    int minuts;
    int segons;

    public PardoData(int diaRebut, int mesRebut, int anyRebut, int horaRebut, int minutsRebut, int segonsRebut){
        this.dia = diaRebut;
        this.mes = mesRebut;
        this.any = anyRebut;
        this.hora = horaRebut;
        this.minuts = minutsRebut;
        this.segons = segonsRebut;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAny() {
        return any;
    }

    public void setAny(int any) {
        this.any = any;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuts() {
        return minuts;
    }

    public void setMinuts(int minuts) {
        this.minuts = minuts;
    }

    public int getSegons() {
        return segons;
    }

    public void setSegons(int segons) {
        this.segons = segons;
    }

    public String tornaMes(){
        String[] nomMesos = {"gener","febrer","març",
                "abril","maig","juny","juliol","agost","setembre",
                "octubre","novembre","desembre"};

        return nomMesos[this.mes-1];
    }


}
