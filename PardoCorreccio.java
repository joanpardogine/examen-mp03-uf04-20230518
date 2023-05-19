import java.util.Scanner;

import pardoUtils.*;


public class PardoCorreccio {
    
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        int comptador = 0; 
        char resposta;
        System.out.println("Avaluació <CognomAlumne>mostraVector ");
        char[] vPerCorreccio = { 'T', 'G', 'T', 'C', 'C', 'T', 'G', 'A',
        'G', 'G', 'A', 'T', 'C', 'A', 'T', 'A' };
        System.out.println("La sortida hauria de ser: ");
        for (int i = 0; i < vPerCorreccio.length; i++) {
            System.out.print(vPerCorreccio[i]);
            if (i<vPerCorreccio.length - 1){
                System.out.print("-");
            }
        }
        
        System.out.println("\nL'execució de l'alumne és:");
        
        PardoEines.pardoMostraVector(vPerCorreccio);
        
        System.out.print("\nÉs correcte (S/N) ? ");

        resposta = Character.toUpperCase(teclat.next().charAt(0));

        if (resposta == 's'){
            comptador ++;
        }
        
        System.out.println("El resultat és " + comptador);

        teclat.close();
    }
}
