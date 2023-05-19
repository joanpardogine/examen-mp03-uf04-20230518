import java.util.Scanner;
import pardoUtils.PardoData;
import pardoUtils.PardoEines;
import pardoUtils.Llegir;

public class PardoExamen {
    public static void main(String[] args) {
        
        Scanner teclat = new Scanner(System.in);
        int dia;
        int mes;
        int any;
        int hora;
        int minuts;
        int segons;
        
        final int NOMBRE_1 = 1;
        final int MAX_DIA = 31;
        final int MAX_MES = 12;
        final int MAX_HORA = 24;
        final int MAX_MIN_SEG = 60;

        dia = Llegir.enterPositiuInterval("Entra el dia: ", NOMBRE_1, MAX_DIA);
        mes = Llegir.enterPositiuInterval("Entra el mes: ", NOMBRE_1, MAX_MES);
        any = Llegir.enterPositiuInterval("Entra el any: ", NOMBRE_1, 3000);
        hora = Llegir.enterPositiuInterval("Entra el hora: ", NOMBRE_1, MAX_HORA);
        minuts = Llegir.enterPositiuInterval("Entra el minuts: ", NOMBRE_1, MAX_MIN_SEG);
        segons = Llegir.enterPositiuInterval("Entra el segons: ", NOMBRE_1, MAX_MIN_SEG);

        PardoData dataJoan = new PardoData(dia, mes, any, hora, minuts, segons);
        
        System.out.println("El mes " + dataJoan.getMes() + " té el nom " + dataJoan.tornaMes());

        System.out.println("numero aleatori = " + PardoEines.pardoAletoriEnterRang());
        System.out.println("numero aleatori = " + PardoEines.pardoAletoriEnterRang());
        System.out.println("numero aleatori = " + PardoEines.pardoAletoriEnterRang());
        System.out.println("numero aleatori = " + PardoEines.pardoAletoriEnterRang());
        System.out.println("numero aleatori = " + PardoEines.pardoAletoriEnterRang());
        System.out.println("numero aleatori = " + PardoEines.pardoAletoriEnterRang());
        System.out.println("numero aleatori = " + PardoEines.pardoAletoriEnterRang());
        System.out.println("numero aleatori = " + PardoEines.pardoAletoriEnterRang());
        System.out.println("numero aleatori = " + PardoEines.pardoAletoriEnterRang());
        System.out.println("numero aleatori = " + PardoEines.pardoAletoriEnterRang());
        System.out.println("numero aleatori = " + PardoEines.pardoAletoriEnterRang());
        System.out.println("numero aleatori = " + PardoEines.pardoAletoriEnterRang());
        System.out.println("numero aleatori = " + PardoEines.pardoAletoriEnterRang());
        System.out.println("numero aleatori = " + PardoEines.pardoAletoriEnterRang());
        System.out.println("numero aleatori = " + PardoEines.pardoAletoriEnterRang());
        System.out.println("numero aleatori = " + PardoEines.pardoAletoriEnterRang());
        System.out.println("numero aleatori = " + PardoEines.pardoAletoriEnterRang());
        System.out.println("numero aleatori = " + PardoEines.pardoAletoriEnterRang());
        System.out.println("numero aleatori = " + PardoEines.pardoAletoriEnterRang());
        System.out.println("numero aleatori = " + PardoEines.pardoAletoriEnterRang());

    }
}
